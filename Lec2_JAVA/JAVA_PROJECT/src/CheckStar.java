
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckStar extends Frame {
	String str_star = null, str_star2 = null;
	
	Label l1, l2, l3, l4, l5, l6;
	Panel p1, p2, p3;
	Choice c1, c2;
	Button b1, b2;
	Canvas cvs;
	Image img, bgimg;
	CheckboxGroup group;
	Checkbox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10, cb11, cb12; 

	Font f1 = new Font("Monospaced", Font.BOLD, 35);
	Font f2 = new Font("SansSerif", Font.BOLD, 25);
	Font f3 = new Font("Dialog", Font.BOLD + Font.ITALIC, 28);
	Font f4 = new Font("Dialog", Font.BOLD, 18);
	
	
	CheckStar(String title) {
		super(title);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		bgimg = tk.getImage("images/img_bgstar.jpg");
		
		
		// 제목 부분 
		l1 = new Label("별자리 프로그램", Label.CENTER);
		l1.setBackground(new Color(65,65,150));
		//l1.setBackground(new Color(200,130,220));
		l1.setForeground(Color.white);
		l1.setBounds(555, 100, 380, 70);
		l1.setFont(f1);
		
		
		
		// 패널 p1 부분 (생일 입력 부분)
		p1 = new Panel();
		p1.setLayout(null);
		p1.setBackground(new Color(65,65,150));
		//l1.setBackground(new Color(200,130,220));
		p1.setForeground(Color.white);
		p1.setBounds(65, 170, 870, 120);
			

		l2 = new Label("생일 입력", Label.RIGHT);
		l2.setBounds(20, 30, 140, 70);
		l2.setFont(f2);
		
		c1 = new Choice();
		c1.add("1"); c1.add("2"); c1.add("3"); c1.add("4"); 
		c1.add("5"); c1.add("6"); c1.add("7"); c1.add("8"); 
		c1.add("9"); c1.add("10"); c1.add("11"); c1.add("12");
		c1.setBounds(200, 45, 90, 70);
		c1.setForeground(new Color(200,130,220));
		c1.setFont(f2);
		
		l3 = new Label("월");
		l3.setBounds(300, 30, 50, 70);
		l3.setFont(f2);
		
		c2 = new Choice();
		c2.add("1"); c2.add("2"); c2.add("3"); c2.add("4"); c2.add("5"); 
		c2.add("6"); c2.add("7"); c2.add("8"); c2.add("9"); c2.add("10"); 
		c2.add("11"); c2.add("12"); c2.add("13"); c2.add("14"); c2.add("15"); 
		c2.add("16"); c2.add("17"); c2.add("18"); c2.add("19"); c2.add("20"); 
		c2.add("21"); c2.add("22"); c2.add("23"); c2.add("24"); c2.add("25"); 
		c2.add("26"); c2.add("27"); c2.add("28"); c2.add("29"); c2.add("30"); c2.add("31"); 
	
		c2.setBounds(360, 45, 90, 70);
		c2.setForeground(new Color(200,130,220));
		c2.setFont(f2);
		
		l4 = new Label("일");
		l4.setBounds(460, 30, 50, 70);
		l4.setFont(f2);

		b1 = new Button("확인");
		b1.setBounds(520, 30, 140, 70);
		b1.setBackground(Color.white);
		b1.setForeground(new Color(100,130,220));
		b1.setFont(f2);
		
		b2 = new Button("초기화");
		b2.setBounds(690, 30, 140, 70);
		b2.setBackground(Color.white);
		b2.setForeground(new Color(100,130,220));
		b2.setFont(f2);
		
		// 버튼에 이벤트 리스너(감지기) 달기
		b1.addActionListener(new EventStar1());
		b2.addActionListener(new EventStar2());
		
		
		p1.add(l2); 
		p1.add(c1); p1.add(l3); p1.add(c2); p1.add(l4); 
		p1.add(b1); p1.add(b2);
		
		
		
		// 패널 p2 부분 (별자리 출력 부분)
		p2 = new Panel();
		p2.setLayout(null);
		p2.setBackground(new Color(210,220,250));
		p2.setForeground(new Color(0,64,128));
		p2.setBounds(65, 290, 870, 790);
		
		img = Toolkit.getDefaultToolkit().getImage("images/img_star0.jpg"); 
		cvs = new Canvas() {
			public void paint(Graphics g) {
				g.drawImage(img, 0, 0, this);
			}
		};
		cvs.setBackground(new Color(234,238,244));
		cvs.setBounds(20, 20, 660, 620);
		

		// 12개 별자리 체크박스 12행 1열로 관리하는 패널 p3 부분 
		p3 = new Panel();
		p3.setLayout(new GridLayout(12,1));
		p3.setBackground(new Color(210,220,250));
		p3.setForeground(new Color(0,64,128));
		p3.setBounds(700, 20, 170, 620);
		
		group = new CheckboxGroup();
		cb1 = new Checkbox("양자리", group, false);
		cb2 = new Checkbox("황소자리", group, false);
		cb3 = new Checkbox("쌍둥이자리", group, false);
		cb4 = new Checkbox("게자리", group, false);
		cb5 = new Checkbox("사자자리", group, false);
		cb6 = new Checkbox("처녀자리", group, false);
		cb7 = new Checkbox("천칭자리", group, false);
		cb8 = new Checkbox("전갈자리", group, false);
		cb9 = new Checkbox("궁수자리", group, false);
		cb10 = new Checkbox("염소자리", group, false);
		cb11 = new Checkbox("물병자리", group, false);
		cb12 = new Checkbox("물고기자리", group, false);
		
		cb1.setFont(f2); cb2.setFont(f2); cb3.setFont(f2);
		cb4.setFont(f2); cb5.setFont(f2); cb6.setFont(f2);
		cb7.setFont(f2); cb8.setFont(f2); cb9.setFont(f2);
		cb10.setFont(f2); cb11.setFont(f2); cb12.setFont(f2);
		
		
		cb1.addItemListener(new EventCheckbox());
		cb2.addItemListener(new EventCheckbox());
		cb3.addItemListener(new EventCheckbox());
		cb4.addItemListener(new EventCheckbox());
		cb5.addItemListener(new EventCheckbox());
		cb6.addItemListener(new EventCheckbox());
		cb7.addItemListener(new EventCheckbox());
		cb8.addItemListener(new EventCheckbox());
		cb9.addItemListener(new EventCheckbox());
		cb10.addItemListener(new EventCheckbox());
		cb11.addItemListener(new EventCheckbox());
		cb12.addItemListener(new EventCheckbox());
		
		l5 = new Label("생일 입력 또는 별자리를 선택해주세요.", Label.CENTER);
		l5.setBounds(20, 660, 830, 60);
		l5.setBackground(Color.black);
		l5.setForeground(Color.yellow);
		l5.setFont(f3);
		
		l6 = new Label("★★★★★★★", Label.CENTER);
		l6.setBounds(20, 710, 830, 60);
		l6.setBackground(Color.black);
		l6.setForeground(Color.white);
		l6.setFont(f4);
		
		p3.add(cb1); p3.add(cb2); p3.add(cb3); p3.add(cb4); 
		p3.add(cb5); p3.add(cb6); p3.add(cb7); p3.add(cb8); 
		p3.add(cb9); p3.add(cb10); p3.add(cb11); p3.add(cb12); 
		
		
		p2.add(cvs); p2.add(p3); p2.add(l5); p2.add(l6);
		
		// 프레임에 컨포넌트 붙이기
		add(l1); add(p1); add(p2); 
		
		
		// 프레임 닫기 버튼 누르면 이벤트 처리
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose(); // 커피자판기 프레임만 메모리 해제(닫기)
			}
		});
	
		// 프레임 설정 부분
		setLayout(null); // 프레임 레이아웃 사용 안함 (좌표 사용)
		//setBackground(new Color(255,250,255));
		
		
		// 프레임 위치 설정(중앙에 위치 시키기)
		// Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize(); // 화면의 너비,높이의 정보를 screenSize에 대입
		this.setBounds(screenSize.width/2-500, screenSize.height/2-570, 1000, 1140); // 프레임의 시작위치, 사이즈 설정
		
		setVisible(true); // 프레임 화면에 보이기
	}

	
	// 내부 클래스를 이용한 이벤트 처리기 부분
	// 확인 버튼 이벤트 처리기
	class EventStar1 implements ActionListener {	
		public void actionPerformed(ActionEvent e) {
			
			String m = c1.getSelectedItem();
			String d = c2.getSelectedItem();
			String d2 = d;
			
			if(d2 == "1" || d2 == "2" || d2 == "3" || d2 == "4" || d2 == "5" || d2 == "6" || d2 == "7" || d2 == "8" || d2 == "9") {
				d2 = "0" + d2;
			}
			
			int day = Integer.parseInt(m+d2); // 1~9일 앞에 0붙인 월일로 변경(숫자)
			
			////// 월과 일을 따로 체크
			if(day >= 120 && day <= 218) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star11.jpg");
			    cvs.repaint();
				str_star = "물병자리";
				str_star2 = "행운의 별, 토성이 수호성";
			} else if(day >= 219 && day <= 320) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star12.jpg");
			    cvs.repaint();
				str_star = "물고기자리";
				str_star2 = "두 강 사이의 땅, 수호성은 목성";
			} else if(day >= 321 && day <= 419) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star1.jpg");
			    cvs.repaint();
				str_star = "양자리";
				str_star2 = "양치기 두무지의 별자리, 수호성은 화성";
			} else if(day >= 420 && day <= 520) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star2.jpg");
			    cvs.repaint();
				str_star = "황소자리";
				str_star2 = "서쪽 하늘 별들의 지도자, 수호성은 금성";
			} else if(day >= 521 && day <= 621) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star3.jpg");
			    cvs.repaint();
				str_star = "쌍둥이자리";
				str_star2 = "제우스의 아들들, 수호성은 수성";
			} else if(day >= 622 && day <= 722) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star4.jpg");
			    cvs.repaint();
				str_star = "게자리";
				str_star2 = "거대한 게, 수호성은 달";
			} else if(day >= 723 && day <= 822) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star5.jpg");
			    cvs.repaint();
				str_star = "사자자리";
				str_star2 = "황제의 별자리, 수호성은 태양";
			} else if(day >= 823 && day <= 923) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star6.jpg");
			    cvs.repaint();
				str_star = "처녀자리";
				str_star2 = "날개 달린 처녀, 수호성은 수성";
			} else if(day >= 924 && day <= 1022) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star7.jpg");
			    cvs.repaint();
				str_star = "천칭자리";
				str_star2 = "전갈의 남/북쪽 집게발, 수호성은 금성";
			} else if(day >= 1023 && day <= 1122) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star8.jpg");
			    cvs.repaint();
				str_star = "전갈자리";
				str_star2 = "낚시 별자리, 수호성은 화성";
			} else if(day >= 1123 && day <= 1224) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star9.jpg");
			    cvs.repaint();
				str_star = "궁수자리(사수자리)";
				str_star2 = "주전자 별, 수호성은 목성";
			} else {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star10.jpg");
			    cvs.repaint();
				str_star = "염소자리";
				str_star2 = "반염소/반물고기, 수호성은 토성";
			} 
			
			l5.setText(m + "월 " + d + "일은 " + str_star + "입니다.");
			l6.setText(str_star2);
		}
	}
	
	// 초기화 버튼 이벤트 처리기	
	class EventStar2 implements ActionListener {	
		public void actionPerformed(ActionEvent e) {
			img = Toolkit.getDefaultToolkit().getImage("images/img_star0.jpg");
		    cvs.repaint();
		    
		    l5.setText("생일 입력 또는 별자리를 선택해주세요.");
			l6.setText("★★★★★★★");
		}
	}
	
	
	class EventCheckbox implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			Checkbox cb = (Checkbox)e.getSource(); // getSource()의 반환타입이 Object이기 때문에 강제 형변환 필수!
			String star = cb.getLabel();
			
			if(star.equals("양자리")) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star1.jpg");
			    cvs.repaint();
			    str_star = "양자리 [ 3월 21일 ~ 4월 19일 ]";
			    str_star2 = "양치기 두무지의 별자리, 수호성은 화성";
			} else if(star.equals("황소자리")) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star2.jpg");
			    cvs.repaint();
			    str_star = "황소자리 [ 4월 20일 ~ 5월 20일 ]";
			    str_star2 = "서쪽 하늘 별들의 지도자, 수호성은 금성";
			} else if(star.equals("쌍둥이자리")) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star3.jpg");
			    cvs.repaint();
			    str_star = "쌍둥이자리 [ 5월 21일 ~ 6월 21일 ]";
			    str_star2 = "제우스의 아들들, 수호성은 수성";
			} else if(star.equals("게자리")) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star4.jpg");
			    cvs.repaint();
			    str_star = "게자리 [ 6월 22일 ~ 7월 22일 ]";
			    str_star2 = "거대한 게, 수호성은 달";
			} else if(star.equals("사자자리")) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star5.jpg");
			    cvs.repaint();
			    str_star = "사자자리 [ 7월 23일 ~ 8월 22일 ]";
			    str_star2 = "황제의 별자리, 수호성은 태양";
			} else if(star.equals("처녀자리")) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star6.jpg");
			    cvs.repaint();
			    str_star = "처녀자리 [ 8월 23일 ~ 9월 23일 ]";
			    str_star2 = "날개 달린 처녀, 수호성은 수성";
			} else if(star.equals("천칭자리")) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star7.jpg");
			    cvs.repaint();
			    str_star = "천칭자리 [ 9월 24일 ~ 10월 22일 ]";
			    str_star2 = "전갈의 남/북쪽 집게발, 수호성은 금성";
			} else if(star.equals("전갈자리")) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star8.jpg");
			    cvs.repaint();
			    str_star = "전갈자리 [ 10월 23일 ~ 11월 22일 ]";
			    str_star2 = "낚시 별자리, 수호성은 화성";
			} else if(star.equals("궁수자리")) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star9.jpg");
			    cvs.repaint();
			    str_star = "궁수자리 [ 11월 23일 ~ 12월 24일 ]";
			    str_star2 = "사수자리라고 불리며, 주전자 별, 수호성은 목성";
			} else if(star.equals("염소자리")) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star10.jpg");
			    cvs.repaint();
			    str_star = "염소자리 [ 12월 25일 ~ 1월 19일 ]";
			    str_star2 = "반염소/반물고기, 수호성은 토성";
			} else if(star.equals("물병자리")) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star11.jpg");
			    cvs.repaint();
				str_star = "물병자리 [ 1월 20일 ~ 2월 18일 ]";
				str_star2 = "행운의 별, 토성이 수호성";
			} else if(star.equals("물고기자리")) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star12.jpg");
			    cvs.repaint();
				str_star = "물고기자리 [ 2월 19일 ~ 3월 20일 ]";
				str_star2 = "두 강 사이의 땅, 수호성은 목성";
			}
			
			l5.setText(str_star);
			l6.setText(str_star2);
		}
	}
	
	public void paint(Graphics g) { // 오버라이딩
		if(img == null) {
	        return;
		}
		
		g.drawImage(bgimg, 0, 0, this);
	}
	
}
