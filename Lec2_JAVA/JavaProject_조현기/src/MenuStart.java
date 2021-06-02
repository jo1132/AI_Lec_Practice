import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;

public class MenuStart extends Frame{
	Toolkit tk = Toolkit.getDefaultToolkit();
	Image img;
	
	MenuStart(String string){
		super(string);
		
		img = tk.getImage("images/icon.png");
		//******************************************************************************************Frame 초기화 부분
		Dimension screenSize = tk.getScreenSize();
		this.setSize(625, 575);
		this.setLocation((screenSize.width-this.getWidth())/2, (screenSize.height-this.getHeight())/2);
		this.setLayout(null);
		this.setResizable(false);
		this.setBackground(Color.white);
		addWindowListener(new WindowAdapter(){	//익명클래스를 사용하는 방법!
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0); 		//완전 종료
			}
		}); 
		

		this.setIconImage(new ImageIcon("images/icon.png").getImage());
		
		img = tk.getImage("images/java_logo.jpg");
		//*************************************************************************************8*******MenuBar부분
		MenuBar mb = new MenuBar();
		this.setMenuBar(mb);
		
		Menu mFile = new Menu("파일");
			MenuItem miOpen = new MenuItem("열기", new MenuShortcut('O', true));
			MenuItem miExit = new MenuItem("닫기", new MenuShortcut('E'));
			miExit.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					System.exit(0);	
				}
			});
			
			mFile.add(miOpen);
			mFile.addSeparator();//________________________
			mFile.add(miExit);
			
			
		Menu mEvent1 = new Menu("이벤트기본");
			MenuItem miEvent1_1 = new MenuItem("배경색변경프로그램(ColorEvent)");
			miEvent1_1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new ColorEvent("배경색 변경 프로그램");
				}
			});
			mEvent1.add(miEvent1_1);
			
			MenuItem miEvent1_2 = new MenuItem("Chat이벤트 프로그램(ChatEvent)");
			miEvent1_2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new ChatEvent("Chat Event Test");
				}
			});
			mEvent1.add(miEvent1_2);
			
			MenuItem miEvent1_3 = new MenuItem("Constella List 프로그램(StarEventTest)");
			miEvent1_3.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new StarEventTest("constella");
				}
			});
			mEvent1.add(miEvent1_3);
			
			MenuItem miEvent1_4 = new MenuItem("Christmas Image 프로그램(Christmas)");
			miEvent1_4.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new Christmas("Christmas");
				}
			});
			mEvent1.add(miEvent1_4);
			
			MenuItem miEvent1_5 = new MenuItem("DrawLine 프로그램(DrawLine)");
			miEvent1_5.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new DrawLine("DrawLine");
				}
			});
			mEvent1.add(miEvent1_5);
			
			
		Menu mEvent2 = new Menu("이벤트활용");
			MenuItem miEvent2_1 = new MenuItem("Image Graphic 프로그램(VendingMachine)");
			miEvent2_1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new VendingMachine("SpongeBob Vending Machine");
				}
			});
			mEvent2.add(miEvent2_1);
			
			MenuItem miEvent2_2 = new MenuItem("MineSweeper~(GameMain)");
			miEvent2_2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new GameMain(0);
				}
			});
			mEvent2.add(miEvent2_2);
			
			MenuItem miEvent2_3 = new MenuItem("별자리별 오늘의 운세(StarEventTest2)");
			miEvent2_3.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new StarEventTest2("별자리별 오늘의 운세!");
				}
			});
			mEvent2.add(miEvent2_3);
			
			MenuItem miEvent2_4 = new MenuItem("그림판(DrawLine2)");
			miEvent2_4.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new DrawLine2("그림판");
				}
			});
			mEvent2.add(miEvent2_4);
			
			
		Menu mHelp = new Menu("도움말");
			MenuItem miEvent3_1 = new MenuItem("도움말");
			miEvent3_1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new Help("도움말");
				}
			});
			mHelp.add(miEvent3_1);
			
			
		mb.add(mFile);mb.add(mEvent1);mb.add(mEvent2);mb.add(mHelp);
		
		
		
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		int imgW = img.getWidth(this);
		int imgH = img.getHeight(this);
		
		g.drawImage(img, (this.getWidth()-imgW)/2, (this.getHeight()-imgH)/2 + 25,  this);
	}
	
	class Exit_Event implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.exit(0);	
		}
	}
	public static void main(String[] args) {
		MenuStart menu = new MenuStart("Java Project"); 
		
		new Login("로그인");
		//개발 후 주석을 제거한다.
	}

}
