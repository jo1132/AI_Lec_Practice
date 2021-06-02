import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuStart extends Frame {
	Toolkit tk = Toolkit.getDefaultToolkit(); 
	Dimension screenSize = tk.getScreenSize();
	Image img;

	MenuStart(String title){
		super(title);
		
		img = tk.getImage("images/img_frame.png");
		setIconImage(new ImageIcon("images/icon.png").getImage());
		
	
		// �������� ȭ�� �߾ӿ� ���̱�
		setBounds((screenSize.width)/2-340, 
				  (screenSize.height)/2-220, 680, 440);
		setLayout(null);
		setResizable(false); // ������ Ȯ��,��� �ȵ�!
		
		// �ݱ�x ��ư �̺�Ʈ ó��
		addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) { 
				System.exit(0); // ���α׷� ����
			}
		});
		
		/*********** �޴� �κ� *************/
		MenuBar mb = new MenuBar();
		Menu mFile = new Menu("����");
		MenuItem miOpen = new MenuItem("����", new MenuShortcut('O', true));
		MenuItem miExit = new MenuItem("�ݱ�", new MenuShortcut('E'));
		mFile.add(miOpen);
		mFile.addSeparator(); // ���� �߰�
		mFile.add(miExit);
		
		miExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0); // ���α׷� ����
			}
		});
		
		Menu mEvent1 = new Menu("�̺�Ʈ �⺻");
		MenuItem miEvent1_1 = new MenuItem("���� ���� ���α׷�");
		miEvent1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ColorEventTest("���� ���� ���α׷�"); // ���α׷� ����
			}
		});
		
		MenuItem miEvent1_2 = new MenuItem("ä�� ���α׷�");
		miEvent1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ChatEventTest("ä�� ���α׷�");
			}
		});
		
		MenuItem miEvent1_3 = new MenuItem("���ڸ� ���� ���α׷�");
		miEvent1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new StarEventTest("���ڸ� ���� ���α׷�");
			}
		});
		
		
		mEvent1.add(miEvent1_1);
		mEvent1.add(miEvent1_2);
		mEvent1.add(miEvent1_3);
		
		
		Menu mEvent2 = new Menu("�̺�Ʈ Ȱ��");
		MenuItem miEvent2_1 = new MenuItem("��ü���� ���� ���α׷�");
		miEvent2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new OopProgram("��ü���� ���� ���α׷�");
			}
		});
		
		MenuItem miEvent2_2 = new MenuItem("���ڸ� ���α׷�");
		miEvent2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CheckStar("���ڸ� ���α׷�");
			}
		});
		
		mEvent2.add(miEvent2_1);
		mEvent2.add(miEvent2_2);
		
		
		
		
		Menu mHelp = new Menu("����");
		MenuItem miHelp = new MenuItem("���α׷� ����");
		miHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Help("JAVA_PROJECT ����");
			}
		});
		
		mHelp.add(miHelp);
		

		
		/*********** �޴��� mb�� �޴� ���̴� �κ� *************/
		mb.add(mFile);
		mb.add(mEvent1);
		mb.add(mEvent2);
		mb.add(mHelp);

		/*********** �����ӿ� ������Ʈ ���̴� �κ� *************/
		setMenuBar(mb); // �����ӿ� �޴��� ���̱�
		
		setVisible(true);	
	}
	
	public void paint(Graphics g){
		int imgW = img.getWidth(this);
		int imgH = img.getHeight(this);
		
		// ������ �߾ӿ� �̹��� ��ġ�ϱ�
		g.drawImage(img, (getWidth()-imgW)/2, 
					     (this.getHeight()-imgH)/2, this);
	}
	

	public static void main(String[] args) {
		new MenuStart("�ڹ� ������Ʈ");
	}
}




