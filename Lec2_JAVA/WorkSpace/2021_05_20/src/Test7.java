import java.awt.*; 		// �����̳�, ������Ʈ �̿��ϱ� ����.

public class Test7 {

	public static void main(String[] args) {
		
		int i, j;
		Button[][] bts = new Button[10][10];
		Frame f = new Frame("������ ������ �Դϴ�..."); // ������ ��ü����!  == �����̳�?
							// ���Ⱑ  â�� �̸��� �ȴ�. (HTML�� Ÿ��Ʋ�� ����)
		
		f.setBounds(200,300,600,600);	//setSize�� setLocation �� �ΰ��� �ѹ��� ó���ϴ� ����̴�.
										//�������� ������ġx, ������ġy, �ʺ�, ����, �� �ѹ��� �����Ѵ�.
		
		f.setBackground(Color.GRAY);
		
		
		f.setTitle("����������~~");
		String str = f.getTitle();
		System.out.println("����ǥ������ ������ " + str + "�Դϴ�.");
		
		f.setLayout(null); 	//�⺻ ���̾ƿ� �Ⱦ��� ���� ��ǥ�� ��ġ��Ŵ
		//f.setSize(400, 300);	//�������� �ʺ�, ���� ����.
		//f.setLocation(200, 300);  	//�������� ���� ��ġ(x, y)����.
		
		
		Button b1 = new Button("��ư�� ���� ������.");
		b1.setBounds(100, 100, 100, 100);
		b1.setBackground(Color.pink);
		b1.setForeground(Color.white);
		
		Button b2 = new Button("��ư2�� ��������!");
		b2.setBounds(200, 100, 100, 100);
		b2.setBackground(Color.red);
		b2.setForeground(Color.CYAN);
		//�������� ������Ʈ ���̱�
		
		for(i=0;i<10;i++) {
			for(j=0;j<10;j++) {
				bts[i][j] = new Button(""+i+j);
				bts[i][j].setBounds((i*50+50), (j*50 + 50), 50, 50);
				bts[i][j].setBackground(Color.GRAY);
				f.add(bts[i][j]);
			}
		}
		//f.add(b1);
		//f.add(b2);
		
		f.setVisible(true);		//������ ���̱�
	}

}
