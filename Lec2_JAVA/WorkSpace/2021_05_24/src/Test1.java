import java.awt.*;
import java.awt.event.*;

class EventA implements WindowListener{//3. �̺�Ʈ ó����(�������� x��ư ������ ó���Ǵ� Ŭ����)
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
}

class EventB extends WindowAdapter{				//2�� �̻��� �߻� �޼ҵ带 ������ �ִ� �������̽��� �̸� Adaoer Ŭ������ �����Ǿ� �ֱ� ������
	public void windowClosing(WindowEvent e) {	//�ʿ��� �ݹ�޼ҵ常 �������̵��Ͽ� ����� �� �ִ�!!
		System.exit(0);
	}
}


public class Test1 extends Frame{
	Button b1;
	
	Test1(String str){
		super(str);
		this.setBounds(300,300, 500, 400);
		this.setBackground(Color.LIGHT_GRAY);
//		this.addWindowListener(new EventA());	// ������ ������ ���ø���Ʈ�ؼ� ����ϴ� ���
//		this.addWindowListener(new EventB());	// ������ ����͸� ��ӹ޾Ƽ� ���¹��
		this.addWindowListener(new WindowAdapter(){	//�͸�Ŭ������ ����ϴ� ���!
			public void windowClosing(WindowEvent e) {
				System.exit(0); 		//���� ����
			}
		}); 	
		
		this.addWindowListener(new EventA());
		b1 = new Button("Ȯ��");
		setVisible(true);
	}
	public static void main(String[] args) {
		Test1 test = new Test1("�̺�Ʈ ó�� ������~");
	}

}
