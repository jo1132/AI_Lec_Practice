import java.awt.*;
import java.awt.event.*;


public class Test5 extends Frame implements MouseMotionListener{
	int x = 0, y = 0;
	
	
	Test5(String title){
		super(title);
		
		
		//*****************************************************************Frame부분
		//this.setBounds(0, 0, 450, 650);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setSize(500, 500);
		this.setLocation((screenSize.width-this.getWidth())/2, (screenSize.height-this.getHeight())/2);
		this.setLayout(null);
		this.setBackground(Color.white);
		addWindowListener(new WindowAdapter(){	//익명클래스를 사용하는 방법!
			public void windowClosing(WindowEvent e) {
				System.exit(0); 		//완전 종료
			}
		}); 
		
		this.addMouseMotionListener(this);
		setVisible(true);
	}
	
	//paint() 메소드 자동호출 시기
	//1. 처음 화면에 나타날 떄
	//2. 다른 화면에 가려졌다가 다시 나타날 떄
	//3. 최소화 되었다가 원래크기로 다시 나타날떄
	public void paint(Graphics g) {
		g.setFont(new Font("Serif", Font.BOLD, 20));
		g.drawString("마우스를 움직여 보세용", 10,  60);
		
		g.drawString("*", x, y);
		
	
	}

	public void update(Graphics g) {		//Update오버라이딩!
		paint(g);
	}
	


	
	public static void main(String[] args) {
		new Test5("그래픽 연습2");

	}

	public void mouseDragged(MouseEvent arg0) {
		x = arg0.getX();
		y = arg0.getY();
		
		repaint();			// repaint() - > update() -> paint() 호출된다!
	}
	public void mouseMoved(MouseEvent arg0) {
		
	}

}
