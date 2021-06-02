import java.awt.*;
import java.awt.event.*;

public class Test1 extends Frame{
	Button b1, b2, b3, b4, b5;
	
	Test1(String title){
		super(title);
		
		
		Font f1 = new Font("Serif", Font.BOLD+Font.ITALIC, 30);
		Font f2 = new Font("SnasSerif", Font.BOLD, 30);
		//*****************************************************************Frame�κ�
		//this.setBounds(0, 0, 450, 650);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setSize(450, 650);
		this.setLocation((screenSize.width-this.getWidth())/2, (screenSize.height-this.getHeight())/2);
		this.setLayout(null);
		addWindowListener(new WindowAdapter(){	//�͸�Ŭ������ ����ϴ� ���!
			public void windowClosing(WindowEvent e) {
				System.exit(0); 		//���� ����
			}
		}); 
		
		
		//****************************************************************��ư�κ�
		b1 = new Button("����");
		b1.setBounds(50, 50, 150, 150);
		b1.setBackground(Color.red);
		b1.setFont(f1);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(new EventColor());
		add(b1);
		
		b2 = new Button("���");
		b2.setBounds(250, 50, 150, 150);
		b2.setBackground(Color.yellow);
		b2.setFont(f1);
		b2.addActionListener(new EventColor());
		add(b2);
		
		b3 = new Button("�ʷ�");
		b3.setBounds(50, 250, 150, 150);
		b3.setBackground(Color.GREEN);
		b3.setFont(f1);
		b3.addActionListener(new EventColor());
		add(b3);
		
		b4 = new Button("����Ÿ");
		b4.setBounds(250, 250, 150, 150);
		b4.setBackground(Color.MAGENTA);
		b4.setFont(f1);
		b4.setForeground(Color.white);
		b4.addActionListener(new EventColor());
		add(b4);
		
		b5 = new Button("Random");
		b5.setBounds(150, 450, 150, 150);
		b5.setFont(f1);
		b5.addActionListener(new EventColor());
		add(b5);
		
		
		setVisible(true);
	}
	
	
	class EventColor implements ActionListener{			//����Ŭ���� ����� 3. �̺�Ʈ ó����
		public void actionPerformed(ActionEvent arg0) {		
			Button bt = (Button) arg0.getSource();
			if(bt.getLabel() == "Random") setBackground(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
			
			else setBackground(bt.getBackground());
		}
	}
	
	
	public static void main(String[] args) {
		new Test1("Color Events");

	}

}
