import java.awt.*;
import java.awt.event.*;

class Event3 implements ActionListener{
	public void actionPerformed(ActionEvent arg0) {		//3. �̺�Ʈ ó����
		System.out.println("Ȯ�ι�ư�� �����̽��ϴ�.");
	}
}

public class TEST7 {

	public static void main(String[] args) {
	Frame f = new Frame("��ư �̺�Ʈ ����");
	f.setBounds(500, 300, 500, 500);
	f.setBackground(Color.gray);
	f.setLayout(null);
	
	f.addWindowListener(new WindowAdapter(){	//�͸�Ŭ������ ����ϴ� ���!
		public void windowClosing(WindowEvent e) {
			System.exit(0); 		//���� ����
		}
	}); 	//2. ������(������)
	
	Button b1 = new Button("Ȯ��"); //1. �̺�Ʈ ��� (�ҽ�)
	b1.setBounds(70, 75, 150, 150);
	b1.addActionListener(new Event3());
	f.add(b1);
	
	Button b2 = new Button("���"); //1. �̺�Ʈ ��� (�ҽ�)
	b2.setBounds(230, 75, 150, 150);
	b2.addActionListener(new ActionListener(){			//�̺�Ʈ ó���⸦ �͸�Ŭ������ �����Ѱ�.
		public void actionPerformed(ActionEvent arg0) {		//3. �̺�Ʈ ó����
			System.out.println("����Դϴ�!��");
		}
	});
	f.add(b2);
	
	f.setVisible(true);
	}

}
