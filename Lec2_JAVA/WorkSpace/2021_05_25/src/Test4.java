import java.awt.*;
import java.awt.event.*;


public class Test4 extends Frame{

	
	Test4(String title){
		super(title);
		
		//*****************************************************************Frame�κ�
		//this.setBounds(0, 0, 450, 650);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setSize(400, 300);
		this.setLocation((screenSize.width-this.getWidth())/2, (screenSize.height-this.getHeight())/2);
		this.setLayout(null);
		this.setBackground(Color.GRAY);
		addWindowListener(new WindowAdapter(){	//�͸�Ŭ������ ����ϴ� ���!
			public void windowClosing(WindowEvent e) {
				System.exit(0); 		//���� ����
			}
		}); 
		
				
		setVisible(true);
	}
	
	//paint() �޼ҵ� �ڵ�ȣ�� �ñ�
	//1. ó�� ȭ�鿡 ��Ÿ�� ��
	//2. �ٸ� ȭ�鿡 �������ٰ� �ٽ� ��Ÿ�� ��
	//3. �ּ�ȭ �Ǿ��ٰ� ����ũ��� �ٽ� ��Ÿ����
	
	public void paint(Graphics g) {
		g.setFont(new Font("SansSerif", Font.BOLD, 20));
		g.drawString("Hello JAVA~", 50,  100);
		
		g.setColor(Color.MAGENTA);
		g.drawLine(0, 0, 50, 100);
		
		g.setColor(Color.ORANGE);
		g.fillRoundRect(50,  150,  100,  100,  50,  50);
		
		g.fillPolygon(new int[] {200, 250, 330, 200},  //x��ǥ�� ����
					  new int[] {150, 190, 220, 250}, 4);	//y��ǥ�� ����, �������� ��ǥ
		
	}

	
	public static void main(String[] args) {
		new Test4("�׷��� ����");

	}

}
