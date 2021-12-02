import java.awt.*;
import java.awt.event.*;

public class StarEventTest2 extends Frame{

	Toolkit tk;
	Panel header, display,checkpan;
	Canvas canvas;
	Image img;
	Choice Mon, Day;
	Label title, hl1, hl2, hl3, bot1, bot2;
	Button btn1;
	Checkbox cb[];
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
	
	String constella[] = {
			"�����ڸ�",
			"������ڸ�",
			"���ڸ�",
			"Ȳ���ڸ�",
			"�ֵ����ڸ�",
			"���ڸ�",
			"�����ڸ�",
			"ó���ڸ�",
			"õĪ�ڸ�",
			"�����ڸ�",
			"����ڸ�",
			"�����ڸ�"
	};
	
	String fortune[] = {
			"ū ���� ���� ������ �¾��� �� ������ ��ġ�� �����Դϴ�.",
			"����� �������� �ϴ� �Ͽ� ū ������ ���� ���Դϴ�.",
			"�¾� ������ ������ ���������ϴ� ���� �Դϴ�.",
			"���õ��� �ɻ�ġ ���� ����� ���̴� �ణ�� �ս��� ����˴ϴ�.",
			"��� �ҽ��� ���Ǵ� �Ϸ��Դϴ�.",
			"�������� �ɵ��� �ִ� �繰�� ��ſ��� �귯������ �˴ϴ�.",
			"����, �ٽ�, ����Ÿ���� �����ߴ� �ϵ��� ����� ����ų �� �Դϴ�.",
			"���ϴ� �ٴ� ũ���� ����̳� ������ ����� �������� ���� ��Ÿ�����ϴ�.",
			"�ٸ� ��Ʈ���� �̵��̳� ���� ��ȯ�� ����˴ϴ�.",
			"�ϰ���� ���� ���� �ϰԲ� �䱸�ϴ� ����� ������ �ſ�, ������ ����!",
			"�Ϸ��� ó���� ������ ������ �����Ǵ� ����Դϴ�.",
			"����� ���� ���� �Ϸ��Դϴ�. ������ �� Ǯ���ϴ�."
	};
	Color c1 = new Color(91, 91, 91);
	Font f1 = new Font("SansSerif", Font.BOLD, 30);
	Font f2 = new Font("SansSerif", Font.BOLD, 20);
	Font f3 = new Font("SansSerif", Font.BOLD, 15);
	StarEventTest2(String string){
		super(string);
		
		//*****************************************************************Frame�κ�
		tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setSize(600, 600);
		this.setLocation((screenSize.width-this.getWidth())/2, (screenSize.height-this.getHeight())/2);
		this.setLayout(null);
		this.setBackground(Color.black);
		addWindowListener(new WindowAdapter(){	//�͸�Ŭ������ ����ϴ� ���!
			public void windowClosing(WindowEvent e) {
				dispose(); 		//���� ����
			}
		});
		
		
		//*********************************************************************Title�κ�
		title = new Label("<���ڸ� ã�ƺ���>");
		title.setBounds(310, 75, 265, 50);
		title.setForeground(Color.yellow);
		title.setBackground(c1);
		title.setFont(f1);
		title.setAlignment(Label.RIGHT);
		add(title);
		
		//*********************************************************************Header�κ�
		header = new Panel();
		header.setBackground(c1);
		header.setBounds(25, 125, 550, 50);
		header.setLayout(new FlowLayout());
		add(header);
		
		hl1 = new Label("����� ������ �Է��غ�����!");
		//hl1.setBounds(25, 0, 200, 50);
		hl1.setForeground(Color.YELLOW);
		hl1.setFont(f2);
		hl1.setAlignment(Label.CENTER);
		header.add(hl1);
		
		Mon = new Choice();
			for(int i=1;i<=12;i++) Mon.add(""+i+"��");
		header.add(Mon);
		
		hl2 = new Label("��");
		//hl1.setBounds(25, 0, 200, 50);
		hl2.setForeground(Color.YELLOW);
		hl2.setFont(f2);
		hl2.setAlignment(Label.LEFT);
		header.add(hl2);
		
		Day = new Choice();
			for(int i=1;i<=31;i++) Day.add(""+i+"��");
		header.add(Day);
		
		hl3 = new Label("��");
		//hl1.setBounds(25, 0, 200, 50);
		hl3.setForeground(Color.YELLOW);
		hl3.setFont(f2);
		hl3.setAlignment(Label.LEFT);
		header.add(hl3);
	
		btn1 = new Button("�Է�");
		btn1.setSize(50, 50);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = getIndex();
				hl1.setText(constella[index]+" ("+days[index]+")");
				img = tk.getImage(imgarr[index + 1]);
				canvas.repaint();
				
				bot1.setText(constella[index]+" ("+days[index]+")");
				bot2.setText("\""+fortune[index]+"\"");
			}
		});
		header.add(btn1);
	
		
		//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&display�κ�
		display = new Panel();
		display.setBounds(25, 200, 400, 370);
		display.setBackground(c1);
		display.setLayout(null);
		add(display);
		
		img = tk.getImage(imgarr[0]);
		canvas = new Canvas(){
			public void paint(Graphics g) {
				g.drawImage(img, 0, 0, 390, 290, Color.black, this);
			}
		};
		canvas.setBounds(5, 5, 390, 290);
		canvas.setBackground(c1);
		display.add(canvas);
		
		//***********************************************************************************************checkpan �κ�
		checkpan = new Panel();
		checkpan.setBounds(450, 200, 150, 370);
		checkpan.setBackground(c1);
		checkpan.setLayout(new GridLayout(12, 1, 1, 1));
		add(checkpan);
		
		CheckboxGroup group = new CheckboxGroup();
		cb = new Checkbox[12];
		
		for(int i=0;i<12;i++) {
			cb[i] = new Checkbox(constella[i], group, false);
			cb[i].setBackground(Color.BLACK);
			cb[i].setForeground(new Color((int)(Math.random()*156)+100, (int)(Math.random()*156)+100, (int)(Math.random()*156)+100));
			cb[i].addItemListener(new StellaCheckboxEvent());
			checkpan.add(cb[i]);
		}
		
		
		//**********************************************************************************************Bottom�κ�
		bot1 = new Label("");
		bot1.setBounds(5, 300, 400, 30);
		bot1.setForeground(Color.YELLOW);
		bot1.setAlignment(Label.LEFT);
		bot1.setFont(f3);
		display.add(bot1);
		
		bot2 = new Label("");
		bot2.setBounds(5, 330, 400, 30);
		bot2.setForeground(Color.YELLOW);
		bot2.setAlignment(Label.LEFT);
		
		display.add(bot2);
		
		
		setVisible(true);
	}
	
	public int getIndex() {
		int m = Mon.getSelectedIndex() + 1;
		int d = Day.getSelectedIndex() + 1;
		System.out.println("m="+m+", d="+d);
		switch(m) {
		case 1:
			if(d<=19) return 11;
			else return 0;
		case 2:
			if(d<=18) return 0;
			else return 1;
		case 3:
			if(d<=20) return 1;
			else return 2;
		case 4:
			if(d<=19) return 2;
			else return 3;
		case 5:
			if(d<=20) return 3;
			else return 4;
		case 6:
			if(d<=21) return 4;
			else return 5;
		case 7:
			if(d<=22) return 5;
			else return 6;
		case 8:
			if(d<=22) return 6;
			else return 7;
		case 9:
			if(d<=23) return 7;
			else return 8;
		case 10:
			if(d<=22) return 8;
			else return 9;
		case 11:
			if(d<=22) return 9;
			else return 10;
		case 12:
			if(d<=24) return 10;
			else return 11;
		}
		return 0 ;
	}
	
	class StellaCheckboxEvent implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			int index;
			
			for(index = 0;index<12;index++) {
				if(cb[index].getState()) break;
			}
			hl1.setText(constella[index]+" ("+days[index]+")");
			img = tk.getImage(imgarr[index + 1]);
			canvas.repaint();
			
			bot1.setText(constella[index]+" ("+days[index]+")");
			bot2.setText("\""+fortune[index]+"\"");
			
		}
	}
}
