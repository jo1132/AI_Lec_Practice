import java.awt.*;
import java.awt.event.*;

public class OpenMessage extends Frame{
	
	Toolkit tk = Toolkit.getDefaultToolkit();
	
	Label label;
	OpenMessage(boolean flag){
		//******************************************************************************************Frame 초기화 부분
		Dimension screenSize = tk.getScreenSize();
		this.setSize(200, 100);
		this.setLocation((screenSize.width-this.getWidth())/2, (screenSize.height-this.getHeight())/2);
		this.setLayout(null);
		this.setBackground(Color.white);
		addWindowListener(new WindowAdapter(){	//익명클래스를 사용하는 방법!
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		}); 
		
		
		label = new Label();
		label.setFont(new Font("SansSerif", Font.BOLD, 20));
		label.setBounds(25, 25, 150, 50);
		label.setAlignment(Label.CENTER);
		this.add(label);
		if(flag) {
			label.setText("You Lose!!!");
		}
		else {
			label.setText("You Win!!!");
		}
		
		this.setVisible(true);
	}
}
