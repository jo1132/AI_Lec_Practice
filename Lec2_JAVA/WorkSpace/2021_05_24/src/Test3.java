import java.awt.*;
import java.awt.event.*;


public class Test3 extends Frame{

	CheckboxGroup group;
	Checkbox cb1, cb2, cb3;
	
	Test3(String title){
		super(title);
		this.setBounds(500, 300, 500, 300);
		this.setLayout(new FlowLayout());
		this.setBackground(Color.RED);
		
		this.addWindowListener(new WindowAdapter(){	//�͸�Ŭ������ ����ϴ� ���!
			public void windowClosing(WindowEvent e) {
				System.exit(0); 		//���� ����
			}
		}); 	
		
		
		//******************************************************************Checkbox�κ�
		group = new CheckboxGroup();
		cb1 = new Checkbox("Red", group, true);
		cb2 = new Checkbox("Green", group, false);
		cb3 = new Checkbox("Blue", group, false);
		
		cb1.addItemListener(new EventG());
		cb2.addItemListener(new EventG());
		cb3.addItemListener(new EventG());
		//*******************************************************************�����ӿ� ������Ʈ ������
		add(cb1);add(cb2);add(cb3);
		setVisible(true);
	}
	
	//üũ�ڽ� cb1, cb2, cb3�� üũ ����/�������� �� ó���ϴ� Ŭ����
	class EventG implements ItemListener{
		public void itemStateChanged(ItemEvent arg0) {
			Checkbox cb = (Checkbox) arg0.getSource();
			String color = cb.getLabel();
			
			if(color.equals("Red")) {
				setBackground(Color.red);
				cb1.setBackground(Color.red);
				cb2.setBackground(Color.red);
				cb3.setBackground(Color.red);
			}
			else if(color.equals("Green")) {
				setBackground(Color.GREEN);
				cb1.setBackground(Color.GREEN);
				cb2.setBackground(Color.GREEN);
				cb3.setBackground(Color.GREEN);
			}
			else {
				setBackground(Color.BLUE);
				cb1.setBackground(Color.BLUE);
				cb2.setBackground(Color.BLUE);
				cb3.setBackground(Color.BLUE);
			}
			System.out.println(color);
		}
	}
	
	public static void main(String[] args) {
		new Test3("CheckBox Events");
	}
	
	
}
