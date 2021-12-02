import java.awt.*;
import java.awt.event.*;

public class ChatEvent extends Frame{
	TextArea ta;	//��� ���� �ִ� ���� ������,
	TextField tf;	 //���ٷ� �Է��� ��.
	Button b1;
	
	
	ChatEvent(String title){
		super(title);
	
		Font f1 = new Font("Serif", Font.BOLD+Font.ITALIC, 30);
		Font f2 = new Font("SnasSerif", Font.BOLD, 30);
		//*****************************************************************Frame�κ�

		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setSize(450, 650);
		this.setLocation((screenSize.width-this.getWidth())/2, (screenSize.height-this.getHeight())/2);
		this.setLayout(new BorderLayout());
		addWindowListener(new WindowAdapter(){	//�͸�Ŭ������ ����ϴ� ���!
			public void windowClosing(WindowEvent e) {
				dispose(); 		//���� ����
			}
		}); 
		
		
		//******************************************************************TextArea �κ�
		ta = new TextArea("Hello~\n", 4, 10);
		ta.setBounds(25, 50, 400, 500);
		ta.setEditable(false);
		this.add("Center", ta);
		
		//******************************************************************TextField �κ�
		tf = new TextField();		//1.�̺�Ʈ �ҽ�
		tf.addActionListener(new EventChat());	//2. �̺�Ʈ ����
		tf.requestFocus();
		this.add(tf, BorderLayout.SOUTH);
			
		//******************************************************************Button �κ�
		b1 = new Button("Ŭ��");
		b1.addActionListener(new EventChat());
		add(BorderLayout.NORTH, b1);
		
		this.setVisible(true);
	}
	
	class EventChat implements ActionListener{	//3. �̺�Ʈ ó���Դϴ�.
		public void actionPerformed(ActionEvent arg0) {
			ta.append(tf.getText()+"\n");
			//tf.requestFocus();
			//tf.selectAll();
			tf.setText("");
		}
	}
}
