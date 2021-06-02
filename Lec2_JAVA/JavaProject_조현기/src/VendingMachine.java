import java.awt.*;
import java.awt.event.*;


public class VendingMachine extends Frame{
	Label title;
	Panel display, press, space;
	TextArea ta;
	Canvas canvas;
	
	Button b1, b2, b3, b4;
	
	Font f1 = new Font("SansSerif", Font.BOLD, 30);
	Font f2 = new Font("SansSerif", Font.BOLD, 20);
	
	Toolkit tk = Toolkit.getDefaultToolkit();
	Image img;
	Image img1 = tk.getImage("images/imgs1.png");
	Image img2 = tk.getImage("images/imgs2.png");
	Image img3 = tk.getImage("images/imgs3.png");
	Image img4 = tk.getImage("images/imgs4.png");
	
	VendingMachine(String str){
		super(str);
		
		//*****************************************************************Frame부분
		Dimension screenSize = tk.getScreenSize();
		this.setSize(500, 700);
		this.setLocation((screenSize.width-this.getWidth())/2, (screenSize.height-this.getHeight())/2);
		this.setLayout(null);
		this.setBackground(Color.white);
		addWindowListener(new WindowAdapter(){	//익명클래스를 사용하는 방법!
			public void windowClosing(WindowEvent e) {
				dispose(); 		//완전 종료
			}
		}); 
		
		
		//****************************************************************** Title Label부분
		title = new Label("스폰지밥 자판기");
		title.setBounds(50, 50, 400, 50);
		title.setBackground(Color.LIGHT_GRAY);
		title.setFont(f1);
		title.setAlignment(Label.CENTER);
		add(title);
		
		//****************************************************************** Panel부분
		display = new Panel();
		display.setBounds(25, 150, 300, 300);
		display.setBackground(Color.green);
		
		add(display);
		
		press = new Panel();
		press.setBounds(350, 150, 125, 300);
		press.setLayout(new GridLayout(4,1,5,5));
		press.setBackground(Color.PINK);
		add(press);
		
		space = new Panel();
		space.setBounds(25, 500, 450, 150);
		space.setBackground(Color.green);
		space.setLayout(null);
		add(space);
		
		//****************************************************************** display 패널 채우기
		img = img1;
		canvas = new Canvas(){
			public void paint(Graphics g) {
				g.drawImage(img, (canvas.getWidth()-img.getWidth(this))/2, (canvas.getHeight()-img.getHeight(this))/2,  this);
			}
		};
		
		//canvas = new Canvas();
		canvas.setBounds(5, 5, display.getWidth()-10, display.getHeight()-10);
		canvas.setBackground(Color.MAGENTA);	
		
		display.add(canvas);
		
		
		
		//******************************************************************  press 패널 채우기
		b1 = new Button("스폰지밥");
		b1.addActionListener(null);
		b1.addActionListener(new ButtonEvents());
		press.add(b1);
		
		b2 = new Button("뚱이");
		b2.addActionListener(null);
		b2.addActionListener(new ButtonEvents());
		press.add(b2);
		
		b3 = new Button("징징이");
		b3.addActionListener(null);
		b3.addActionListener(new ButtonEvents());
		press.add(b3);
		
		b4 = new Button("집게사장");
		b4.addActionListener(null);
		b4.addActionListener(new ButtonEvents());
		press.add(b4);
		
		//******************************************************************** space 공간 채우기
		ta = new TextArea("",0, 0, TextArea.SCROLLBARS_NONE);
		ta.setBounds(0, 0, space.getWidth(), space.getHeight() );
		ta.setEditable(false);
		ta.setBackground(new Color(95, 86, 252));
		ta.setForeground(Color.white);
		ta.setFont(f2);
		ta.setText("스폰지밥은 파인애플 모양의 집에 살며 집게리아에서 요리하는 것을 좋아하는 활기차고 낙관적인 성격의 해면동물이다(외모는 주방용 스펀지에 더 가깝다). 그는 애완동물로 달팽이인 핑핑이를 키우고 있다.");

		space.add(ta);
		setVisible(true);
	}

	
	class ButtonEvents implements ActionListener{
		Button bt;
		public void actionPerformed(ActionEvent e) {
			bt = (Button) e.getSource();
			if(bt.getLabel() == "스폰지밥") {
				ta.setText("스폰지밥은 파인애플 모양의 집에 살며 집게리아에서 요리하는 것을 좋아하는 활기차고 낙관적인 성격의 해면동물이다(외모는 주방용 스펀지에 더 가깝다). 그는 애완동물로 달팽이인 핑핑이를 키우고 있다.");
				img = img1;
				canvas.repaint();
			}
			else if(bt.getLabel() == "뚱이") {
				ta.setText("뚱이는 불가사리이며 스폰지밥의 베스트 프렌드이다. 더불어 뚱이는 조금 특이한 면이 있으나 자신이 똑똑하다고 생각한다. 실수로 두뇌 산호 섬에서 주운 머리로 천재가 된 적이 있었다. 그리고 뚱이는 대학교를 졸업하였었다.");
				img = img2;
				canvas.repaint();
			}
			else if(bt.getLabel() == "징징이") {
				ta.setText("징징이는 스폰지밥의 이웃이자 집게리아에서 같이 일하는 동료이다. 징징이는 모아이와 비슷한 집에 살고 자신에게 민폐를 끼치는 스폰지밥과 뚱이를 싫어하는 문어 캐릭터이다. 그는 클라리넷을 연주하거나 자화상을 그리는 것을 즐긴다. 그러나 자신이 하고 있는 카운터 직원 역할은 싫어한다.");
				img = img3;
				canvas.repaint();
			}
			else if(bt.getLabel() == "집게사장") {
				ta.setText("집게(Mr. Krabs→크랩스)는 돈을 매우 좋아하는 게이며 집게리아(Krusty Krab→크러스티 크렙)의 오너이자 스폰지밥의 보스이다. 크랩스에게는 진주(Pearl→펄)라는 이름의 10대의 고래인 딸이 있는데 크랩스는 펄을 자신의 재물과 동등하게 취급한다. 갈고리비슷한 집에서 살고 있다.");
				img = img4;
				canvas.repaint();
			}
		}
	}
}
