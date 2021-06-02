import java.awt.*;
public class TEST2 {

	public static void main(String[] args) {
		Frame f = new Frame("자바 AWT연습중입니다.");
		//f.setBounds(300, 300, 500, 500);
		f.setLocation(400, 300);
		f.setSize(500, 400);
		
		Color color1 = new Color(255, 132, 132);
		//f.setBackground(Color.pink);
		f.setBackground(color1);
		f.setForeground(Color.DARK_GRAY);
		//프레임은 기본 레이아웃이  Border레이아웃이다.
		f.setLayout(new GridLayout(1, 2));// 왼-> 오른, 위->아래
		
		
		Panel pan = new Panel();		//종속적인 컨테이너로, 다른 독립적인 컨테이너에 붙어서 나온다.
		pan.setLayout(null);
		pan.setBackground(Color.CYAN);
		pan.setSize(f.getWidth()/2, f.getHeight());
		f.add(pan);
		
		Button b1 = new Button("버튼1");
		b1.setBackground(Color.green);
		b1.setBounds(10, 0, 50, 50);
		Button b2 = new Button("버튼2");
		b2.setBackground(Color.gray);
		b2.setBounds(60, 0, 50, 50);
		Button b3 = new Button("버튼3");
		b3.setBackground(Color.MAGENTA);
		b3.setBounds(110, 0, 50, 50);
		
		pan.add(b1);pan.add(b2);pan.add(b3);
		
		
		Panel pan2 = new Panel();		//종속적인 컨테이너로, 다른 독립적인 컨테이너에 붙어서 나온다.
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
