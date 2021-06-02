import java.awt.*;
import java.awt.event.*;

public class Test1 extends Frame{
	
	Canvas canvas;
	Panel pan;
	Toolkit tk = Toolkit.getDefaultToolkit();
	Image img;
	String imgarr[] = {"images/img0.jpg", 
						"images/imgs1.png", 
						"images/imgs2.png", 
						"images/imgs3.png", 
						"images/imgs4.png", 
						"images/imgs5.png", 
						"images/imgs6.png"};

	Button b1, b2, b3, b4, b5, b6, b7;
	Test1(String string){
		super(string);
		
		Dimension screenSize = tk.getScreenSize();
		this.setSize(625, 575);
		this.setLocation((screenSize.width-this.getWidth())/2, (screenSize.height-this.getHeight())/2);
		this.setLayout(null);
		this.setBackground(Color.white);
		addWindowListener(new WindowAdapter(){	//익명클래스를 사용하는 방법!
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0); 		//완전 종료
			}
		}); 
		
		//******************************************************************************************************panel부분
		pan = new Panel();
		pan.setBackground(Color.LIGHT_GRAY);
		pan.setBounds(450, 50, 150, 500);
		pan.setLayout(new GridLayout(7, 1, 10, 10));
		add(pan);
		
		
		
		//****************************************************************************************************canvas부분
		img = tk.getImage(imgarr[0]);
		canvas = new Canvas() {
			public void paint(Graphics g) {
				g.drawImage(img, (canvas.getWidth()-img.getWidth(this))/2, (canvas.getHeight()-img.getHeight(this))/2,  this);
			}
		};
		canvas.setBounds(25, 50, 400, 500);
		canvas.setBackground(Color.magenta);
		add(canvas);
		
		
		//*******************************************************************************************************Button부분
		b1 = new Button("이미지1");
		b1.addActionListener(new button_Event());
		pan.add(b1);
		
		b2 = new Button("이미지2");
		b2.addActionListener(new button_Event());
		pan.add(b2);
		
		b3 = new Button("이미지3");
		b3.addActionListener(new button_Event());
		pan.add(b3);
		
		b4 = new Button("이미지4");
		b4.addActionListener(new button_Event());
		pan.add(b4);
		
		b5 = new Button("이미지5");
		b5.addActionListener(new button_Event());
		pan.add(b5);
		
		b6 = new Button("이미지6");
		b6.addActionListener(new button_Event());
		pan.add(b6);
		
		b7 = new Button("랜덤이미지");
		b7.addActionListener(new button_Event());
		pan.add(b7);
		
		setVisible(true);
	}
	
	class button_Event implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Button bt = (Button) e.getSource();
			int r;
			if(bt.getLabel() == "이미지1") {
				img = tk.getImage(imgarr[1]);
				canvas.repaint();
			}
			else if(bt.getLabel() == "이미지2") {
				img = tk.getImage(imgarr[2]);
				canvas.repaint();
			}
			else if(bt.getLabel() == "이미지3") {
				img = tk.getImage(imgarr[3]);
				canvas.repaint();
			}
			else if(bt.getLabel() == "이미지4") {
				img = tk.getImage(imgarr[4]);
				canvas.repaint();
			}
			else if(bt.getLabel() == "이미지5") {
				img = tk.getImage(imgarr[5]);
				canvas.repaint();
			}
			else if(bt.getLabel() == "이미지6") {	
				img = tk.getImage(imgarr[6]);
				canvas.repaint();
			}
			else {
				r = (int)(Math.random()*7);
				img = tk.getImage(imgarr[r]);
				canvas.repaint();
			}
		}
	}
	
	
	public static void main(String[] args) {
		new Test1("canvas 연습");

	}

}
