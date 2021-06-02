import java.awt.*;
import java.awt.event.*;

public class OopProgram extends Frame {
	Toolkit tk = Toolkit.getDefaultToolkit(); 
	Dimension screenSize = tk.getScreenSize();
	
	Panel p1, p2;
	Label l1;
	TextArea ta;
	Button b1, b2, b3;
	Font f1 = new Font("Serif", Font.BOLD, 25);
	Canvas c1;
	Image img = tk.getImage("images/img0.jpg");

	OopProgram(String title) {
		super(title);
		this.setLayout(null);
		this.setBackground(new Color(182,254,133));
		
		// 프레임을 화면 중앙에 보이기
		setBounds((screenSize.width)/2-300, 
				(screenSize.height)/2-350, 600, 700);

		// 닫기x 버튼 이벤트 처리
		addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) { 
				dispose();
			}
		});

		
		/******** Label l1 부분 *******/	
		l1 = new Label("★ 객체지향언어 특징 ★", Label.CENTER);
		l1.setFont(f1);
		l1.setBounds(50, 50, 500, 70);
		l1.setBackground(new Color(128,191,108));
		l1.setForeground(new Color(36,70,51));
		
		/******** TextArea ta 부분 *******/
		ta = new TextArea("\n\n\n      버튼을 클릭하세요 ♡", 5, 10, TextArea.SCROLLBARS_NONE);
		ta.setBounds(50, 130, 350, 300);
		ta.setEditable(false);
		ta.setFont(f1);
		ta.setForeground(new Color(0,68,128));
			
		
		/******** Button b1 부분 *******/
		b1 = new Button("캡슐화");
		b1.setFont(f1);
		b1.setBackground(new Color(17,57,9));
		b1.setForeground(Color.white);
		
		/******** Button b2 부분 *******/
		b2 = new Button("상속");
		b2.setFont(f1);
		b2.setBackground(new Color(17,57,9));
		b2.setForeground(Color.white);
		
		/******** Button b3 부분 *******/
		b3 = new Button("다형성");
		b3.setFont(f1);
		b3.setBackground(new Color(17,57,9));
		b3.setForeground(Color.white);
		
		
		b1.addActionListener(new Event123());
		b2.addActionListener(new Event123());
		b3.addActionListener(new Event123());
		
		/*
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setFont(new Font("Serif", Font.BOLD, 20));
				ta.setText("캡슐화는 중요한 데이터를 보존,보호하는 것입니다. \n\n캡슐화(encapsulation)는 일반적으로 연관 있는 변수와  "
						+ "함수를 클래스로 묶는 작업을 말합니다. \n\n이 작업은 클래스 만드는 작업과 비슷하다고 여길 수도 있습니다. "
						+ "하지만 캡슐화에는 은닉성이란게 있어서 클래스에 담는 내용 중 중요한 데이터나 기능을 외부에서 접근하지 못하게 할 수 있습니다.\n");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setFont(new Font("Serif", Font.BOLD, 20));
				ta.setText("다형성은 같은 타입이지만 실행 결과가 다양한 객체를 대입(이용)할 수 있는 성질을 말합니다.\n\n"
						+ "부모 타입에는 모든 자식 객체가 대입될 수 있으며 자식 타입은 부모 타입으로 자동 타입 변환이 됩니다.\n"
						+ "다형성은 객체를 부품화시킬 수 있습니다.\n");
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setFont(new Font("Serif", Font.BOLD, 20));
				ta.setText("현실 세계에서 상속이란 부모가 자식에게 물려주는 것으로, 부모가 자식을 선택해서 물려주는 것이지만 객체지향 프로그래밍에서의 상속은 현실 세계와 반대로 자식이 부모를 선택해서 물려받는 것을 말합니다.\n\n"
						+ "\n☆ 상속의 효과 ☆\n\n"
						+ "- 부모 클래스를 재사용해서 개발\n"
						+ "- 반복된 코드의 중복을 줄여줌\n" 
						+ "- 유지 보수의 편리성을 제공\n"
						+ "- 객체의 다형성을 구현\n");
			}
		});
		*/
		
		/******** Panel p1 부분 *******/
		p1 = new Panel();
		p1.setBounds(400, 130, 150, 300);
		p1.setBackground(Color.orange);
		p1.setLayout(new GridLayout(3,1));
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		
		
		
		/******** Cavas cvs 부분 *******/	
	    c1 = new Canvas() {
			public void paint(Graphics g) {
				g.drawImage(img, 0, 0, this);
			}
		};
		c1.setBounds(50, 450, 500, 200);
		c1.setBackground(Color.pink);

		
		
		/******** 프레임에 컨포넌트 붙이기 *******/
		add(l1);
		add(ta);
		add(p1);
		add(c1);
		
		setVisible(true);
	}
	
	class Event123 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Button b = (Button)e.getSource();
			// System.out.println(e.getActionCommand());
			ta.setFont(new Font("Serif", Font.BOLD, 20));
			
			String imgArr[] = {"images/img1.jpg", 
								"images/img2.jpg", 
								"images/img3.jpg"};
			
			if(e.getActionCommand() == "캡슐화"){
				ta.setText("캡슐화는 중요한 데이터를 보존,보호하는 것입니다. \n\n캡슐화(encapsulation)는 일반적으로 연관 있는 변수와  "
						+ "함수를 클래스로 묶는 작업을 말합니다. \n\n이 작업은 클래스 만드는 작업과 비슷하다고 여길 수도 있습니다. "
						+ "하지만 캡슐화에는 은닉성이란게 있어서 클래스에 담는 내용 중 중요한 데이터나 기능을 외부에서 접근하지 못하게 할 수 있습니다.\n");
				img = tk.getImage(imgArr[0]);
				c1.repaint(); 
			} else if(e.getActionCommand() == "상속"){
				ta.setText("다형성은 같은 타입이지만 실행 결과가 다양한 객체를 대입(이용)할 수 있는 성질을 말합니다.\n\n"
						+ "부모 타입에는 모든 자식 객체가 대입될 수 있으며 자식 타입은 부모 타입으로 자동 타입 변환이 됩니다.\n"
						+ "다형성은 객체를 부품화시킬 수 있습니다.\n");
				img = tk.getImage(imgArr[1]);
				c1.repaint(); 
			} else {
				ta.setText("현실 세계에서 상속이란 부모가 자식에게 물려주는 것으로, 부모가 자식을 선택해서 물려주는 것이지만 객체지향 프로그래밍에서의 상속은 현실 세계와 반대로 자식이 부모를 선택해서 물려받는 것을 말합니다.\n\n"
						+ "\n☆ 상속의 효과 ☆\n\n"
						+ "- 부모 클래스를 재사용해서 개발\n"
						+ "- 반복된 코드의 중복을 줄여줌\n" 
						+ "- 유지 보수의 편리성을 제공\n"
						+ "- 객체의 다형성을 구현\n");
				img = tk.getImage(imgArr[2]);
				c1.repaint(); 
			}
		}
	}
		
}
