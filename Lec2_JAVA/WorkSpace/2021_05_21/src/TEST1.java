import java.awt.*;
public class TEST1 {

	public static void main(String[] args) {
		Frame f = new Frame("자바 AWT연습중입니다.");
		//f.setBounds(300, 300, 500, 500);
		f.setLocation(400, 300);
		f.setSize(500, 400);
		
		Color color1 = new Color(95, 197, 252);
		//f.setBackground(Color.pink);
		f.setBackground(color1);
		f.setForeground(Color.DARK_GRAY);
		//프레임은 기본 레이아웃이  Border레이아웃이다.
		
		
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		Button btn3 = new Button("버튼3");
		Button btn4 = new Button("버튼4");
		Button btn5 = new Button("버튼5");
		//btn1.setBounds(50,50, 100, 100);
		btn1.setBackground(new Color(197, 185, 251));
		
		f.add(btn1, "North");
		f.add(btn2, "West");
		f.add(btn3, BorderLayout.EAST);
		f.add(btn4, BorderLayout.SOUTH);
		f.add(btn5, "Center");//프레임에 컨포넌트 붙이기기기기기기기기기
		
		f.setVisible(true);
	}

}
