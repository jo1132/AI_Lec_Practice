import java.awt.*;
import java.awt.event.*;

public class ChatEvent extends Frame{
	TextArea ta;	//행과 열이 있는 내용 많을때,
	TextField tf;	 //한줄로 입력할 때.
	Button b1;
	
	
	ChatEvent(String title){
		super(title);
	
		Font f1 = new Font("Serif", Font.BOLD+Font.ITALIC, 30);
		Font f2 = new Font("SnasSerif", Font.BOLD, 30);
		//*****************************************************************Frame부분

		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setSize(450, 650);
		this.setLocation((screenSize.width-this.getWidth())/2, (screenSize.height-this.getHeight())/2);
		this.setLayout(new BorderLayout());
		addWindowListener(new WindowAdapter(){	//익명클래스를 사용하는 방법!
			public void windowClosing(WindowEvent e) {
				dispose(); 		//완전 종료
			}
		}); 
		
		
		//******************************************************************TextArea 부분
		ta = new TextArea("Hello~\n", 4, 10);
		ta.setBounds(25, 50, 400, 500);
		ta.setEditable(false);
		this.add("Center", ta);
		
		//******************************************************************TextField 부분
		tf = new TextField();		//1.이벤트 소스
		tf.addActionListener(new EventChat());	//2. 이벤트 연결
		tf.requestFocus();
		this.add(tf, BorderLayout.SOUTH);
			
		//******************************************************************Button 부분
		b1 = new Button("클릭");
		b1.addActionListener(new EventChat());
		add(BorderLayout.NORTH, b1);
		
		this.setVisible(true);
	}
	
	class EventChat implements ActionListener{	//3. 이벤트 처리입니다.
		public void actionPerformed(ActionEvent arg0) {
			ta.append(tf.getText()+"\n");
			//tf.requestFocus();
			//tf.selectAll();
			tf.setText("");
		}
	}
}
