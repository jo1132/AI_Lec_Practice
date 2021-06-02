import java.awt.*; 		// 컨테이너, 컴포넌트 이용하기 위해.

public class Test10 {

	public static void main(String[] args) {
		Frame f = new Frame("Check Box 연습: 혈액형 선택");
		f.setBounds(500, 300, 500, 500);
		f.setLayout(null);
		f.setBackground(new Color(191,191,191));
		//Color c1 = new Color(191,191,191);
		//f.setBackground(c1);
		Label lb = new Label("당신의 혈액형을 고르세요!");
		Font f1 = new Font("ITALIC", Font.BOLD, 20);
		lb.setBounds(50, 50, 400, 50);
		lb.setFont(f1);
		lb.setForeground(new Color(0, 64 ,128));
		f.add(lb);
		
		CheckboxGroup abc = new CheckboxGroup();
		Checkbox cb1 = new Checkbox("A형", abc, true);
		Checkbox cb2 = new Checkbox("B형", abc, false);
		Checkbox cb3 = new Checkbox("C형", abc, false);
		Checkbox cb4 = new Checkbox("D형", abc, false);
		
		cb1.setBounds(50, 100, 70, 50);
		cb2.setBounds(50, 150, 70, 50);
		cb3.setBounds(50, 200, 70, 50);
		cb4.setBounds(50, 250, 70, 50);
		f.add(cb1);f.add(cb2);f.add(cb3);f.add(cb4);
		
		
		Label label2 = new Label("당신의 취미를 고르세요!");
		Font font2 = new Font("Dialog", Font.BOLD, 30);
		label2.setBounds(50, 300, 400, 50);
		label2.setFont(font2);
		label2.setForeground(new Color(237, 101, 175));
		
		Checkbox hobby1 = new Checkbox("영화감상", false);
		Checkbox hobby2 = new Checkbox("운동", false);
		Checkbox hobby3 = new Checkbox("여행", false);
		Checkbox hobby4 = new Checkbox("사진찍기", false);
				
		hobby1.setBounds(50, 340, 70, 50);
		hobby2.setBounds(120, 340, 70, 50);
		hobby3.setBounds(190, 340, 70, 50);
		hobby4.setBounds(260, 340, 70, 50);
		f.add(hobby1);f.add(hobby2);f.add(hobby3);f.add(hobby4);
		
		f.add(label2);
		//frame에 컴포넌트 항상 붙여야 한다.
		f.setVisible(true);
	}

}
