import java.awt.*; 		// �����̳�, ������Ʈ �̿��ϱ� ����.

public class Test9 {

	public static void main(String[] args) {
		Frame f = new Frame("ȸ������");
		f.setLayout(null);
		f.setBackground(Color.orange);
		f.setBounds(500, 500, 300, 200);
		
		
		Label id = new Label("ID: ");
		id.setBounds(50, 50, 70, 20);
		id.setAlignment(Label.RIGHT);
		Label password = new Label("Password: ");
		password.setBounds(50, 70, 70, 20);
		id.setAlignment(Label.RIGHT);
		
		TextField txtId = new TextField();		//�ؽ�Ʈ�� �Է��Ҽ��ִ� ����
		txtId.setBounds(130, 50, 120, 20);
		//System.out.println(txtId.getText());	//txtId�� �ִ� �ؽ�Ʈ ��������
		
		TextField txtPwd = new TextField();
		txtPwd.setBounds(130, 70, 120, 20);
		txtPwd.setEchoChar('��');  	//��й�ȣ ���� �߷� ��ü�ȴ�.
		//System.out.println(txtPwd.getText());
		
		f.add(id);
		f.add(password);
		f.add(txtId);
		f.add(txtPwd);
		f.setVisible(true);
	}

}
