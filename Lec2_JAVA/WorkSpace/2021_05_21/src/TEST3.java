import java.awt.*;
public class TEST3 {

	public static void main(String[] args) {
		Frame f = new Frame("자바 AWT연습중입니다.");
		//f.setBounds(300, 300, 500, 500);
		f.setLocation(400, 300);
		f.setSize(500, 700);
		
		Color color1 = new Color(179, 140, 113);
		//f.setBackground(Color.pink);
		f.setBackground(color1);
		f.setForeground(Color.DARK_GRAY);
		//프레임은 기본 레이아웃이  Border레이아웃이다.
		f.setLayout(new GridLayout(3, 1, 10, 10));
		
		
		Panel pan1 = new Panel();
		pan1.setBackground(Color.pink);
		pan1.setLayout(null);
		f.add(pan1);
		Panel pan2 = new Panel();
		pan2.setBackground(Color.green);
		pan2.setLayout(null);
		f.add(pan2);
		Panel pan3 = new Panel();
		pan3.setBackground(Color.BLUE);
		pan3.setLayout(null);
		f.add(pan3);
		
		
//-------------------------------------------------
		Label label1 = new Label("당신의 혈액형을 고르세요");
		label1.setBackground(Color.WHITE);
		label1.setBounds(50, 50, 400, 100);
		label1.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 30));
		label1.setForeground(Color.MAGENTA);
		label1.setAlignment(Label.CENTER);
		pan1.add(label1);
		
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		btn1.setBounds(50, 160, 130, 50);
		btn2.setBounds(320, 160, 130, 50);
		
		pan1.add(btn1);pan1.add(btn2);

		
//---------------------------------------------------
		CheckboxGroup abc = new CheckboxGroup();
		Checkbox cb1 = new Checkbox("A형", abc, true);
		Checkbox cb2 = new Checkbox("B형", abc, false);
		Checkbox cb3 = new Checkbox("C형", abc, false);
		Checkbox cb4 = new Checkbox("D형", abc, false);
		Button btn3 = new Button("확인");
		
		cb1.setBounds(50, 50, 70, 50);
		cb1.setBackground(Color.RED);
		cb2.setBounds(120, 50, 70, 50);
		cb2.setBackground(Color.RED);
		cb3.setBounds(190, 50, 70, 50);
		cb3.setBackground(Color.RED);
		cb4.setBounds(260, 50, 70, 50);
		cb4.setBackground(Color.RED);
		
		btn3.setBounds(150, 120, 150, 60);
		btn3.setFont(new Font("Serif", Font.BOLD, 10));
		pan2.add(cb1);pan2.add(cb2);pan2.add(cb3);pan2.add(cb4);pan2.add(btn3);
	
		
//----------------------------------------------------------------
		
		Label label2 = new Label("당신의 혈액형은?");
		label2.setBackground(Color.WHITE);
		label2.setBounds(50, 50, 400, 100);
		label2.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 30));
		label2.setForeground(Color.black);
		label2.setAlignment(Label.CENTER);
		pan3.add(label2);
		f.setVisible(true);
	}

}
