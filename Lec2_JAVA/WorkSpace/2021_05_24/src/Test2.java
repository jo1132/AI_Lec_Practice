import java.awt.*;
import java.awt.event.*;

class EventC extends WindowAdapter{				//2�� �̻��� �߻� �޼ҵ带 ������ �ִ� �������̽��� �̸� Adaoer Ŭ������ �����Ǿ� �ֱ� ������
	public void windowClosing(WindowEvent e) {	//�ʿ��� �ݹ�޼ҵ常 �������̵��Ͽ� ����� �� �ִ�!!
		System.exit(0);
	}
}


public class Test2 extends Frame{
	Label location;
	
	Test2(String str){
		super(str);
		/************************************************Font�κ�*/
		Font font = new Font("Serif", Font.BOLD+Font.ITALIC, 20);
		Font font2 = new Font("SansSerif", Font.BOLD+Font.ITALIC, 20);
		/************************************************Font�κ�*/
		Color c1 = new Color(187, 57, 135);
		Color c2 = new Color(122, 33, 211);
		/************************************************Frame�κ�*/
		this.setBounds(500, 300, 500, 300);
		this.setBackground(c1);
		//������(������) �ݱ�x ��ư ���� ��� �ݴ� �̺�Ʈ ó��(�͸� Ŭ����)
		this.addWindowListener(new EventC());
		this.setLayout(null);
		
		/************************************************Label�κ�*/
		location = new Label("Mouse Pointer Location");
		location.setBounds(10, 50, 250, 20);
		location.setBackground(c2);
		location.setFont(font);
		location.setForeground(Color.WHITE);
		this.add(location);
		
		/************************************************Mouse Event ó���κ�*/
		this.addMouseMotionListener(new EventD());	//���콺 ��ǥ ���
		this.addMouseListener(new EventF());		//���콺�� �����ӿ��� ������ ���� �޼����� ����
		
		setVisible(true);
	}
	
	
	
	// ���� Ŭ������ EventD Ŭ���� �ۼ�
	// ���� Ŭ������ ����ϸ� �ܺ� Ŭ������ ��� ���� ����
	class EventD implements MouseMotionListener{
		public void mouseDragged(MouseEvent arg0) {}
		public void mouseMoved(MouseEvent arg0) {
			location.setText("Mouse: ("+arg0.getX()+","+arg0.getY()+")");
		}
	}
	
	class EventF implements MouseListener{

		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {
			location.setText("Mouse Pointer Location");
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
	}
	
	public static void main(String[] args) {
		new Test2("Mouse Event Test");
	}
}
