import java.awt.*;
import java.awt.event.*;

public class TEST5 {

	public static void main(String[] args) {
		Frame f = new Frame("Popup Menu Test");
		f.setBackground(Color.yellow);
		f.setBounds(500, 300, 500, 500);
		
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
		f.setVisible(true);
	}

}
