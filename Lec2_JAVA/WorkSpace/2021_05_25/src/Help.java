import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;


public class Help extends Frame{
	
	Image img;
	Help(String title){
		super(title);
		//*****************************************************************Frame부분
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setSize(800, 530);
		this.setLocation((screenSize.width-this.getWidth())/2, (screenSize.height-this.getHeight())/2);
		this.setLayout(null);
		this.setBackground(Color.white);
		addWindowListener(new WindowAdapter(){	//익명클래스를 사용하는 방법!
			public void windowClosing(WindowEvent e) {
				System.exit(0); 		//완전 종료
			}
		}); 

		img = tk.getImage("images/img2.png");
		this.setIconImage(img);
		
		img = tk.getImage("images/img1.png");
		
		
		
		this.setVisible(true);
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
		new Help("이미지 보이기");

	}


}
