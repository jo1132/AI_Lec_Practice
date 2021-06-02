import java.awt.*;
import java.awt.event.*;


public class Test4 extends Frame{

	CheckboxGroup bgroup;
	Checkbox bA, bB, bO, bAB;
	Panel btype;
	Label result, result2;
	Button ok;
	String str;
	
	Test4(String title){
		super(title);
		
		Font f1 = new Font("Serif", Font.BOLD+Font.ITALIC, 25);
		Font f2 = new Font("SansSerif", Font.BOLD, 35);
		//************************************************************** Frame�ʱ�ȭ �κ�
		this.setBounds(500, 300, 600, 400);
		this.setLayout(null);
		this.setBackground(Color.LIGHT_GRAY);
		
		this.addWindowListener(new WindowAdapter(){	//�͸�Ŭ������ ����ϴ� ���!
			public void windowClosing(WindowEvent e) {
				System.exit(0); 		//���� ����
			}
		}); 	
		
		//**************************************************************** Panel�κ�
		btype = new Panel();
		btype.setLayout(new FlowLayout());
		btype.setBounds(50, 50, 400, 60);
		//btype.setBackground(Color.GRAY);
		btype.setBackground(new Color(170, 0, 0));
		btype.setFont(f2);
		add(btype);
		
		//***************************************************************** checkbox�κ�
		bgroup = new CheckboxGroup();
		bA = new Checkbox("A��", bgroup, false);
		bA.setBackground(Color.RED);
		
		bB = new Checkbox("B��", bgroup, false); 
		bB.setBackground(Color.RED);
		
		bO = new Checkbox("O��", bgroup, false); 
		bO.setBackground(Color.RED);
		
		bAB = new Checkbox("AB��", bgroup, false);
		bAB.setBackground(Color.RED);
		
		bA.addItemListener(new BloodTypeEvent());
		bB.addItemListener(new BloodTypeEvent());
		bO.addItemListener(new BloodTypeEvent());
		bAB.addItemListener(new BloodTypeEvent());
		btype.add(bA);btype.add(bB);btype.add(bO);btype.add(bAB);
		
		//******************************************************************** Label�κ�
		result = new Label();
		result.setBounds(50, 150, 400, 100);
		result.setBackground(new Color(14, 156, 117));
		result.setForeground(Color.white);
		result.setFont(f1);
		add(result);
		
		result2 = new Label("�������� �������ּ���~GameObject");
		result2.setBounds(50, 275, 400, 100);
		result2.setBackground(new Color(23, 167, 253));
		result2.setForeground(Color.white);
		result2.setFont(f1);
		add(result2);
		//******************************************************************* ok���� ��ư �κ�
		ok = new Button("����");
		ok.setBounds(475, 50, 50, 200);
		ok.addActionListener(new ButtonEvent());
		add(ok);
		
		
		
		
		setVisible(true);
	}
	

	class BloodTypeEvent implements ItemListener{
		public void itemStateChanged(ItemEvent arg0) {
			Checkbox cb = (Checkbox) arg0.getSource();
			str = cb.getLabel();
			
			result.setText("����� �������� "+str+" �Դϴ�.");
		}
	}
	
	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//result2.setText("����� "+str+"�� �����ϼ̽��ϴ�.");
			if(bA.getState()) {
				System.out.println(bA.getLabel()+"�� �����ϼ̽��ϴ�!");
				result2.setText(bA.getLabel()+"�� �����ϼ̽��ϴ�!");
			}
			else if(bB.getState()) {
				System.out.println(bB.getLabel()+"�� �����ϼ̽��ϴ�!");
				result2.setText(bB.getLabel()+"�� �����ϼ̽��ϴ�!");
			}
			
			else if(bO.getState()) {
				System.out.println(bO.getLabel()+"�� �����ϼ̽��ϴ�!");
				result2.setText(bO.getLabel()+"�� �����ϼ̽��ϴ�!");
			}
			else {
				System.out.println(bAB.getLabel()+"�� �����ϼ̽��ϴ�!");
				result2.setText(bAB.getLabel()+"�� �����ϼ̽��ϴ�!");
			}
			
		}
	}
	public static void main(String[] args) {
		new Test4("������ ���α׷�");
	}
	
	
}
