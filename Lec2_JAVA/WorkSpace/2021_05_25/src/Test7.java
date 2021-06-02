import java.awt.*;
import java.awt.event.*;


public class Test7 extends Frame{

	Image img;
	Button btn;
	
	Test7(String title){
		super(title);
		//*****************************************************************Frame�κ�
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setSize(600, 600);
		this.setLocation((screenSize.width-this.getWidth())/2, (screenSize.height-this.getHeight())/2);
		this.setLayout(null);
		this.setBackground(Color.white);
		addWindowListener(new WindowAdapter(){	//�͸�Ŭ������ ����ϴ� ���!
			public void windowClosing(WindowEvent e) {
				System.exit(0); 		//���� ����
			}
		}); 
		
		//********************************************************************img �κ�
		img = tk.getImage("img1.png");
		
		
		//**********************************************************************888
		btn = new Button();
		setVisible(true);
	}
	
	
	public void paint(Graphics g) {
		int imgWid, imgHei;
		if(img == null) {
			System.out.println("Image not found");
			return;
		}
		
		imgWid = img.getWidth(this);
		imgHei = img.getHeight(this);
		
		g.drawImage(img, (getWidth() - imgWid)/2, (getHeight() - imgHei)/2, imgWid, imgHei, this);
	}

	public static void main(String[] args) {
		new Test7("�̹��� ���̱�");

	}


}
