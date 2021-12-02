import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;

public class MenuStart extends Frame{
	Toolkit tk = Toolkit.getDefaultToolkit();
	Image img;
	
	MenuStart(String string){
		super(string);
		
		img = tk.getImage("images/icon.png");
		//******************************************************************************************Frame �ʱ�ȭ �κ�
		Dimension screenSize = tk.getScreenSize();
		this.setSize(625, 575);
		this.setLocation((screenSize.width-this.getWidth())/2, (screenSize.height-this.getHeight())/2);
		this.setLayout(null);
		this.setResizable(false);
		this.setBackground(Color.white);
		addWindowListener(new WindowAdapter(){	//�͸�Ŭ������ ����ϴ� ���!
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0); 		//���� ����
			}
		}); 
		

		this.setIconImage(new ImageIcon("images/icon.png").getImage());
		
		img = tk.getImage("images/java_logo.jpg");
		//*************************************************************************************8*******MenuBar�κ�
		MenuBar mb = new MenuBar();
		this.setMenuBar(mb);
		
		Menu mFile = new Menu("����");
			MenuItem miOpen = new MenuItem("����", new MenuShortcut('O', true));
			MenuItem miExit = new MenuItem("�ݱ�", new MenuShortcut('E'));
			miExit.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					System.exit(0);	
				}
			});
			
			mFile.add(miOpen);
			mFile.addSeparator();//________________________
			mFile.add(miExit);
			
			
		Menu mEvent1 = new Menu("�̺�Ʈ�⺻");
			MenuItem miEvent1_1 = new MenuItem("�����������α׷�(ColorEvent)");
			miEvent1_1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new ColorEvent("���� ���� ���α׷�");
				}
			});
			mEvent1.add(miEvent1_1);
			
			MenuItem miEvent1_2 = new MenuItem("Chat�̺�Ʈ ���α׷�(ChatEvent)");
			miEvent1_2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new ChatEvent("Chat Event Test");
				}
			});
			mEvent1.add(miEvent1_2);
			
			MenuItem miEvent1_3 = new MenuItem("Constella List ���α׷�(StarEventTest)");
			miEvent1_3.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new StarEventTest("constella");
				}
			});
			mEvent1.add(miEvent1_3);
			
			MenuItem miEvent1_4 = new MenuItem("Christmas Image ���α׷�(Christmas)");
			miEvent1_4.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new Christmas("Christmas");
				}
			});
			mEvent1.add(miEvent1_4);
			
			MenuItem miEvent1_5 = new MenuItem("DrawLine ���α׷�(DrawLine)");
			miEvent1_5.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new DrawLine("DrawLine");
				}
			});
			mEvent1.add(miEvent1_5);
			
			
		Menu mEvent2 = new Menu("�̺�ƮȰ��");
			MenuItem miEvent2_1 = new MenuItem("Image Graphic ���α׷�(VendingMachine)");
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
			
			MenuItem miEvent2_3 = new MenuItem("���ڸ��� ������ �(StarEventTest2)");
			miEvent2_3.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new StarEventTest2("���ڸ��� ������ �!");
				}
			});
			mEvent2.add(miEvent2_3);
			
			MenuItem miEvent2_4 = new MenuItem("�׸���(DrawLine2)");
			miEvent2_4.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new DrawLine2("�׸���");
				}
			});
			mEvent2.add(miEvent2_4);
			
			
		Menu mHelp = new Menu("����");
			MenuItem miEvent3_1 = new MenuItem("����");
			miEvent3_1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new Help("����");
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
		
		new Login("�α���");
		//���� �� �ּ��� �����Ѵ�.
	}

}
