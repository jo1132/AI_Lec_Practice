import java.awt.*;
import java.awt.event.*;

public class Test3 extends Frame{
	Label label, result;
	TextField tf;
	
	Test3(String title){
		super(title);
		
		Font f1 = new Font("Serif", Font.BOLD+Font.ITALIC, 30);
		Font f2 = new Font("SnasSerif", Font.BOLD, 30);
		
		
		//*****************************************************************Frame�κ�
		//this.setBounds(0, 0, 450, 650);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setSize(350, 300);
		this.setLocation((screenSize.width-this.getWidth())/2, (screenSize.height-this.getHeight())/2);
		this.setLayout(null);
		this.setBackground(Color.GRAY);
		addWindowListener(new WindowAdapter(){	//�͸�Ŭ������ ����ϴ� ���!
			public void windowClosing(WindowEvent e) {
				System.exit(0); 		//���� ����
			}
		}); 
		
		
		//******************************************************************* Top Label�κ�
		label = new Label("���� �Է��ϼ���");
		label.setBounds(25, 50, 300, 50);
		//label.setBackground(Color.WHITE);
		label.setFont(f1);
		label.setAlignment(Label.CENTER);
		add(label);
		
		
		//******************************************************************** textField �κ�
		tf = new TextField();
		tf.setBounds(25, 125, 300, 50);
		tf.requestFocus();
		tf.selectAll();
		tf.addActionListener(new MoneyEvents());
		tf.setFont(f2);
		add(tf);
		
		//******************************************************************* Top Label�κ�
		result = new Label();
		result.setBounds(25, 200, 300, 50);
		result.setBackground(Color.WHITE);
		result.setFont(f1);
		result.setAlignment(Label.RIGHT);
		add(result);
				
				
		setVisible(true);
	}
	
	
	class MoneyEvents implements ActionListener{			//����Ŭ���� ����� 3. �̺�Ʈ ó����
		String str = tf.getText();
		public void actionPerformed(ActionEvent arg0) {
			
			result.setText(tf.getText() + "�� �Դϴ�");
			tf.requestFocus();
			tf.setText("");
		}
	}
	
	
	public static void main(String[] args) {
		new Test3("Money Events");

	}

}
