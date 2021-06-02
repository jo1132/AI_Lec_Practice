import java.awt.*;	//AWT ������Ʈ ����ϱ�����
import java.awt.event.*; 	//���콺�̺�Ʈ�� ���� �̺�Ʈ ó������ ����ϱ� ����
import java.beans.EventHandler;


class Event1 implements WindowListener{		//3. �̺�Ʈ ó����

	@Override
	public void windowActivated(WindowEvent arg0) {}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("�������� �����մϴ�.");
		e.getWindow().setVisible(false);		//ȭ�鿡�� �Ⱥ��̱�
		e.getWindow().dispose();		//�޸𸮿��� �����ϱ�
		System.exit(0); 		//���� ����
	}

	@Override
	public void windowDeactivated(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowOpened(WindowEvent e) {}
	
}

class Event2 extends WindowAdapter{
	public void windowClosing(WindowEvent e) {
		System.out.println("�������� �����մϴ�. With Adapter");
		System.exit(0); 		//���� ����
	}
}
public class TEST6 {

	public static void main(String[] args) {
		Frame f = new Frame("�̺�Ʈ ó��");		//1. �̺�Ʈ �ҽ� (���)
		f.setBounds(500, 300, 500, 400);
		f.setBackground(Color.orange);
		
		//f.addWindowListener(new Event2()); 		//windowAdapter�� ����ϴ� ���!
		
		f.addWindowListener(new WindowAdapter(){	//�͸�Ŭ������ ����ϴ� ���!
			public void windowClosing(WindowEvent e) {
				System.exit(0); 		//���� ����
			}
		}); 	//2. ������(������)
		f.setVisible(true);
	}

}
