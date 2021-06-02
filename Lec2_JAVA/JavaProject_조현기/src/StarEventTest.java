import java.awt.*;
import java.awt.event.*;

public class StarEventTest extends Frame{

	Toolkit tk;
	Panel panel;
	Canvas canvas;
	Image img;
	String imgarr[] = {
			"images/star0.jpg",
			"images/star1.png",
			"images/star2.png",
			"images/star3.png",
			"images/star4.png",
			"images/star5.png",
			"images/star6.png",
			"images/star7.png",
			"images/star8.png",
			"images/star9.png",
			"images/star10.png",
			"images/star11.png",
			"images/star12.png",
	};
	
	String days[] = {
			"01/20 ~ 02/18",
			"02/19 ~ 03/20",
			"03/21 ~ 04/19",
			"04/20 ~ 05/20",
			"05/21 ~ 06/21",
			"06/22 ~ 07/22",
			"07/23 ~ 08/22",
			"08/23 ~ 09/23",
			"09/24 ~ 10/22",
			"10/23 ~ 11/22",
			"11/23 ~ 12/24",
			"12/25 ~ 01/19"
	};
	TextField tf;
	List stella;
	
	StarEventTest(String string){
		super(string);
		
		//*****************************************************************Frame부분
		tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setSize(500, 525);
		this.setLocation((screenSize.width-this.getWidth())/2, (screenSize.height-this.getHeight())/2);
		this.setLayout(null);
		this.setBackground(Color.black);
		addWindowListener(new WindowAdapter(){	//익명클래스를 사용하는 방법!
			public void windowClosing(WindowEvent e) {
				dispose(); 		//완전 종료
			}
		});
		
		//*********************************************************************list 설정 부분
		stella = new List(12);
		stella.setBackground(Color.white);
		stella.setBounds(25, 75, 100, 200);
		stella.addActionListener(new ListEvent());
		stella.add("물병자리");
		stella.add("물고기자리");
		stella.add("양자리");
		stella.add("황소자리");
		stella.add("쌍둥이자리");
		stella.add("게자리");
		stella.add("사자자리");
		stella.add("처녀자리");
		stella.add("천칭자리");
		stella.add("전갈자리");
		stella.add("사수자리");
		stella.add("염소자리");
		
		this.add(stella);
		
		
		//******************************************************************* Panel 부분
		panel = new Panel();
		panel.setBounds(150, 75, 325, 400);
		panel.setBackground(Color.white);
		panel.setLayout(null);
		add(panel);
		
		
		img = tk.getImage(imgarr[0]);
		canvas = new Canvas(){
			public void paint(Graphics g) {
				g.drawImage(img, 0, 0, 325, 300, Color.black, this);
			}
		};
		canvas.setBounds(0, 0, 325, 300);
		canvas.setBackground(Color.gray);
		panel.add(canvas);
		
		
		tf = new TextField("별자리를 알아봅시다");
		tf.setFont(new Font("SansSerif", Font.BOLD, 20));
		tf.setBounds(0, 300, 325, 100);
		tf.setBackground(new Color(92, 92, 92));
		tf.setForeground(Color.YELLOW);
		tf.setEditable(false);
		panel.add(tf);
		setVisible(true);
	}
	
	class ListEvent implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			int index = stella.getSelectedIndex();
			
			img = tk.getImage(imgarr[index + 1]);
			tf.setText(days[index]);
			
			canvas.repaint();
		}
		
	}
}
