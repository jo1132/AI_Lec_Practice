import java.awt.*;
import java.awt.event.*;

import javax.swing.GroupLayout.Alignment;


public class Test5 extends Frame{
	Panel menu, size;
	CheckboxGroup coffees, sizes;
	Checkbox cof1,cof2,cof3, siz1, siz2, siz3;
	Button button;
	Label price, coffeetitle, sizetitle;
	
	Test5(String title){
		super(title);
		
		Font f1 = new Font("Serif", Font.BOLD+Font.ITALIC, 30);
		Font f2 = new Font("SansSerif", Font.BOLD+Font.ITALIC, 16);
		Color c1 = new Color(164, 82, 0);
		Color c2 = new Color(255, 230, 204);
		//************************************************************** Frame초기화 부분
		this.setBounds(550, 300, 490, 550);
		this.setLayout(null);
		this.setBackground(new Color(85, 43, 0));
		
		this.addWindowListener(new WindowAdapter(){	//익명클래스를 사용하는 방법!
			public void windowClosing(WindowEvent e) {
				System.exit(0); 		//완전 종료
			}
		}); 
		
		//************************************************************* *패널 부분
		menu = new Panel();
		menu.setBounds(30, 50, 200, 300);
		menu.setBackground(c1);
		menu.setLayout(null);
		menu.setForeground(c1);
		menu.setFont(f2);
		add(menu);
		
		size = new Panel();
		size.setBounds(255, 50, 200, 300);
		size.setBackground(c1);
		size.setLayout(null);
		size.setForeground(c1);
		size.setFont(f2);
		add(size);
		
		//*************************************************************** menu, size title부분
		coffeetitle = new Label("커피 선택");
		coffeetitle.setBounds(25, 25, 150, 50);
		coffeetitle.setFont(f1);
		coffeetitle.setBackground(c2);
		menu.add(coffeetitle);
		
		sizetitle = new Label("사이즈 선택");
		sizetitle.setBounds(10, 25, 180, 50);
		sizetitle.setFont(f1);
		sizetitle.setBackground(c2);
		size.add(sizetitle);
		
		//*************************************************************** checkbox 부분
		coffees = new CheckboxGroup();
		cof1 = new Checkbox("아메리카노(1000원)", coffees, false);
		cof2 = new Checkbox("카페라떼(1500원)", coffees, false);
		cof3 = new Checkbox("초코라떼(2000원)", coffees, false);
		
		cof1.setBounds(10, 100, 180, 50); cof1.setBackground(c2);
		cof2.setBounds(10, 160, 180, 50); cof2.setBackground(c2);
		cof3.setBounds(10, 220, 180, 50); cof3.setBackground(c2);
		menu.add(cof1);menu.add(cof2);menu.add(cof3);
		
		sizes = new CheckboxGroup();
		siz1 = new Checkbox("Small", sizes, true);
		siz2 = new Checkbox("Midium(+500원)", sizes, false);
		siz3 = new Checkbox("Large(+1000원)", sizes, false);
		
		siz1.setBounds(10, 100, 180, 50); siz1.setBackground(c2);
		siz2.setBounds(10, 160, 180, 50); siz2.setBackground(c2);
		siz3.setBounds(10, 220, 180, 50); siz3.setBackground(c2);
		size.add(siz1);size.add(siz2);size.add(siz3);
		
		
		//****************************************************************** button 부분
		button = new Button("계  산");
		button.setBounds(30, 375, 430, 50);
		button.addActionListener(new EventH());
		add(button);
		
		
		//****************************************************************** Label부분
		price = new Label();
		price.setBounds(30, 450, 430, 50);
		price.setBackground(Color.BLACK);
		price.setForeground(Color.white);
		price.setText("커피를 선택해 주세요!");
		price.setAlignment(Label.RIGHT);
		add(price);
		
		setVisible(true);
	}
		
	class EventH implements ActionListener{
		int total;
		char siz;
		String coffeename;
		public void actionPerformed(ActionEvent arg0) {
			total = 0;
			
			if(cof1.getState()) {
				total += 1000;
				coffeename = "아메리카노";
			}
			else if(cof2.getState()) {
				total += 1500;
				coffeename = "카페라떼";
			}
			else if(cof3.getState()) {
				total += 2000;
				coffeename = "초코라뗴";
			}
			else price.setText("커피가 선택되지 않았습니다.");
			
			
			if(siz1.getState()) {
				total += 0;
				siz = 'S';
			}
			else if(siz2.getState()) {
				total += 500;
				siz = 'M';
			}
			else if(siz3.getState()) {
				total += 1000;
				siz = 'L';
			}
			
			if(total > 0) {
				price.setText(coffeename + siz + ", 총 "+ total +"원 입니다.");
			}
		}
	}
	

	public static void main(String[] args) {

		new Test5("Coffee Menu");
	}
}
