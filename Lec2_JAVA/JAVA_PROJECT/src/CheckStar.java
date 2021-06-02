
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
		
		
		// ���� �κ� 
		l1 = new Label("���ڸ� ���α׷�", Label.CENTER);
		l1.setBackground(new Color(65,65,150));
		//l1.setBackground(new Color(200,130,220));
		l1.setForeground(Color.white);
		l1.setBounds(555, 100, 380, 70);
		l1.setFont(f1);
		
		
		
		// �г� p1 �κ� (���� �Է� �κ�)
		p1 = new Panel();
		p1.setLayout(null);
		p1.setBackground(new Color(65,65,150));
		//l1.setBackground(new Color(200,130,220));
		p1.setForeground(Color.white);
		p1.setBounds(65, 170, 870, 120);
			

		l2 = new Label("���� �Է�", Label.RIGHT);
		l2.setBounds(20, 30, 140, 70);
		l2.setFont(f2);
		
		c1 = new Choice();
		c1.add("1"); c1.add("2"); c1.add("3"); c1.add("4"); 
		c1.add("5"); c1.add("6"); c1.add("7"); c1.add("8"); 
		c1.add("9"); c1.add("10"); c1.add("11"); c1.add("12");
		c1.setBounds(200, 45, 90, 70);
		c1.setForeground(new Color(200,130,220));
		c1.setFont(f2);
		
		l3 = new Label("��");
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
		
		l4 = new Label("��");
		l4.setBounds(460, 30, 50, 70);
		l4.setFont(f2);

		b1 = new Button("Ȯ��");
		b1.setBounds(520, 30, 140, 70);
		b1.setBackground(Color.white);
		b1.setForeground(new Color(100,130,220));
		b1.setFont(f2);
		
		b2 = new Button("�ʱ�ȭ");
		b2.setBounds(690, 30, 140, 70);
		b2.setBackground(Color.white);
		b2.setForeground(new Color(100,130,220));
		b2.setFont(f2);
		
		// ��ư�� �̺�Ʈ ������(������) �ޱ�
		b1.addActionListener(new EventStar1());
		b2.addActionListener(new EventStar2());
		
		
		p1.add(l2); 
		p1.add(c1); p1.add(l3); p1.add(c2); p1.add(l4); 
		p1.add(b1); p1.add(b2);
		
		
		
		// �г� p2 �κ� (���ڸ� ��� �κ�)
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
		

		// 12�� ���ڸ� üũ�ڽ� 12�� 1���� �����ϴ� �г� p3 �κ� 
		p3 = new Panel();
		p3.setLayout(new GridLayout(12,1));
		p3.setBackground(new Color(210,220,250));
		p3.setForeground(new Color(0,64,128));
		p3.setBounds(700, 20, 170, 620);
		
		group = new CheckboxGroup();
		cb1 = new Checkbox("���ڸ�", group, false);
		cb2 = new Checkbox("Ȳ���ڸ�", group, false);
		cb3 = new Checkbox("�ֵ����ڸ�", group, false);
		cb4 = new Checkbox("���ڸ�", group, false);
		cb5 = new Checkbox("�����ڸ�", group, false);
		cb6 = new Checkbox("ó���ڸ�", group, false);
		cb7 = new Checkbox("õĪ�ڸ�", group, false);
		cb8 = new Checkbox("�����ڸ�", group, false);
		cb9 = new Checkbox("�ü��ڸ�", group, false);
		cb10 = new Checkbox("�����ڸ�", group, false);
		cb11 = new Checkbox("�����ڸ�", group, false);
		cb12 = new Checkbox("������ڸ�", group, false);
		
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
		
		l5 = new Label("���� �Է� �Ǵ� ���ڸ��� �������ּ���.", Label.CENTER);
		l5.setBounds(20, 660, 830, 60);
		l5.setBackground(Color.black);
		l5.setForeground(Color.yellow);
		l5.setFont(f3);
		
		l6 = new Label("�ڡڡڡڡڡڡ�", Label.CENTER);
		l6.setBounds(20, 710, 830, 60);
		l6.setBackground(Color.black);
		l6.setForeground(Color.white);
		l6.setFont(f4);
		
		p3.add(cb1); p3.add(cb2); p3.add(cb3); p3.add(cb4); 
		p3.add(cb5); p3.add(cb6); p3.add(cb7); p3.add(cb8); 
		p3.add(cb9); p3.add(cb10); p3.add(cb11); p3.add(cb12); 
		
		
		p2.add(cvs); p2.add(p3); p2.add(l5); p2.add(l6);
		
		// �����ӿ� ������Ʈ ���̱�
		add(l1); add(p1); add(p2); 
		
		
		// ������ �ݱ� ��ư ������ �̺�Ʈ ó��
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose(); // Ŀ�����Ǳ� �����Ӹ� �޸� ����(�ݱ�)
			}
		});
	
		// ������ ���� �κ�
		setLayout(null); // ������ ���̾ƿ� ��� ���� (��ǥ ���)
		//setBackground(new Color(255,250,255));
		
		
		// ������ ��ġ ����(�߾ӿ� ��ġ ��Ű��)
		// Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize(); // ȭ���� �ʺ�,������ ������ screenSize�� ����
		this.setBounds(screenSize.width/2-500, screenSize.height/2-570, 1000, 1140); // �������� ������ġ, ������ ����
		
		setVisible(true); // ������ ȭ�鿡 ���̱�
	}

	
	// ���� Ŭ������ �̿��� �̺�Ʈ ó���� �κ�
	// Ȯ�� ��ư �̺�Ʈ ó����
	class EventStar1 implements ActionListener {	
		public void actionPerformed(ActionEvent e) {
			
			String m = c1.getSelectedItem();
			String d = c2.getSelectedItem();
			String d2 = d;
			
			if(d2 == "1" || d2 == "2" || d2 == "3" || d2 == "4" || d2 == "5" || d2 == "6" || d2 == "7" || d2 == "8" || d2 == "9") {
				d2 = "0" + d2;
			}
			
			int day = Integer.parseInt(m+d2); // 1~9�� �տ� 0���� ���Ϸ� ����(����)
			
			////// ���� ���� ���� üũ
			if(day >= 120 && day <= 218) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star11.jpg");
			    cvs.repaint();
				str_star = "�����ڸ�";
				str_star2 = "����� ��, �伺�� ��ȣ��";
			} else if(day >= 219 && day <= 320) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star12.jpg");
			    cvs.repaint();
				str_star = "������ڸ�";
				str_star2 = "�� �� ������ ��, ��ȣ���� ��";
			} else if(day >= 321 && day <= 419) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star1.jpg");
			    cvs.repaint();
				str_star = "���ڸ�";
				str_star2 = "��ġ�� �ι����� ���ڸ�, ��ȣ���� ȭ��";
			} else if(day >= 420 && day <= 520) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star2.jpg");
			    cvs.repaint();
				str_star = "Ȳ���ڸ�";
				str_star2 = "���� �ϴ� ������ ������, ��ȣ���� �ݼ�";
			} else if(day >= 521 && day <= 621) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star3.jpg");
			    cvs.repaint();
				str_star = "�ֵ����ڸ�";
				str_star2 = "���콺�� �Ƶ��, ��ȣ���� ����";
			} else if(day >= 622 && day <= 722) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star4.jpg");
			    cvs.repaint();
				str_star = "���ڸ�";
				str_star2 = "�Ŵ��� ��, ��ȣ���� ��";
			} else if(day >= 723 && day <= 822) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star5.jpg");
			    cvs.repaint();
				str_star = "�����ڸ�";
				str_star2 = "Ȳ���� ���ڸ�, ��ȣ���� �¾�";
			} else if(day >= 823 && day <= 923) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star6.jpg");
			    cvs.repaint();
				str_star = "ó���ڸ�";
				str_star2 = "���� �޸� ó��, ��ȣ���� ����";
			} else if(day >= 924 && day <= 1022) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star7.jpg");
			    cvs.repaint();
				str_star = "õĪ�ڸ�";
				str_star2 = "������ ��/���� ���Թ�, ��ȣ���� �ݼ�";
			} else if(day >= 1023 && day <= 1122) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star8.jpg");
			    cvs.repaint();
				str_star = "�����ڸ�";
				str_star2 = "���� ���ڸ�, ��ȣ���� ȭ��";
			} else if(day >= 1123 && day <= 1224) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star9.jpg");
			    cvs.repaint();
				str_star = "�ü��ڸ�(����ڸ�)";
				str_star2 = "������ ��, ��ȣ���� ��";
			} else {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star10.jpg");
			    cvs.repaint();
				str_star = "�����ڸ�";
				str_star2 = "�ݿ���/�ݹ����, ��ȣ���� �伺";
			} 
			
			l5.setText(m + "�� " + d + "���� " + str_star + "�Դϴ�.");
			l6.setText(str_star2);
		}
	}
	
	// �ʱ�ȭ ��ư �̺�Ʈ ó����	
	class EventStar2 implements ActionListener {	
		public void actionPerformed(ActionEvent e) {
			img = Toolkit.getDefaultToolkit().getImage("images/img_star0.jpg");
		    cvs.repaint();
		    
		    l5.setText("���� �Է� �Ǵ� ���ڸ��� �������ּ���.");
			l6.setText("�ڡڡڡڡڡڡ�");
		}
	}
	
	
	class EventCheckbox implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			Checkbox cb = (Checkbox)e.getSource(); // getSource()�� ��ȯŸ���� Object�̱� ������ ���� ����ȯ �ʼ�!
			String star = cb.getLabel();
			
			if(star.equals("���ڸ�")) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star1.jpg");
			    cvs.repaint();
			    str_star = "���ڸ� [ 3�� 21�� ~ 4�� 19�� ]";
			    str_star2 = "��ġ�� �ι����� ���ڸ�, ��ȣ���� ȭ��";
			} else if(star.equals("Ȳ���ڸ�")) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star2.jpg");
			    cvs.repaint();
			    str_star = "Ȳ���ڸ� [ 4�� 20�� ~ 5�� 20�� ]";
			    str_star2 = "���� �ϴ� ������ ������, ��ȣ���� �ݼ�";
			} else if(star.equals("�ֵ����ڸ�")) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star3.jpg");
			    cvs.repaint();
			    str_star = "�ֵ����ڸ� [ 5�� 21�� ~ 6�� 21�� ]";
			    str_star2 = "���콺�� �Ƶ��, ��ȣ���� ����";
			} else if(star.equals("���ڸ�")) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star4.jpg");
			    cvs.repaint();
			    str_star = "���ڸ� [ 6�� 22�� ~ 7�� 22�� ]";
			    str_star2 = "�Ŵ��� ��, ��ȣ���� ��";
			} else if(star.equals("�����ڸ�")) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star5.jpg");
			    cvs.repaint();
			    str_star = "�����ڸ� [ 7�� 23�� ~ 8�� 22�� ]";
			    str_star2 = "Ȳ���� ���ڸ�, ��ȣ���� �¾�";
			} else if(star.equals("ó���ڸ�")) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star6.jpg");
			    cvs.repaint();
			    str_star = "ó���ڸ� [ 8�� 23�� ~ 9�� 23�� ]";
			    str_star2 = "���� �޸� ó��, ��ȣ���� ����";
			} else if(star.equals("õĪ�ڸ�")) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star7.jpg");
			    cvs.repaint();
			    str_star = "õĪ�ڸ� [ 9�� 24�� ~ 10�� 22�� ]";
			    str_star2 = "������ ��/���� ���Թ�, ��ȣ���� �ݼ�";
			} else if(star.equals("�����ڸ�")) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star8.jpg");
			    cvs.repaint();
			    str_star = "�����ڸ� [ 10�� 23�� ~ 11�� 22�� ]";
			    str_star2 = "���� ���ڸ�, ��ȣ���� ȭ��";
			} else if(star.equals("�ü��ڸ�")) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star9.jpg");
			    cvs.repaint();
			    str_star = "�ü��ڸ� [ 11�� 23�� ~ 12�� 24�� ]";
			    str_star2 = "����ڸ���� �Ҹ���, ������ ��, ��ȣ���� ��";
			} else if(star.equals("�����ڸ�")) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star10.jpg");
			    cvs.repaint();
			    str_star = "�����ڸ� [ 12�� 25�� ~ 1�� 19�� ]";
			    str_star2 = "�ݿ���/�ݹ����, ��ȣ���� �伺";
			} else if(star.equals("�����ڸ�")) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star11.jpg");
			    cvs.repaint();
				str_star = "�����ڸ� [ 1�� 20�� ~ 2�� 18�� ]";
				str_star2 = "����� ��, �伺�� ��ȣ��";
			} else if(star.equals("������ڸ�")) {
				img = Toolkit.getDefaultToolkit().getImage("images/img_star12.jpg");
			    cvs.repaint();
				str_star = "������ڸ� [ 2�� 19�� ~ 3�� 20�� ]";
				str_star2 = "�� �� ������ ��, ��ȣ���� ��";
			}
			
			l5.setText(str_star);
			l6.setText(str_star2);
		}
	}
	
	public void paint(Graphics g) { // �������̵�
		if(img == null) {
	        return;
		}
		
		g.drawImage(bgimg, 0, 0, this);
	}
	
}
