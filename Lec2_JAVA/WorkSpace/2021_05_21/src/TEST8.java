import java.awt.*;
import java.awt.event.*;


public class TEST8 extends Frame{

	Label lid, lpw;
	TextField tfid, tfpw;
	Button ok;
	
	TEST8(){
		super("�α��� �̺�Ʈ ����");	//������ ���� ǥ����
		lid = new Label("ID: ");
		lid.setAlignment(Label.RIGHT);
		lpw = new Label("PassWord: ");
		lpw.setAlignment(Label.RIGHT);
		tfid = new TextField(10);
		tfpw = new TextField(10);
		tfpw.setEchoChar('��');
		ok = new Button("Ok");
		
		setLayout(new FlowLayout());
		setBackground(Color.gray);
		setBounds(500, 300, 400, 80);
		setResizable(false);
		
		add(lid);add(tfid);add(lpw);add(tfpw);add(ok);
		
		tfid.addActionListener(new Event4());
		tfpw.addActionListener(new Event4());
		ok.addActionListener(new Event4());
		
		addWindowListener(new WindowAdapter(){	//�͸�Ŭ������ ����ϴ� ���!
			public void windowClosing(WindowEvent e) {
				System.exit(0); 		//���� ����
			}
		}); 	//2. ������(������)
		
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new TEST8();
	}		//������ ����

	
	//����Ŭ���� ���, TextField �Է� �� ���� 
	class Event4 implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			String id = tfid.getText();
			String pw = tfpw.getText();
			
			if(!id.equals("admin")) {		//admin�� �ƴϸ� ��!
				System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
				tfid.requestFocus();  //Ŀ���� id������ �ٽ� �ű��.
				tfid.selectAll(); 		//��ü�� �巡���� ��ó�� �ȴ�. �ٽ� �Է½� �������� �����.
			}else if(!pw.equals("1234")) {		//password�� 1234�� �ƴϸ� ��!
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				tfpw.requestFocus();
				tfpw.selectAll();
			}else {
				System.out.println(id+"�� ȯ���մϴ�!");
			}
			
		}		//TextFiled �Է��� ���� or OK��ư Ŭ���� �̺�Ʈ ó����~

		
	}
}		// TEST8Ŭ���� ����
