import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class TEST4 {

	public static void main(String[] args) {
		Frame f = new Frame("�޴� ����� ����");
		f.setBackground(Color.orange);
		f.setBounds(500, 300, 500, 300);
		
		MenuBar mb = new MenuBar();
		Menu mFile = new Menu("�޴�");
		MenuItem miOpen = new MenuItem("����");
		Menu mOthers = new Menu("��Ÿ");
		MenuItem miExit = new MenuItem("�ݱ�");
		MenuItem mPrint = new MenuItem("�μ��ϱ�");
		MenuItem miPreview = new MenuItem("�̸�����");
			mFile.add(miOpen);
			mFile.add(mOthers);
			mFile.addSeparator(); // �޴������ۻ��̿� ���μ��� �ϳ� �׾��ش�.
			mFile.add(miExit);
				mOthers.add(mPrint);
				mOthers.add(miPreview);

		Menu mHelp = new Menu("����");
			MenuItem miHelp = new MenuItem("����1");
			CheckboxMenuItem miHelp2 = new CheckboxMenuItem("����2"); 		//üũ �ڽ��� �ִ� �޴� �������̴�.
		mHelp.add(miHelp);mHelp.add(miHelp2);
		mb.add(mFile);mb.add(mHelp);
		
		
		PopupMenu pMenu = new PopupMenu();
		MenuItem miCut = new MenuItem("�ڸ���");
		MenuItem miCopy = new MenuItem("�����ϱ�");
		Menu miopen = new Menu("�������� ����");
			MenuItem mimenu1 = new MenuItem("�˾��޴�1");
			MenuItem mimenu2 = new MenuItem("�˾��޴�2");
			miopen.add(mimenu1);miopen.add(mimenu2);
		pMenu.add(miCut);pMenu.add(miCopy);pMenu.add(miopen);
		f.add(pMenu);
		
		f.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				if(me.getModifiers() == me.BUTTON3_MASK) {
					pMenu.show(f, me.getX()+10, me.getY());
				}
			}
			
		});
		
		//�����ӿ� �޴��� ���̱�
		f.setMenuBar(mb);
		f.setVisible(true);
	}

}
