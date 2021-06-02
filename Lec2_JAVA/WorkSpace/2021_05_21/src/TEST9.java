import java.awt.*;
import java.awt.event.*;


public class TEST9 extends Frame{
	Label q1, q2, score;
	Checkbox q1_cb1, q1_cb2, q1_cb3, q1_cb4;
	Checkbox q2_cb1, q2_cb2, q2_cb3, q2_cb4;
	CheckboxGroup group;
	Button end;
	
	TEST9(){
		super("Checkbox �̺�Ʈ ����");	//������ ���� ǥ����
		setLayout(new GridLayout(13,1, 5, 5));
		setBackground(new Color(199, 253, 196));
		setBounds(500, 200, 500, 400);
		addWindowListener(new WindowAdapter(){	//�͸�Ŭ������ ����ϴ� ���!
			public void windowClosing(WindowEvent e) {
				System.exit(0); 		//���� ����
			}
		}); 	
		
		
		q1 = new Label("1. ���� �� ActionEvent�� actionPerformed�޼ҵ尡 ȣ��ȴ� ��츦 ������");

		q1_cb1 = new Checkbox("Button�� ������ ��");
		q1_cb1.setBackground(Color.WHITE);
		q1_cb2 = new Checkbox("TextField���� EnterŰ ������ ��");
		q1_cb2.setBackground(Color.WHITE);
		q1_cb3 = new Checkbox("MenuItem�� Ŭ��������");
		q1_cb3.setBackground(Color.WHITE);
		q1_cb4 = new Checkbox("List���� ����Ŭ������ item ����������");
		q1_cb4.setBackground(Color.WHITE);
		
		q2 = new Label("2. Frame�� �⺻ LayoutManager��? (�ϳ��� ������.)");

		group = new CheckboxGroup();
		q2_cb1 = new Checkbox("FlowLayout", group, false);
		q2_cb1.setBackground(Color.WHITE);
		q2_cb2 = new Checkbox("GridLayout", group, false);
		q2_cb2.setBackground(Color.WHITE);
		q2_cb3 = new Checkbox("BorderLayout", group, false);
		q2_cb3.setBackground(Color.WHITE);
		q2_cb4 = new Checkbox("CardLayout", group, false);
		q2_cb4.setBackground(Color.WHITE);
		
		score = new Label("* ���: ");
		Font font = new Font("Sans", Font.BOLD, 20);
		score.setFont(font);
		
		end = new Button("�� ��ư�� �����ø� ����� �� �� �ֽ��ϴ�.");		//1. �̺�Ʈ ���, �̺�Ʈ �ҽ�
		
		end.addActionListener(new Event5());
		add(q1);add(q1_cb1);add(q1_cb2);add(q1_cb3);add(q1_cb4);
		add(new Label());		// �ƹ��͵� ���� ���̺�� ������ �־��.
		add(q2);add(q2_cb1);add(q2_cb2);add(q2_cb3);add(q2_cb4);
		
		add(score);add(end);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TEST9();
	}		

	
	class Event5 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			double totalScore = 0.0;
			
			if(q1_cb1.getState()) totalScore += 100/8.0;
			if(q1_cb2.getState()) totalScore += 100/8.0;
			if(q1_cb3.getState()) totalScore += 100/8.0;
			if(q1_cb4.getState()) totalScore += 100/8.0;
			if(q2_cb3.getState()) totalScore += 100/2;
			
			System.out.println("����� ������ "+ totalScore +"�� �Դϴ�.");
			score.setText("����� ������ "+ totalScore +"�� �Դϴ�.");
			
			score.setBackground(Color.white);
		}
	}
}
