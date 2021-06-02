import java.awt.*; 		// 컨테이너, 컴포넌트 이용하기 위해.

public class Test9 {

	public static void main(String[] args) {
		Frame f = new Frame("회원가입");
		f.setLayout(null);
		f.setBackground(Color.orange);
		f.setBounds(500, 500, 300, 200);
		
		
		Label id = new Label("ID: ");
		id.setBounds(50, 50, 70, 20);
		id.setAlignment(Label.RIGHT);
		Label password = new Label("Password: ");
		password.setBounds(50, 70, 70, 20);
		id.setAlignment(Label.RIGHT);
		
		TextField txtId = new TextField();		//텍스트를 입력할수있는 공간
		txtId.setBounds(130, 50, 120, 20);
		//System.out.println(txtId.getText());	//txtId에 있는 텍스트 가져오기
		
		TextField txtPwd = new TextField();
		txtPwd.setBounds(130, 70, 120, 20);
		txtPwd.setEchoChar('◆');  	//비밀번호 사용시 ◆로 대체된다.
		//System.out.println(txtPwd.getText());
		
		f.add(id);
		f.add(password);
		f.add(txtId);
		f.add(txtPwd);
		f.setVisible(true);
	}

}
