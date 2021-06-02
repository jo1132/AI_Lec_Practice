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
		
		//*****************************************************************Frame�κ�
		tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setSize(500, 525);
		this.setLocation((screenSize.width-this.getWidth())/2, (screenSize.height-this.getHeight())/2);
		this.setLayout(null);
		this.setBackground(Color.black);
		addWindowListener(new WindowAdapter(){	//�͸�Ŭ������ ����ϴ� ���!
			public void windowClosing(WindowEvent e) {
				dispose(); 		//���� ����
			}
		});
		
		//*********************************************************************list ���� �κ�
		stella = new List(12);
		stella.setBackground(Color.white);
		stella.setBounds(25, 75, 100, 200);
		stella.addActionListener(new ListEvent());
		stella.add("�����ڸ�");
		stella.add("������ڸ�");
		stella.add("���ڸ�");
		stella.add("Ȳ���ڸ�");
		stella.add("�ֵ����ڸ�");
		stella.add("���ڸ�");
		stella.add("�����ڸ�");
		stella.add("ó���ڸ�");
		stella.add("õĪ�ڸ�");
		stella.add("�����ڸ�");
		stella.add("����ڸ�");
		stella.add("�����ڸ�");
		
		this.add(stella);
		
		
		//******************************************************************* Panel �κ�
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
		
		
		tf = new TextField("���ڸ��� �˾ƺ��ô�");
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
