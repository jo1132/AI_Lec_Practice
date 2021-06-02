import java.awt.*;	//AWT 컨포넌트 사용하기위해
import java.awt.event.*; 	//마우스이벤트와 같은 이벤트 처리들을 사용하기 위해
import java.beans.EventHandler;


class Event1 implements WindowListener{		//3. 이벤트 처리기

	@Override
	public void windowActivated(WindowEvent arg0) {}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("프레임을 종료합니다.");
		e.getWindow().setVisible(false);		//화면에서 안보이기
		e.getWindow().dispose();		//메모리에서 해제하기
		System.exit(0); 		//완전 종료
	}

	@Override
	public void windowDeactivated(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowOpened(WindowEvent e) {}
	
}

class Event2 extends WindowAdapter{
	public void windowClosing(WindowEvent e) {
		System.out.println("프레임을 종료합니다. With Adapter");
		System.exit(0); 		//완전 종료
	}
}
public class TEST6 {

	public static void main(String[] args) {
		Frame f = new Frame("이벤트 처리");		//1. 이벤트 소스 (대상)
		f.setBounds(500, 300, 500, 400);
		f.setBackground(Color.orange);
		
		//f.addWindowListener(new Event2()); 		//windowAdapter를 사용하는 방법!
		
		f.addWindowListener(new WindowAdapter(){	//익명클래스를 사용하는 방법!
			public void windowClosing(WindowEvent e) {
				System.exit(0); 		//완전 종료
			}
		}); 	//2. 감지기(리스너)
		f.setVisible(true);
	}

}
