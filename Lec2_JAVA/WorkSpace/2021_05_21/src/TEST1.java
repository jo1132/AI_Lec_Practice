import java.awt.*;
public class TEST1 {

	public static void main(String[] args) {
		Frame f = new Frame("�ڹ� AWT�������Դϴ�.");
		//f.setBounds(300, 300, 500, 500);
		f.setLocation(400, 300);
		f.setSize(500, 400);
		
		Color color1 = new Color(95, 197, 252);
		//f.setBackground(Color.pink);
		f.setBackground(color1);
		f.setForeground(Color.DARK_GRAY);
		//�������� �⺻ ���̾ƿ���  Border���̾ƿ��̴�.
		
		
		Button btn1 = new Button("��ư1");
		Button btn2 = new Button("��ư2");
		Button btn3 = new Button("��ư3");
		Button btn4 = new Button("��ư4");
		Button btn5 = new Button("��ư5");
		//btn1.setBounds(50,50, 100, 100);
		btn1.setBackground(new Color(197, 185, 251));
		
		f.add(btn1, "North");
		f.add(btn2, "West");
		f.add(btn3, BorderLayout.EAST);
		f.add(btn4, BorderLayout.SOUTH);
		f.add(btn5, "Center");//�����ӿ� ������Ʈ ���̱���������
		
		f.setVisible(true);
	}

}
