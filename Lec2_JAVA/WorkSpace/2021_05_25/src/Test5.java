import java.awt.*;
import java.awt.event.*;


public class Test5 extends Frame implements MouseMotionListener{
	int x = 0, y = 0;
	
	
	Test5(String title){
		super(title);
		
		
		//*****************************************************************Frame�κ�
		//this.setBounds(0, 0, 450, 650);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setSize(500, 500);
		this.setLocation((screenSize.width-this.getWidth())/2, (screenSize.height-this.getHeight())/2);
		this.setLayout(null);
		this.setBackground(Color.white);
		addWindowListener(new WindowAdapter(){	//�͸�Ŭ������ ����ϴ� ���!
			public void windowClosing(WindowEvent e) {
				System.exit(0); 		//���� ����
			}
		}); 
		
		this.addMouseMotionListener(this);
		setVisible(true);
	}
	
	//paint() �޼ҵ� �ڵ�ȣ�� �ñ�
	//1. ó�� ȭ�鿡 ��Ÿ�� ��
	//2. �ٸ� ȭ�鿡 �������ٰ� �ٽ� ��Ÿ�� ��
	//3. �ּ�ȭ �Ǿ��ٰ� ����ũ��� �ٽ� ��Ÿ����
	public void paint(Graphics g) {
		g.setFont(new Font("Serif", Font.BOLD, 20));
		g.drawString("���콺�� ������ ������", 10,  60);
		
		g.drawString("*", x, y);
		
	
	}

	public void update(Graphics g) {		//Update�������̵�!
		paint(g);
	}
	


	
	public static void main(String[] args) {
		new Test5("�׷��� ����2");

	}

	public void mouseDragged(MouseEvent arg0) {
		x = arg0.getX();
		y = arg0.getY();
		
		repaint();			// repaint() - > update() -> paint() ȣ��ȴ�!
	}
	public void mouseMoved(MouseEvent arg0) {
		
	}

}
