import java.lang.*; // java.lang. 패키지 내에는 System, string, Object, Math등 기본 제공되는  것들이 있다.


// 클래스 내에는 1개 이상의 생성자가 있어야 함!
//기본 생성자 인자를 받지않고 초기화하는 생성자이다.
//extends가 없을때 , 자동으로 Object를 상속받게 된다.

// abstract(추상) 클래스는 1개 이상의 abstract(추상) 메소드가 있는 클래스를 의미함!
// 추상클래스를 상속받을 수는 없음!!!!!


public  class Car extends Object{
	int doors;
	String color;
	static int wheels = 4; //명시적 초기화 방법
	private boolean power;
	
	Car(){
		this("Black", 6, false);// 이 this()와 super()는 제일 처음에 나와야 한다. 
		/*
		color = "black";
		doors = 6;
		wheels = 4;
		power = false;
		*/
	}
	
	Car(String color, int doors, boolean power){
		super(); 			// this()가 없는 생성자는 super()를 컴파일러가 넣어준다. 조상의 생성자를 호출해준다.
		this.color = color;
		this.doors = doors;
		this.power = power;
	}
	
	void Start() {
		System.out.println("Car 출발합니다~~");
	}
	
	void Stop() {
		System.out.println("Car 멈춰~~");
	}
	
	boolean IsPowerOn() {
		return this.power;
	}
	  
	//abstract void method();  // abstract(추상, 깡통) 메소드 정의.
							// 메소드의 헤더만 있고, 바디가 없는것
}
