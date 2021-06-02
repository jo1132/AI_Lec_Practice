import java.awt.*;
import java.awt.event.*;

class Event3 implements ActionListener{
	public void actionPerformed(ActionEvent arg0) {		//3. 이벤트 처리기
		System.out.println("확인버튼을 누르셨습니다.");
	}
}

public class TEST7 {

	public static void main(String[] args) {
	Frame f = new Frame("버튼 이벤트 연습");
	f.setBounds(500, 300, 500, 500);
	f.setBackground(Color.gray);
	f.setLayout(null);
	
	f.addWindowListener(new WindowAdapter(){	//익명클래스를 사용하는 방법!
		public void windowClosing(WindowEvent e) {
			System.exit(0); 		//완전 종료
		}
	}); 	//2. 감지기(리스너)
	
	Button b1 = new Button("확인"); //1. 이벤트 대상 (소스)
	b1.setBounds(70, 75, 150, 150);
	b1.addActionListener(new Event3());
	f.add(b1);
	
	Button b2 = new Button("취소"); //1. 이벤트 대상 (소스)
	b2.setBounds(230, 75, 150, 150);
	b2.addActionListener(new ActionListener(){			//이벤트 처리기를 익명클래스로 구현한것.
		public void actionPerformed(ActionEvent arg0) {		//3. 이벤트 처리기
			System.out.println("취소입니다!ㅂ");
		}
	});
	f.add(b2);
	
	f.setVisible(true);
	}

}
