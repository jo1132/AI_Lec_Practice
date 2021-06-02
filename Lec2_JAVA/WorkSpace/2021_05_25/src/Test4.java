import java.awt.*;
import java.awt.event.*;


public class Test4 extends Frame{

	
	Test4(String title){
		super(title);
		
		//*****************************************************************Frame부분
		//this.setBounds(0, 0, 450, 650);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setSize(400, 300);
		this.setLocation((screenSize.width-this.getWidth())/2, (screenSize.height-this.getHeight())/2);
		this.setLayout(null);
		this.setBackground(Color.GRAY);
		addWindowListener(new WindowAdapter(){	//익명클래스를 사용하는 방법!
			public void windowClosing(WindowEvent e) {
				System.exit(0); 		//완전 종료
			}
		}); 
		
				
		setVisible(true);
	}
	
	//paint() 메소드 자동호출 시기
	//1. 처음 화면에 나타날 떄
	//2. 다른 화면에 가려졌다가 다시 나타날 떄
	//3. 최소화 되었다가 원래크기로 다시 나타날떄
	
	public void paint(Graphics g) {
		g.setFont(new Font("SansSerif", Font.BOLD, 20));
		g.drawString("Hello JAVA~", 50,  100);
		
		g.setColor(Color.MAGENTA);
		g.drawLine(0, 0, 50, 100);
		
		g.setColor(Color.ORANGE);
		g.fillRoundRect(50,  150,  100,  100,  50,  50);
		
		g.fillPolygon(new int[] {200, 250, 330, 200},  //x좌표의 집합
					  new int[] {150, 190, 220, 250}, 4);	//y좌표의 집합, 꼭지점의 좌표
		
	}

	
	public static void main(String[] args) {
		new Test4("그래픽 연습");

	}

}
