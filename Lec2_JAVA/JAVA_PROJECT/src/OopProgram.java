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
		
		// �������� ȭ�� �߾ӿ� ���̱�
		setBounds((screenSize.width)/2-300, 
				(screenSize.height)/2-350, 600, 700);

		// �ݱ�x ��ư �̺�Ʈ ó��
		addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) { 
				dispose();
			}
		});

		
		/******** Label l1 �κ� *******/	
		l1 = new Label("�� ��ü������ Ư¡ ��", Label.CENTER);
		l1.setFont(f1);
		l1.setBounds(50, 50, 500, 70);
		l1.setBackground(new Color(128,191,108));
		l1.setForeground(new Color(36,70,51));
		
		/******** TextArea ta �κ� *******/
		ta = new TextArea("\n\n\n      ��ư�� Ŭ���ϼ��� ��", 5, 10, TextArea.SCROLLBARS_NONE);
		ta.setBounds(50, 130, 350, 300);
		ta.setEditable(false);
		ta.setFont(f1);
		ta.setForeground(new Color(0,68,128));
			
		
		/******** Button b1 �κ� *******/
		b1 = new Button("ĸ��ȭ");
		b1.setFont(f1);
		b1.setBackground(new Color(17,57,9));
		b1.setForeground(Color.white);
		
		/******** Button b2 �κ� *******/
		b2 = new Button("���");
		b2.setFont(f1);
		b2.setBackground(new Color(17,57,9));
		b2.setForeground(Color.white);
		
		/******** Button b3 �κ� *******/
		b3 = new Button("������");
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
				ta.setText("ĸ��ȭ�� �߿��� �����͸� ����,��ȣ�ϴ� ���Դϴ�. \n\nĸ��ȭ(encapsulation)�� �Ϲ������� ���� �ִ� ������  "
						+ "�Լ��� Ŭ������ ���� �۾��� ���մϴ�. \n\n�� �۾��� Ŭ���� ����� �۾��� ����ϴٰ� ���� ���� �ֽ��ϴ�. "
						+ "������ ĸ��ȭ���� ���м��̶��� �־ Ŭ������ ��� ���� �� �߿��� �����ͳ� ����� �ܺο��� �������� ���ϰ� �� �� �ֽ��ϴ�.\n");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setFont(new Font("Serif", Font.BOLD, 20));
				ta.setText("�������� ���� Ÿ�������� ���� ����� �پ��� ��ü�� ����(�̿�)�� �� �ִ� ������ ���մϴ�.\n\n"
						+ "�θ� Ÿ�Կ��� ��� �ڽ� ��ü�� ���Ե� �� ������ �ڽ� Ÿ���� �θ� Ÿ������ �ڵ� Ÿ�� ��ȯ�� �˴ϴ�.\n"
						+ "�������� ��ü�� ��ǰȭ��ų �� �ֽ��ϴ�.\n");
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setFont(new Font("Serif", Font.BOLD, 20));
				ta.setText("���� ���迡�� ����̶� �θ� �ڽĿ��� �����ִ� ������, �θ� �ڽ��� �����ؼ� �����ִ� �������� ��ü���� ���α׷��ֿ����� ����� ���� ����� �ݴ�� �ڽ��� �θ� �����ؼ� �����޴� ���� ���մϴ�.\n\n"
						+ "\n�� ����� ȿ�� ��\n\n"
						+ "- �θ� Ŭ������ �����ؼ� ����\n"
						+ "- �ݺ��� �ڵ��� �ߺ��� �ٿ���\n" 
						+ "- ���� ������ ������ ����\n"
						+ "- ��ü�� �������� ����\n");
			}
		});
		*/
		
		/******** Panel p1 �κ� *******/
		p1 = new Panel();
		p1.setBounds(400, 130, 150, 300);
		p1.setBackground(Color.orange);
		p1.setLayout(new GridLayout(3,1));
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		
		
		
		/******** Cavas cvs �κ� *******/	
	    c1 = new Canvas() {
			public void paint(Graphics g) {
				g.drawImage(img, 0, 0, this);
			}
		};
		c1.setBounds(50, 450, 500, 200);
		c1.setBackground(Color.pink);

		
		
		/******** �����ӿ� ������Ʈ ���̱� *******/
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
			
			if(e.getActionCommand() == "ĸ��ȭ"){
				ta.setText("ĸ��ȭ�� �߿��� �����͸� ����,��ȣ�ϴ� ���Դϴ�. \n\nĸ��ȭ(encapsulation)�� �Ϲ������� ���� �ִ� ������  "
						+ "�Լ��� Ŭ������ ���� �۾��� ���մϴ�. \n\n�� �۾��� Ŭ���� ����� �۾��� ����ϴٰ� ���� ���� �ֽ��ϴ�. "
						+ "������ ĸ��ȭ���� ���м��̶��� �־ Ŭ������ ��� ���� �� �߿��� �����ͳ� ����� �ܺο��� �������� ���ϰ� �� �� �ֽ��ϴ�.\n");
				img = tk.getImage(imgArr[0]);
				c1.repaint(); 
			} else if(e.getActionCommand() == "���"){
				ta.setText("�������� ���� Ÿ�������� ���� ����� �پ��� ��ü�� ����(�̿�)�� �� �ִ� ������ ���մϴ�.\n\n"
						+ "�θ� Ÿ�Կ��� ��� �ڽ� ��ü�� ���Ե� �� ������ �ڽ� Ÿ���� �θ� Ÿ������ �ڵ� Ÿ�� ��ȯ�� �˴ϴ�.\n"
						+ "�������� ��ü�� ��ǰȭ��ų �� �ֽ��ϴ�.\n");
				img = tk.getImage(imgArr[1]);
				c1.repaint(); 
			} else {
				ta.setText("���� ���迡�� ����̶� �θ� �ڽĿ��� �����ִ� ������, �θ� �ڽ��� �����ؼ� �����ִ� �������� ��ü���� ���α׷��ֿ����� ����� ���� ����� �ݴ�� �ڽ��� �θ� �����ؼ� �����޴� ���� ���մϴ�.\n\n"
						+ "\n�� ����� ȿ�� ��\n\n"
						+ "- �θ� Ŭ������ �����ؼ� ����\n"
						+ "- �ݺ��� �ڵ��� �ߺ��� �ٿ���\n" 
						+ "- ���� ������ ������ ����\n"
						+ "- ��ü�� �������� ����\n");
				img = tk.getImage(imgArr[2]);
				c1.repaint(); 
			}
		}
	}
		
}
