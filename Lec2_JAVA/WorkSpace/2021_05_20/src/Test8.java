import java.awt.*; 		// �����̳�, ������Ʈ �̿��ϱ� ����.

public class Test8 {

	public static void main(String[] args) {
		Frame f = new Frame("choice ������Ʈ ����");
		f.setBounds(500, 300, 500, 500);
		f.setLayout(null);		//�������� �⺻ ���̾ƿ��� �������̾ƿ�(��, ��, ��, ��, ����)
		f.setBackground(Color.GREEN);
		Choice day = new Choice();		//���̽� ��ü ����
		day.add("������");  //item �߰���
		day.add("ȭ����");
		day.add("������");
		day.add("�����");
		day.add("�ݿ���");
		day.add("�����");
		day.add("�Ͽ���");
		
		day.setLocation(50, 50);
		day.setSize(100, 70);
		day.remove("������");		//"������"�̶�� �������� �ִٸ� ����
		
		f.add(day);		//�����ӿ� day(���̽�)�� ����!
		
		
		Button b1 = new Button("OK");
		b1.setBackground(Color.pink);
		b1.setBounds(150, 50, 70, 70);
		b1.setForeground(Color.WHITE);
	
		f.add(b1);
		//-------------------------------------------------------------------
		
		
		List list1 = new List();			//����Ʈ ���ϼ���
		list1.add("���뱹");
		list1.add("�����屹");
		list1.add("¥���");
		list1.add("«��");
		list1.add("���");
		list1.add("Ŀ��");
		list1.add("���");
		list1.add("�ʹ�");
		list1.setBounds(220, 50, 100, 100);
		f.add(list1);
		
		List list2 = new List();			// ����Ʈ ���߼���
		list2.setMultipleMode(true);
		list2.add("���뱹");
		list2.add("���뱹������");
		list2.add("�ſ���뱹");
		list2.add("������뱹");
		list2.setBounds(320, 50, 100, 100);
		f.add(list2);
		
		
		
		f.setVisible(true);
	}

}
