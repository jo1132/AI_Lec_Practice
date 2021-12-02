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
		
		//*****************************************************************Frame�κ�
		Dimension screenSize = tk.getScreenSize();
		this.setSize(500, 700);
		this.setLocation((screenSize.width-this.getWidth())/2, (screenSize.height-this.getHeight())/2);
		this.setLayout(null);
		this.setBackground(Color.white);
		addWindowListener(new WindowAdapter(){	//�͸�Ŭ������ ����ϴ� ���!
			public void windowClosing(WindowEvent e) {
				dispose(); 		//���� ����
			}
		}); 
		
		
		//****************************************************************** Title Label�κ�
		title = new Label("�������� ���Ǳ�");
		title.setBounds(50, 50, 400, 50);
		title.setBackground(Color.LIGHT_GRAY);
		title.setFont(f1);
		title.setAlignment(Label.CENTER);
		add(title);
		
		//****************************************************************** Panel�κ�
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
		
		//****************************************************************** display �г� ä���
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
		
		
		
		//******************************************************************  press �г� ä���
		b1 = new Button("��������");
		b1.addActionListener(null);
		b1.addActionListener(new ButtonEvents());
		press.add(b1);
		
		b2 = new Button("����");
		b2.addActionListener(null);
		b2.addActionListener(new ButtonEvents());
		press.add(b2);
		
		b3 = new Button("¡¡��");
		b3.addActionListener(null);
		b3.addActionListener(new ButtonEvents());
		press.add(b3);
		
		b4 = new Button("���Ի���");
		b4.addActionListener(null);
		b4.addActionListener(new ButtonEvents());
		press.add(b4);
		
		//******************************************************************** space ���� ä���
		ta = new TextArea("",0, 0, TextArea.SCROLLBARS_NONE);
		ta.setBounds(0, 0, space.getWidth(), space.getHeight() );
		ta.setEditable(false);
		ta.setBackground(new Color(95, 86, 252));
		ta.setForeground(Color.white);
		ta.setFont(f2);
		ta.setText("���������� ���ξ��� ����� ���� ��� ���Ը��ƿ��� �丮�ϴ� ���� �����ϴ� Ȱ������ �������� ������ �ظ鵿���̴�(�ܸ�� �ֹ�� �������� �� ������). �״� �ֿϵ����� �������� �����̸� Ű��� �ִ�.");

		space.add(ta);
		setVisible(true);
	}

	
	class ButtonEvents implements ActionListener{
		Button bt;
		public void actionPerformed(ActionEvent e) {
			bt = (Button) e.getSource();
			if(bt.getLabel() == "��������") {
				ta.setText("���������� ���ξ��� ����� ���� ��� ���Ը��ƿ��� �丮�ϴ� ���� �����ϴ� Ȱ������ �������� ������ �ظ鵿���̴�(�ܸ�� �ֹ�� �������� �� ������). �״� �ֿϵ����� �������� �����̸� Ű��� �ִ�.");
				img = img1;
				canvas.repaint();
			}
			else if(bt.getLabel() == "����") {
				ta.setText("���̴� �Ұ��縮�̸� ���������� ����Ʈ �������̴�. ���Ҿ� ���̴� ���� Ư���� ���� ������ �ڽ��� �ȶ��ϴٰ� �����Ѵ�. �Ǽ��� �γ� ��ȣ ������ �ֿ� �Ӹ��� õ�簡 �� ���� �־���. �׸��� ���̴� ���б��� �����Ͽ�����.");
				img = img2;
				canvas.repaint();
			}
			else if(bt.getLabel() == "¡¡��") {
				ta.setText("¡¡�̴� ���������� �̿����� ���Ը��ƿ��� ���� ���ϴ� �����̴�. ¡¡�̴� ����̿� ����� ���� ��� �ڽſ��� ���� ��ġ�� ��������� ���̸� �Ⱦ��ϴ� ���� ĳ�����̴�. �״� Ŭ�󸮳��� �����ϰų� ��ȭ���� �׸��� ���� ����. �׷��� �ڽ��� �ϰ� �ִ� ī���� ���� ������ �Ⱦ��Ѵ�.");
				img = img3;
				canvas.repaint();
			}
			else if(bt.getLabel() == "���Ի���") {
				ta.setText("����(Mr. Krabs��ũ����)�� ���� �ſ� �����ϴ� ���̸� ���Ը���(Krusty Krab��ũ����Ƽ ũ��)�� �������� ���������� �����̴�. ũ�������Դ� ����(Pearl����)��� �̸��� 10���� ���� ���� �ִµ� ũ������ ���� �ڽ��� �繰�� �����ϰ� ����Ѵ�. ��������� ������ ��� �ִ�.");
				img = img4;
				canvas.repaint();
			}
		}
	}
}
