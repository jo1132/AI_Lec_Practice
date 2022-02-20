from fastapi import FastAPI, Form, Request, File, UploadFile
from fastapi.responses import HTMLResponse
from fastapi.templating import Jinja2Templates
from fastapi.staticfiles import StaticFiles

import tensorflow as tf
from tensorflow import keras
from tensorflow.keras.models import Sequential
from keras.models import load_model
from PIL import Image
from keras.preprocessing import image as Kimage
from keras.preprocessing.image import ImageDataGenerator
import numpy as np
import shutil
import pandas as pd

def GetArr(image):
    img_open = Image.open("static/images/"+image.filename)
    img_data = Kimage.img_to_array(img_open)
    img_data = img_data.reshape((1,)+img_data.shape)

    return img_data

def GetBatch(img_arr):
    datagen = ImageDataGenerator(rescale=1./255)
    batch = datagen.flow(img_arr, batch_size=1)
    return batch

def GetWeight(width, height):
    import sklearn
    import joblib
    
    elastic = joblib.load('/home/ubuntu/finalpro/models/get_weight_EN.joblib')
    ridge = joblib.load('/home/ubuntu/finalpro/models/get_weight_Ridge.joblib')
    lasso = joblib.load('/home/ubuntu/finalpro/models/get_weight_Lasso.joblib')
    
    df = pd.DataFrame([width, height]).T
    
    ela = elastic.predict(df)
    rid = ridge.predict(df)
    las = lasso.predict(df)
    
    weight = (ela + rid + las)/3
    return round(weight[0], 2)

def GetFruitInfo(img_data):
    labels = ['apple_fuji',
            'apple_yanggwang',
            'mandarine_hallabong',
            'mandarine_onjumilgam',
            'pear_chuhwang',
            'pear_singo',
            'persimmon_bansi',
            'persimmon_booyu',
            'persimmon_daebong']

    model = tf.keras.models.load_model('/home/ubuntu/finalpro/models/fruit_classification_model')
    
    batch = GetBatch(img_data)
    
    pred = model.predict(batch)
    return labels[pred.argmax()]

def GetFruit(fruit_info):
    return fruit_info.split('_')[0]
def GetName(fruit_info):
    return fruit_info.split('_')[1]

def GetModel(fruit):
    if(fruit == 'apple'):
        return apple_model
    elif(fruit == 'mandarine'):
        return mandarine_model
    elif(fruit == 'pear'):
        return pear_model
    elif(fruit == 'persimmon'):
        return persimmon_model

def GetGrade(fruit, img_arr):
    grade = ['L', 'M', 'S']
    model = GetModel(fruit)
    
    datagen = ImageDataGenerator(rescale=1./255)
    batch = GetBatch(img_arr)
    
    pred = model.predict(batch)
    return grade[pred.argmax()]


app = FastAPI()
app.mount("/static", StaticFiles(directory="static"), name="static")
templates = Jinja2Templates(directory="templates")

#모델 미리 불러오는부분
apple_model = load_model('/home/ubuntu/finalpro/models/apple')
mandarine__model = load_model('/home/ubuntu/finalpro/models/mandarine')
pear_model = load_model('/home/ubuntu/finalpro/models/pear')
persimmon_model = load_model('/home/ubuntu/finalpro/models/persimmon')

@app.get('/')
async def main(req:Request):
    return templates.TemplateResponse("model_test.html",  {"request":req})

@app.post('/imageinsert')
async def model(req:Request, width:float=Form(...), height:float=Form(...),image: UploadFile=File(...)):
    with open("static/images/"+image.filename, "wb") as buffer:
        shutil.copyfileobj(image.file, buffer)

    img_arr = GetArr(image)
    fruit_info = GetFruitInfo(img_arr)
    fruit = GetFruit(fruit_info)
    name = GetName(fruit_info)

    weight = GetWeight(width, height)
    grade = GetGrade(fruit, img_arr)
    
    return templates.TemplateResponse("model_test2.html",  {"request":req, "fruit":fruit, "name":name, "width":width, "height":height, "weight":weight, "grade":grade ,"image":"static/images/"+image.filename})
