import java.awt.*;
import java.awt.event.*;

class EventA implements WindowListener{//3. 이벤트 처리기(프레임의 x버튼 누를때 처리되는 클레스)
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
}

class EventB extends WindowAdapter{				//2개 이상의 추상 메소드를 가지고 있는 인터페이스는 미리 Adaoer 클래스로 구현되어 있기 때문에
	public void windowClosing(WindowEvent e) {	//필요한 콜백메소드만 오버라이딩하여 사용할 수 있다!!
		System.exit(0);
	}
}


public class Test1 extends Frame{
	Button b1;
	
	Test1(String str){
		super(str);
		this.setBounds(300,300, 500, 400);
		this.setBackground(Color.LIGHT_GRAY);
//		this.addWindowListener(new EventA());	// 윈도우 리스터 임플리먼트해서 사용하는 방법
//		this.addWindowListener(new EventB());	// 윈도우 어댑터를 상속받아서 쓰는방법
		this.addWindowListener(new WindowAdapter(){	//익명클래스를 사용하는 방법!
			public void windowClosing(WindowEvent e) {
				System.exit(0); 		//완전 종료
			}
		}); 	
		
		this.addWindowListener(new EventA());
		b1 = new Button("확인");
		setVisible(true);
	}
	public static void main(String[] args) {
		Test1 test = new Test1("이벤트 처리 연습중~");
	}

}
