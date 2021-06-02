import java.awt.*;
import java.awt.event.*;

public class ChatEventTest extends Frame {
	TextArea ta; // 행과 열이 있는 내용 많을 때
	TextField tf; // 한 줄로 입력할 때
	Button b1;
	
	ChatEventTest(String title){
		super(title);
		// 프레임의 기본 레이아웃은 보더레이아웃(동,서,남,북,중앙)
		
		Toolkit tk = Toolkit.getDefaultToolkit(); // 프레임을 화면 중앙에 보이기
		Dimension screenSize = tk.getScreenSize();
		setBounds((screenSize.width)/2-350, (screenSize.height)/2-250, 700, 500);
		
		// 닫기x 버튼 이벤트 처리
		addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) { 
				dispose();
			}
		});
				
		
		/************** Button b1 부분 ****************/
		b1 = new Button("클릭");
		b1.addActionListener(new EventChat());
		
		/************** TextArea ta 부분 ****************/
		ta = new TextArea("Hello~\n", 4, 10);
		ta.setEditable(false); // 비활성
		
		/************** TextField tf 부분 ****************/
		tf = new TextField(""); // 1. 이벤트 소스
		tf.addActionListener(new EventChat()); // 2. 이벤트 리스너(감지기)

		
		/************** 프레임에 컨포넌트 붙이기 ****************/
		add("Center", ta); // 중앙에 ta 붙이기
		add(tf, BorderLayout.SOUTH); // 남쪽에 tf 붙이기
		add(BorderLayout.NORTH, b1); // 북쪽에 b1 붙이기
		
		setVisible(true);
	}
	
	// 3. 이벤트 처리기
	class EventChat implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			ta.append(tf.getText() + "\n");
			tf.requestFocus(); 
			tf.selectAll();
		}
	}
	
}






