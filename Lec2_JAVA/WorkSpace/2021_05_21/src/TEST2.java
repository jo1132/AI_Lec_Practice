import java.awt.*;
public class TEST2 {

	public static void main(String[] args) {
		Frame f = new Frame("�ڹ� AWT�������Դϴ�.");
		//f.setBounds(300, 300, 500, 500);
		f.setLocation(400, 300);
		f.setSize(500, 400);
		
		Color color1 = new Color(255, 132, 132);
		//f.setBackground(Color.pink);
		f.setBackground(color1);
		f.setForeground(Color.DARK_GRAY);
		//�������� �⺻ ���̾ƿ���  Border���̾ƿ��̴�.
		f.setLayout(new GridLayout(1, 2));// ��-> ����, ��->�Ʒ�
		
		
		Panel pan = new Panel();		//�������� �����̳ʷ�, �ٸ� �������� �����̳ʿ� �پ ���´�.
		pan.setLayout(null);
		pan.setBackground(Color.CYAN);
		pan.setSize(f.getWidth()/2, f.getHeight());
		f.add(pan);
		
		Button b1 = new Button("��ư1");
		b1.setBackground(Color.green);
		b1.setBounds(10, 0, 50, 50);
		Button b2 = new Button("��ư2");
		b2.setBackground(Color.gray);
		b2.setBounds(60, 0, 50, 50);
		Button b3 = new Button("��ư3");
		b3.setBackground(Color.MAGENTA);
		b3.setBounds(110, 0, 50, 50);
		
		pan.add(b1);pan.add(b2);pan.add(b3);
		
		
		Panel pan2 = new Panel();		//�������� �����̳ʷ�, �ٸ� �������� �����̳ʿ� �پ ���´�.
		pan2.setLayout(new GridLayout(4, 3, 5, 5));
		pan2.setBackground(Color.WHITE);
		pan2.setSize(f.getWidth()/2, f.getHeight());
		f.add(pan2);
		int i;
		Button btns[] = new Button[12];
		for(i=0;i<12;i++) {
			if(i == 9) btns[i] = new Button("-");
			
			else if(i == 10) btns[i] = new Button("0");
			
			else if(i == 11) btns[i] = new Button("+");
			else btns[i] = new Button(""+(i+1));
	
			btns[i].setSize(50, 50);
			pan2.add(btns[i]);
		}
		
		
		
		
		f.setVisible(true);
	}

}
