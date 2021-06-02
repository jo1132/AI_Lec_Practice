import java.awt.*;
import java.awt.event.*;

public class ChatEventTest extends Frame {
	TextArea ta; // ��� ���� �ִ� ���� ���� ��
	TextField tf; // �� �ٷ� �Է��� ��
	Button b1;
	
	ChatEventTest(String title){
		super(title);
		// �������� �⺻ ���̾ƿ��� �������̾ƿ�(��,��,��,��,�߾�)
		
		Toolkit tk = Toolkit.getDefaultToolkit(); // �������� ȭ�� �߾ӿ� ���̱�
		Dimension screenSize = tk.getScreenSize();
		setBounds((screenSize.width)/2-350, (screenSize.height)/2-250, 700, 500);
		
		// �ݱ�x ��ư �̺�Ʈ ó��
		addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) { 
				dispose();
			}
		});
				
		
		/************** Button b1 �κ� ****************/
		b1 = new Button("Ŭ��");
		b1.addActionListener(new EventChat());
		
		/************** TextArea ta �κ� ****************/
		ta = new TextArea("Hello~\n", 4, 10);
		ta.setEditable(false); // ��Ȱ��
		
		/************** TextField tf �κ� ****************/
		tf = new TextField(""); // 1. �̺�Ʈ �ҽ�
		tf.addActionListener(new EventChat()); // 2. �̺�Ʈ ������(������)

		
		/************** �����ӿ� ������Ʈ ���̱� ****************/
		add("Center", ta); // �߾ӿ� ta ���̱�
		add(tf, BorderLayout.SOUTH); // ���ʿ� tf ���̱�
		add(BorderLayout.NORTH, b1); // ���ʿ� b1 ���̱�
		
		setVisible(true);
	}
	
	// 3. �̺�Ʈ ó����
	class EventChat implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			ta.append(tf.getText() + "\n");
			tf.requestFocus(); 
			tf.selectAll();
		}
	}
	
}






