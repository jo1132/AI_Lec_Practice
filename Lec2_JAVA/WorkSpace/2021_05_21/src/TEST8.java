import java.awt.*;
import java.awt.event.*;


public class TEST8 extends Frame{

	Label lid, lpw;
	TextField tfid, tfpw;
	Button ok;
	
	TEST8(){
		super("로그인 이벤트 연습");	//프레임 제목 표시줄
		lid = new Label("ID: ");
		lid.setAlignment(Label.RIGHT);
		lpw = new Label("PassWord: ");
		lpw.setAlignment(Label.RIGHT);
		tfid = new TextField(10);
		tfpw = new TextField(10);
		tfpw.setEchoChar('◆');
		ok = new Button("Ok");
		
		setLayout(new FlowLayout());
		setBackground(Color.gray);
		setBounds(500, 300, 400, 80);
		setResizable(false);
		
		add(lid);add(tfid);add(lpw);add(tfpw);add(ok);
		
		tfid.addActionListener(new Event4());
		tfpw.addActionListener(new Event4());
		ok.addActionListener(new Event4());
		
		addWindowListener(new WindowAdapter(){	//익명클래스를 사용하는 방법!
			public void windowClosing(WindowEvent e) {
				System.exit(0); 		//완전 종료
			}
		}); 	//2. 감지기(리스너)
		
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new TEST8();
	}		//메인이 종료

	
	//내부클래스 사용, TextField 입력 후 엔터 
	class Event4 implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			String id = tfid.getText();
			String pw = tfpw.getText();
			
			if(!id.equals("admin")) {		//admin이 아니면 참!
				System.out.println("아이디가 틀렸습니다.");
				tfid.requestFocus();  //커서를 id쪽으로 다시 옮긴다.
				tfid.selectAll(); 		//전체에 드래그한 것처럼 된다. 다시 입력시 지워지게 만든다.
			}else if(!pw.equals("1234")) {		//password가 1234가 아니면 참!
				System.out.println("비밀번호가 틀렸습니다.");
				tfpw.requestFocus();
				tfpw.selectAll();
			}else {
				System.out.println(id+"님 환영합니다!");
			}
			
		}		//TextFiled 입력후 엔터 or OK버튼 클릭시 이벤트 처리기~

		
	}
}		// TEST8클래스 종료
