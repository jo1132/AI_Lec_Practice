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
		
	
		// 프레임을 화면 중앙에 보이기
		setBounds((screenSize.width)/2-340, 
				  (screenSize.height)/2-220, 680, 440);
		setLayout(null);
		setResizable(false); // 프레임 확대,축소 안됨!
		
		// 닫기x 버튼 이벤트 처리
		addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) { 
				System.exit(0); // 프로그램 종료
			}
		});
		
		/*********** 메뉴 부분 *************/
		MenuBar mb = new MenuBar();
		Menu mFile = new Menu("파일");
		MenuItem miOpen = new MenuItem("열기", new MenuShortcut('O', true));
		MenuItem miExit = new MenuItem("닫기", new MenuShortcut('E'));
		mFile.add(miOpen);
		mFile.addSeparator(); // 수평선 추가
		mFile.add(miExit);
		
		miExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0); // 프로그램 종료
			}
		});
		
		Menu mEvent1 = new Menu("이벤트 기본");
		MenuItem miEvent1_1 = new MenuItem("랜덤 배경색 프로그램");
		miEvent1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ColorEventTest("랜덤 배경색 프로그램"); // 프로그램 종료
			}
		});
		
		MenuItem miEvent1_2 = new MenuItem("채팅 프로그램");
		miEvent1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ChatEventTest("채팅 프로그램");
			}
		});
		
		MenuItem miEvent1_3 = new MenuItem("별자리 설명 프로그램");
		miEvent1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new StarEventTest("별자리 설명 프로그램");
			}
		});
		
		
		mEvent1.add(miEvent1_1);
		mEvent1.add(miEvent1_2);
		mEvent1.add(miEvent1_3);
		
		
		Menu mEvent2 = new Menu("이벤트 활용");
		MenuItem miEvent2_1 = new MenuItem("객체지향 설명 프로그램");
		miEvent2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new OopProgram("객체지향 설명 프로그램");
			}
		});
		
		MenuItem miEvent2_2 = new MenuItem("별자리 프로그램");
		miEvent2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CheckStar("별자리 프로그램");
			}
		});
		
		mEvent2.add(miEvent2_1);
		mEvent2.add(miEvent2_2);
		
		
		
		
		Menu mHelp = new Menu("도움말");
		MenuItem miHelp = new MenuItem("프로그램 설명");
		miHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Help("JAVA_PROJECT 설명");
			}
		});
		
		mHelp.add(miHelp);
		

		
		/*********** 메뉴바 mb에 메뉴 붙이는 부분 *************/
		mb.add(mFile);
		mb.add(mEvent1);
		mb.add(mEvent2);
		mb.add(mHelp);

		/*********** 프레임에 컨포넌트 붙이는 부분 *************/
		setMenuBar(mb); // 프레임에 메뉴바 붙이기
		
		setVisible(true);	
	}
	
	public void paint(Graphics g){
		int imgW = img.getWidth(this);
		int imgH = img.getHeight(this);
		
		// 프레임 중앙에 이미지 배치하기
		g.drawImage(img, (getWidth()-imgW)/2, 
					     (this.getHeight()-imgH)/2, this);
	}
	

	public static void main(String[] args) {
		new MenuStart("자바 프로젝트");
	}
}




