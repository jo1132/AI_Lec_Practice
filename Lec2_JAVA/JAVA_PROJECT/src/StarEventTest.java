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
		
		// 프레임을 화면 중앙에 보이기
		setBounds((screenSize.width)/2-325, 
				(screenSize.height)/2-272, 650, 545);
		this.setLayout(null);
		
		// 닫기x 버튼 이벤트 처리
		addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) { 
				dispose();
			}
		});
		
		l1 = new List(12);
		l1.setBounds(390, 100, 230, 190);
		l1.setBackground(new Color(200,200,215));
		l1.add("양자리"); l1.add("황소자리"); l1.add("쌍둥이자리");
		l1.add("게자리"); l1.add("사자자리"); l1.add("처녀자리");
		l1.add("천칭자리"); l1.add("전갈자리"); l1.add("궁수자리");
		l1.add("염소자리"); l1.add("물병자리"); l1.add("물고기자리");
		l1.addActionListener(new EventStar());
		
		ta = new TextArea("별자리를 선택하세요",3,4,TextArea.SCROLLBARS_NONE);
		ta.setBounds(0, 0, 230, 200);
		
		p1 = new Panel();
		p1.setLayout(null);
		p1.setBounds(390, 310, 230, 200);
		p1.setBackground(new Color(33,36,42));
		p1.add(ta);
		
		// 프레임에 컨포넌트 붙이기
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

			if(ae.getActionCommand() == "양자리"){
				ta.setText("양자리지롱~\n양자리지롱~\n양자리지롱~");
			} else if(ae.getActionCommand() == "황소자리"){
				ta.setText("황소자리지롱~\n황소자리지롱~\n황소자리지롱~");
			} else if(ae.getActionCommand() == "쌍둥이자리"){
				ta.setText("쌍둥이지롱~\n쌍둥이지롱~\n쌍둥이지롱~");
			} else if(ae.getActionCommand() == "게자리"){
				ta.setText("게자리지롱~\n게자리지롱~\n게자리지롱~");
			} else if(ae.getActionCommand() == "사자자리"){
				ta.setText("사자이지롱~\n사자이지롱~\n사자지롱~");
			} else if(ae.getActionCommand() == "처녀자리"){
				ta.setText("처녀자리지롱~\n처녀자리지롱~\n처녀자리지롱~");
			} else if(ae.getActionCommand() == "천칭자리"){
				ta.setText("천칭자리지롱~\n천칭자리지롱~\n천칭자리지롱~");
			} else if(ae.getActionCommand() == "전갈자리"){
				ta.setText("전갈자리지롱~\n전갈자리지롱~\n전갈자리지롱~");
			}


			
		}
	}
	

}
