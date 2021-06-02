import java.awt.*;
import java.awt.event.*;
public class StarEventTest extends Frame {
	Toolkit tk = Toolkit.getDefaultToolkit(); 
	Dimension screenSize = tk.getScreenSize();
	Image img;
	Panel p1;
	List l1;
	TextArea ta;
		
	StarEventTest(String title){
		super(title);
		
		img = tk.getImage("images/listBackImg.jpg");
		
		// �������� ȭ�� �߾ӿ� ���̱�
		setBounds((screenSize.width)/2-325, 
				(screenSize.height)/2-272, 650, 545);
		this.setLayout(null);
		
		// �ݱ�x ��ư �̺�Ʈ ó��
		addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) { 
				dispose();
			}
		});
		
		l1 = new List(12);
		l1.setBounds(390, 100, 230, 190);
		l1.setBackground(new Color(200,200,215));
		l1.add("���ڸ�"); l1.add("Ȳ���ڸ�"); l1.add("�ֵ����ڸ�");
		l1.add("���ڸ�"); l1.add("�����ڸ�"); l1.add("ó���ڸ�");
		l1.add("õĪ�ڸ�"); l1.add("�����ڸ�"); l1.add("�ü��ڸ�");
		l1.add("�����ڸ�"); l1.add("�����ڸ�"); l1.add("������ڸ�");
		l1.addActionListener(new EventStar());
		
		ta = new TextArea("���ڸ��� �����ϼ���",3,4,TextArea.SCROLLBARS_NONE);
		ta.setBounds(0, 0, 230, 200);
		
		p1 = new Panel();
		p1.setLayout(null);
		p1.setBounds(390, 310, 230, 200);
		p1.setBackground(new Color(33,36,42));
		p1.add(ta);
		
		// �����ӿ� ������Ʈ ���̱�
		add(l1);
		add(p1);
		
		setVisible(true);
	}
	
	public void paint(Graphics g){
		int imgWidth, imgHeight;		
		if(img == null) {
			return;
		}	
		imgWidth = img.getWidth(this);
		imgHeight = img.getHeight(this);
		
		g.drawImage(img, 0, 25, this);
	}
	
	class EventStar implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			// List list = (List)ae.getSource();
			// String[] listArr = list.getItems();

			if(ae.getActionCommand() == "���ڸ�"){
				ta.setText("���ڸ�����~\n���ڸ�����~\n���ڸ�����~");
			} else if(ae.getActionCommand() == "Ȳ���ڸ�"){
				ta.setText("Ȳ���ڸ�����~\nȲ���ڸ�����~\nȲ���ڸ�����~");
			} else if(ae.getActionCommand() == "�ֵ����ڸ�"){
				ta.setText("�ֵ�������~\n�ֵ�������~\n�ֵ�������~");
			} else if(ae.getActionCommand() == "���ڸ�"){
				ta.setText("���ڸ�����~\n���ڸ�����~\n���ڸ�����~");
			} else if(ae.getActionCommand() == "�����ڸ�"){
				ta.setText("����������~\n����������~\n��������~");
			} else if(ae.getActionCommand() == "ó���ڸ�"){
				ta.setText("ó���ڸ�����~\nó���ڸ�����~\nó���ڸ�����~");
			} else if(ae.getActionCommand() == "õĪ�ڸ�"){
				ta.setText("õĪ�ڸ�����~\nõĪ�ڸ�����~\nõĪ�ڸ�����~");
			} else if(ae.getActionCommand() == "�����ڸ�"){
				ta.setText("�����ڸ�����~\n�����ڸ�����~\n�����ڸ�����~");
			}


			
		}
	}
	

}
