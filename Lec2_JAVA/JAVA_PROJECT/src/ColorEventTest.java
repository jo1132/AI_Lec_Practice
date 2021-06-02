import java.awt.*;
import java.awt.event.*;

public class ColorEventTest extends Frame {
	Button b1,b2,b3,b4,b5; // 1. �̺�Ʈ ���(�ҽ�)
	Font f1 = new Font("Serif", Font.BOLD, 20);
	
	ColorEventTest(String title){
		super(title);
		//setBounds(0, 0, 500, 600);
		setLayout(null); // ������ ���̾ƿ� ������!
		
		// �������� ȭ�� �߾ӿ� ���̱�
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		setBounds((screenSize.width)/2-250, (screenSize.height)/2-300, 500, 600);
		
		
		// �ݱ�x ��ư �̺�Ʈ ó��
		addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) { 
				dispose(); // �޸𸮿��� ����
			}
		});
		
		/*************** ��ư �κ� ***************/
		b1 = new Button("����");
		b1.setBounds(50, 50, 180, 150);
		b1.setBackground(Color.red);
		b1.setFont(f1);
		b1.addActionListener(new ActionListener() { // 2. �̺�Ʈ ������(������)
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.red);
			}
		}); 
		
		
		b2 = new Button("���");
		b2.setBounds(260, 50, 180, 150);
		b2.setBackground(Color.yellow);
		b2.setFont(f1);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.yellow);
			}
		}); 
		
		
		b3 = new Button("�Ķ�");
		b3.setBounds(50, 230, 180, 150);
		b3.setBackground(Color.blue);
		b3.setFont(f1);
		b3.setForeground(Color.white);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.blue);
			}
		}); 
		
		
		b4 = new Button("�ʷ�");
		b4.setBounds(260, 230, 180, 150);
		b4.setBackground(Color.green);
		b4.setFont(f1);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.green);
			}
		});
		
		
		b5 = new Button("����");
		b5.setBounds(150, 410, 180, 150);
		b5.setFont(f1);
		b5.addActionListener(new EventColor());
		
		
		/********* �����ӿ� ������Ʈ ���̱� ***********/
		add(b1);  
		add(b2);
		add(b3); 
		add(b4);
		add(b5);
		
		
		setVisible(true);
	}
	
	// ����Ŭ���� ����� 3. �̺�Ʈ ó����
	class EventColor implements ActionListener { // 10:10~
		public void actionPerformed(ActionEvent e) {
			int r = (int)(Math.random()*5); 
			// 0.0 <= r < 1.0
			// 0.0 <= r < 5.0
			// 0 <= r < 5
			// ����, 0,1,2,3,4
			Color c[] = {Color.cyan, Color.gray, 
					Color.pink, Color.orange, Color.magenta};
			setBackground(c[r]); // ���� ���� ����!
		}
	}

}



