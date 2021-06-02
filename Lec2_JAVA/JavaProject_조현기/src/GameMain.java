import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class GameMain extends Frame{
	MenuBar menu;Menu gamelevel;MenuItem Easy;MenuItem Mid;MenuItem Hard;
	Menu record;MenuItem Easyrecord;MenuItem Midrecord;MenuItem Hardrecord;
	Panel Top;
	Panel Bottom;
	Canvas canvas;
	Button face;
	String emoji;
	
	Label timer;
	
	int level[] = {10, 20, 30};
	int mine_num[] = {10, 50, 100};
	int LVNUM = 0;
	Button[][] btn;
	GameObject[][] game;
	boolean isLose = false;
	int cnt, target;
	boolean firstclick;
	
	
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension screenSize = tk.getScreenSize();
			
	GameMain(int LV){
		super("MineSwipper");
		LVNUM = LV;
		
		this.setSize(520, 610);
		if(LVNUM == 1) this.setSize(820, 910);
		else if(LVNUM == 2) this.setSize(1220, 1010);
		this.setBackground(Color.white);

		this.setLocation((screenSize.width-this.getWidth())/2, (screenSize.height-this.getHeight())/2);
		addWindowListener(new WindowAdapter(){	//�씡紐낇겢�옒�뒪瑜� �궗�슜�븯�뒗 諛⑸쾿!
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		}); 	
		this.setLayout(null);
		
		//****************************************************************************硫붾돱諛�
		menu = new MenuBar();
		this.setMenuBar(menu);
		
		gamelevel = new Menu("Level");
		Easy = new MenuItem("Easy"); Easy.addActionListener(new MenuBar_event(0));
		Mid = new MenuItem("Mid"); Mid.addActionListener(new MenuBar_event(1));
		Hard = new MenuItem("Hard"); Hard.addActionListener(new MenuBar_event(2));
		menu.add(gamelevel);gamelevel.add(Easy);gamelevel.add(Mid);gamelevel.add(Hard);
		
		record = new Menu("Record");
		Easyrecord = new MenuItem("Easyrecord");
		Midrecord = new MenuItem("Midrecord");
		Hardrecord = new MenuItem("Hardrecord");
		menu.add(record);record.add(Easyrecord);record.add(Midrecord);record.add(Hardrecord);
		
		
		//****************************************************************************TOP
		Top = new Panel();
		Top.setBounds(0, 50, this.getWidth()-10, 50);
		Top.setBackground(Color.LIGHT_GRAY);
		Top.setLayout(null);
		this.add(Top);
		
		emoji = new String("Reset");
		face = new Button();
		face.setSize(35, 35);
		face.setLocation((this.getWidth()-face.getWidth())/2, 15);
		face.setLabel(emoji);
		face.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new GameMain(LVNUM);
			}
		});
		Top.add(face);
		
		timer = new Label("Timer");
		timer.setSize(150, 50);
		timer.setLocation(this.getWidth() - timer.getWidth()-10, 0);
		timer.setBackground(Color.black);
		timer.setForeground(Color.YELLOW);
		timer.setFont(new Font("SansSerif", Font.BOLD, 20));
		timer.setAlignment(Label.RIGHT);
		Top.add(timer);
	
		
		//****************************************************************************BOTTOM
		Bottom = new Panel();
		Bottom.setBounds(10, 100, this.getWidth()-20, this.getHeight()-Top.getHeight()-60);
		Bottom.setBackground(Color.GREEN);
		//Bottom.setLayout(new GridLayout(level[LVNUM], level[LVNUM]));
		Bottom.setLayout(null);
		this.add(Bottom);
		this.setVisible(true);
		
		//*****************************************************************************Button
		int i, j;
		btn = new Button[level[LVNUM]][level[LVNUM]];
		game = new GameObject[level[LVNUM]][level[LVNUM]];
		
		for (i=0;i<level[LVNUM];i++) {
			for(j=0;j<level[LVNUM];j++) {
				btn[i][j] = new Button();
				game[i][j] = new GameObject();
				btn[i][j].setBounds(((Bottom.getWidth()/level[LVNUM])*j), ((Bottom.getHeight()/level[LVNUM])*i), Bottom.getWidth()/level[LVNUM],  (Bottom.getHeight()/level[LVNUM]));
				btn[i][j].addMouseListener(new ButtonEvent());
				btn[i][j].setFont(new Font("Serif", Font.BOLD, 20));
				game[i][j].minenum.setBounds(((Bottom.getWidth()/level[LVNUM])*j), ((Bottom.getHeight()/level[LVNUM])*i), Bottom.getWidth()/level[LVNUM],  (Bottom.getHeight()/level[LVNUM]));
				Bottom.add(btn[i][j]);
				Bottom.add(game[i][j].minenum);
				//btn[i][j].minenum.setVisible(false);
				
			}
		}
		
		
		//*********************************************************************************************** 留� �깮�꽦
		//***********************************************************************************************
		//buildMap
		setMine();
			//setmine
		setNumbers();
			//setnumbers
		
		firstclick = true;
		target = level[LVNUM]*level[LVNUM] - mine_num[LVNUM];
	}
	
	public void setMine() {
		int i, x, y;
		for(i=0;i<mine_num[LVNUM];i++) {
			x = (int)(Math.random()*level[LVNUM]);
			y = (int)(Math.random()*level[LVNUM]);
			
			if(game[x][y].ismine) {
				i--;
				continue;
			}
			
			game[x][y].ismine = true;
			//btn[x][y].setLabel("X");
		}
	}
	
	public void setNumbers() {
		int a, b, c, d, startI, endI, startJ, endJ;
		int count;
		for(a=0;a<level[LVNUM];a++) {
			for(b=0;b<level[LVNUM];b++) {
				count = 0;
				
				if(a-1 <0) startI = 0;
				else startI = a-1;
				if(b-1<0) startJ = 0;
				else startJ = b-1;
				if(a+1 >= level[LVNUM]) endI = level[LVNUM]-1;
				else endI = a+1;
				if(b+1 >= level[LVNUM]) endJ = level[LVNUM]-1;
				else endJ = b+1;
				for(c = startI; c<=endI; c++) {
					for(d = startJ; d<=endJ; d++) {
						if(game[c][d].ismine) count++;
					}
				}
				
				if(count < 1) game[a][b].minenum.setText("0");
				else if(game[a][b].ismine) game[a][b].minenum.setText("X");
				else game[a][b].minenum.setText(""+count);
				//btn[a][b].setLabel(game[a][b].minenum.getText());
			}
		}
	}
	
	public void clicked(int i, int j) {
		//System.out.println("("+game[i][j].ismine+","+firstclick);
		int a, b,startI, endI, startJ, endJ;
		if(game[i][j].isclicked) return;
		game[i][j].isclicked = true;
		if(game[i][j].ismine) {
			if(firstclick) {
				while(game[i][j].ismine) {
					for(int index=0;index<btn.length;index++) {
						for(int jndex=0;jndex<btn[index].length;jndex++) {
							game[index][jndex].ismine = false;
						}
					}
					setMine();
					setNumbers();
				}
			}
			else {
				//寃뚯엫 醫낅즺~~~~~~~~~~~~~~~~~~~~~~~~~~
				btn[i][j].setVisible(false);
				isLose = true;
				System.out.println("YOU LOSE!!");
				for(int index=0;index<btn.length;index++) {
					for(int jndex=0;jndex<btn[index].length;jndex++) {
						if(game[index][jndex].ismine) {
							btn[index][jndex].setLabel("X");
							
						}
					}
				}
				new OpenMessage(isLose);
			}
		}
		
		btn[i][j].setVisible(false);
		game[i][j].minenum.setVisible(true);
		
		firstclick=false;
		

		if(i-1 <0) startI = 0;
		else startI = i-1;
		if(j-1<0) startJ = 0;
		else startJ = j-1;
		if(i+1 >= level[LVNUM]) endI = level[LVNUM]-1;
		else endI = i+1;
		if(j+1 >= level[LVNUM]) endJ = level[LVNUM]-1;
		else endJ = j+1;
		for(a = startI; a<=endI; a++) {
			for(b = startJ; b<=endJ; b++) {
				if(game[i][j].minenum.getText() == "0")  clicked(a, b);
				if(game[a][b].minenum.getText() == "0") clicked(a, b);
			}
		}
		
		
		cnt++;
		if(cnt == target && !isLose) {
			System.out.println("You Win!!");
			new OpenMessage(isLose);
		}
	}

	class MenuBar_event implements ActionListener{
		int num;
		MenuBar_event(int num){
			this.num = num;
		}
		public void actionPerformed(ActionEvent e) {
			dispose();
			new GameMain(num);
		}
	}
	
	class ButtonEvent extends MouseAdapter {
		boolean mouseflag, firsttime;
		char ch = 9873;
		int i, j;
		ButtonEvent(){
			mouseflag = false;
			firsttime = true;
		}
		public void mouseClicked(MouseEvent arg0) {
			Button bt = (Button)arg0.getSource();;
			if(arg0.getModifiers() == 16 && !mouseflag) {
				//System.out.print("�쇊履�");	
	
				i = getI(bt.getY(), bt.getHeight());
				j = getJ(bt.getX(), bt.getWidth());
				
				clicked(i, j);
			}
			
			else if(arg0.getModifiers() == 4) {
				if(mouseflag) {
					bt.setLabel("");
					mouseflag = false;
				}
				else {
					bt.setLabel(""+ch);
					mouseflag = true;
				}
			}
		}
	}
	
	public int getJ(int x, int width) {
		return x/width;
	}
	public int getI(int y, int height) {
		return y/height;	
	}
}
