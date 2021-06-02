import java.awt.*;
import java.awt.event.*;


public class Test6 extends Frame implements MouseMotionListener{
	int x = 0, y = 0;
	Image img;
	Graphics gimg;
	
	Test6(String title){
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
		
		//*****************************************************************************888
		img = createImage(500, 500);
		gimg = img.getGraphics();
		gimg.drawString("���� ��ư�� ����ä�� ���콺�� ����������", 10, 50);
		repaint();
	}
	
	
	
	
	//paint() �޼ҵ� �ڵ�ȣ�� �ñ�
	//1. ó�� ȭ�鿡 ��Ÿ�� ��
	//2. �ٸ� ȭ�鿡 �������ٰ� �ٽ� ��Ÿ�� ��
	//3. �ּ�ȭ �Ǿ��ٰ� ����ũ��� �ٽ� ��Ÿ����
	public void paint(Graphics g) {
		if(img != null) {
			//g.drawImage(img, 0, 0, this);
			//����ȭ�鿡 �׷��� �׸��� Frame�� ����
			gimg.drawString("*", x, y);
		}
	}

	public void update(Graphics g) {		//Update�������̵�!
		paint(g);
	}
	


	
	public static void main(String[] args) {
		new Test6("�׷��� ����2");

	}

	public void mouseDragged(MouseEvent arg0) {
		if(arg0.getModifiers() == 16) {
			x = arg0.getX();
			y = arg0.getY();
			gimg.drawString("*", x, y);
		}
	}
	public void mouseMoved(MouseEvent arg0) {}
}
