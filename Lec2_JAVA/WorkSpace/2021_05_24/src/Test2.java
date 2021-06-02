import java.awt.*;
import java.awt.event.*;

class EventC extends WindowAdapter{				//2개 이상의 추상 메소드를 가지고 있는 인터페이스는 미리 Adaoer 클래스로 구현되어 있기 때문에
	public void windowClosing(WindowEvent e) {	//필요한 콜백메소드만 오버라이딩하여 사용할 수 있다!!
		System.exit(0);
	}
}


public class Test2 extends Frame{
	Label location;
	
	Test2(String str){
		super(str);
		/************************************************Font부분*/
		Font font = new Font("Serif", Font.BOLD+Font.ITALIC, 20);
		Font font2 = new Font("SansSerif", Font.BOLD+Font.ITALIC, 20);
		/************************************************Font부분*/
		Color c1 = new Color(187, 57, 135);
		Color c2 = new Color(122, 33, 211);
		/************************************************Frame부분*/
		this.setBounds(500, 300, 500, 300);
		this.setBackground(c1);
		//프레임(윈도우) 닫기x 버튼 누를 경우 닫는 이벤트 처리(익명 클래스)
		this.addWindowListener(new EventC());
		this.setLayout(null);
		
		/************************************************Label부분*/
		location = new Label("Mouse Pointer Location");
		location.setBounds(10, 50, 250, 20);
		location.setBackground(c2);
		location.setFont(font);
		location.setForeground(Color.WHITE);
		this.add(location);
		
		/************************************************Mouse Event 처리부분*/
		this.addMouseMotionListener(new EventD());	//마우스 좌표 출력
		this.addMouseListener(new EventF());		//마우스가 프레임에서 나가면 원래 메세지로 복구
		
		setVisible(true);
	}
	
	
	
	// 내부 클래스로 EventD 클래스 작성
	// 내부 클래스를 사용하면 외부 클래스의 멤버 접근 가능
	class EventD implements MouseMotionListener{
		public void mouseDragged(MouseEvent arg0) {}
		public void mouseMoved(MouseEvent arg0) {
			location.setText("Mouse: ("+arg0.getX()+","+arg0.getY()+")");
		}
	}
	
	class EventF implements MouseListener{

		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {
			location.setText("Mouse Pointer Location");
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
	}
	
	public static void main(String[] args) {
		new Test2("Mouse Event Test");
	}
}
