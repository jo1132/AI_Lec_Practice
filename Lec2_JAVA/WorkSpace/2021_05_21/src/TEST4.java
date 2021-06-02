import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class TEST4 {

	public static void main(String[] args) {
		Frame f = new Frame("메뉴 만들기 연습");
		f.setBackground(Color.orange);
		f.setBounds(500, 300, 500, 300);
		
		MenuBar mb = new MenuBar();
		Menu mFile = new Menu("메뉴");
		MenuItem miOpen = new MenuItem("열기");
		Menu mOthers = new Menu("기타");
		MenuItem miExit = new MenuItem("닫기");
		MenuItem mPrint = new MenuItem("인쇄하기");
		MenuItem miPreview = new MenuItem("미리보기");
			mFile.add(miOpen);
			mFile.add(mOthers);
			mFile.addSeparator(); // 메뉴아이템사이에 가로선을 하나 그어준다.
			mFile.add(miExit);
				mOthers.add(mPrint);
				mOthers.add(miPreview);

		Menu mHelp = new Menu("도움말");
			MenuItem miHelp = new MenuItem("설명1");
			CheckboxMenuItem miHelp2 = new CheckboxMenuItem("설명2"); 		//체크 박스가 있는 메뉴 아이템이다.
		mHelp.add(miHelp);mHelp.add(miHelp2);
		mb.add(mFile);mb.add(mHelp);
		
		
		PopupMenu pMenu = new PopupMenu();
		MenuItem miCut = new MenuItem("자르기");
		MenuItem miCopy = new MenuItem("복사하기");
		Menu miopen = new Menu("다음으로 열기");
			MenuItem mimenu1 = new MenuItem("팝업메뉴1");
			MenuItem mimenu2 = new MenuItem("팝업메뉴2");
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
		
		//프레임에 메뉴바 붙이기
		f.setMenuBar(mb);
		f.setVisible(true);
	}

}
