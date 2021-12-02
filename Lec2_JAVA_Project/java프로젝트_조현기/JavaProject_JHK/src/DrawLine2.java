import java.awt.*;
import java.awt.event.*;
public class DrawLine2 extends Frame{

	int x = 0, y = 0, index = 0, ratio = 1;
	boolean clear = false;
	Panel header, display, checkpan1, checkpan2, smallpan;
	Canvas canvas, preimage;
	Label title, mode, preimglabel;
	List list;
	Image img;
	Checkbox mod1, mod2;
	Checkbox color[];

	String imgarr[] = {
		"images/stickers/java_logo.jpg",
		"images/stickers/sticker (1).jpg",	"images/stickers/sticker (1).png",
		"images/stickers/sticker (2).png",	"images/stickers/sticker (3).png",
		"images/stickers/sticker (5).png",	"images/stickers/sticker (6).png",	
		"images/stickers/sticker (7).png",	"images/stickers/sticker (8).png",	
		"images/stickers/sticker (10).png",	"images/stickers/sticker (11).png",
		"images/stickers/sticker (12).png",	"images/stickers/sticker (13).png",
		"images/stickers/sticker (14).png",	"images/stickers/sticker (15).png",
		"images/stickers/sticker (16).png",	"images/stickers/sticker (17).png",
		"images/stickers/sticker (18).png",	"images/stickers/sticker (19).png",
		"images/stickers/sticker (20).png",	"images/stickers/sticker (21).png",
		"images/stickers/sticker (22).png",	"images/stickers/sticker (23).png",
	};
	
	Button reset1, reset2;
	Scrollbar red, green, blue, size;
	Toolkit tk;
	Color c1 = new Color(91, 91, 91);
	Color c2 = new Color(0, 0, 0);
	
	Font f1 = new Font("SansSerif", Font.BOLD, 30);
	Font f2 = new Font("SansSerif", Font.BOLD, 20);
	Font f3 = new Font("SansSerif", Font.BOLD, 15);
	Font f4 = new Font("SansSerif", Font.BOLD, 12);
	
	DrawLine2(String string){
		super(string);
		
		//*****************************************************************Frame부분
		tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setSize(600, 600);
		this.setLocation((screenSize.width-this.getWidth())/2, (screenSize.height-this.getHeight())/2);
		this.setLayout(null);
		this.setBackground(c1);
		addWindowListener(new WindowAdapter(){	//익명클래스를 사용하는 방법!
			public void windowClosing(WindowEvent e) {
				dispose(); 		//완전 종료
			}
		});
		this.setResizable(false);

		//**********************************************************8******** title부분
		title = new Label("Free Painting");
		title.setSize(210, 50);
		title.setLocation(this.getWidth() - title.getWidth()-25, 75);
		title.setBackground(Color.WHITE);
		title.setFont(f1);
		title.setForeground(c2);
		title.setAlignment(Label.CENTER);
		add(title);
		
		//********************************************************************8 Header부분
		header = new Panel();
		header.setBackground(Color.WHITE);
		header.setBounds(25, 125, 550, 50);
		header.setLayout(new FlowLayout(FlowLayout.LEFT));
		add(header);
		
		mode = new Label("<모드 선택>");
		mode.setBounds(0, 0, 100, 50);
		mode.setFont(f2);
		mode.setForeground(c2);
		header.add(mode);
		
		CheckboxGroup toolmod = new CheckboxGroup();
		mod1 = new Checkbox("선 그리기 모드", toolmod, true);
		mod1.setFont(f2);
		mod1.setForeground(c2);
		mod1.addItemListener(new SwitchMod());
		
		mod2 = new Checkbox("스티커 모드", toolmod, false);
		mod2.setFont(f2);
		mod2.setForeground(c2);
		mod2.addItemListener(new SwitchMod());
		
		header.add(mod1);header.add(mod2);
		//***********************************************************************8 display부분
		display = new Panel();
		display.setBounds(25, 200, 400, 370);
		display.setLayout(null);
		add(display);
		
		canvas = new Canvas(){
			public void paint(Graphics g) {
				if(mod1.getState()) {
					g.setFont(f3);
					g.setColor(c1);
					g.drawString("*", x, y);
				}
				
				else {
					img = tk.getImage(imgarr[index]);
					g.drawImage(img, x - (50/ratio)/2, y - (50/ratio)/2, 50/ratio, 50/ratio, Color.white, this);
				}
			}
			
			public void update(Graphics g) {		//Update오버라이딩!
				if(clear) {
					g.clearRect(0,  0,  canvas.getWidth(), canvas.getHeight());
					clear = false;
				}
				else {
					paint(g);
				}
			}
		};
		canvas.setBounds(0, 0, display.getWidth(), display.getHeight());
		canvas.setBackground(Color.white);
		canvas.addMouseListener(new CanvasMouseEvents());
		canvas.addMouseMotionListener(new CanvasMouseEvents());

		display.add(canvas);
		
		//*********************************************************************** checkpan1 부분
		checkpan1 = new Panel();
		checkpan1.setBounds(450, 200, 125, 370);
		checkpan1.setBackground(Color.WHITE);
		checkpan1.setLayout(new GridLayout(12, 1, 1, 1));
		
		CheckboxGroup linecolor = new CheckboxGroup();
		color = new Checkbox[8];
		
		color[0] = new Checkbox("빨간색", linecolor, false);
		checkpan1.add(color[0]);
		color[0].setForeground(Color.red);
		color[0].addItemListener(new Colorset());
		
		color[1] = new Checkbox("노란색", linecolor, false);
		checkpan1.add(color[1]);
		color[1].setForeground(new Color(230, 230, 0));
		color[1].addItemListener(new Colorset());
		
		color[2] = new Checkbox("초록색", linecolor, false);
		checkpan1.add(color[2]);
		color[2].setForeground(Color.green);
		color[2].addItemListener(new Colorset());
		
		color[3] = new Checkbox("하늘색", linecolor, false);
		checkpan1.add(color[3]);
		color[3].setForeground(new Color(0, 255, 255));
		color[3].addItemListener(new Colorset());
		
		color[4] = new Checkbox("파란색", linecolor, false);
		checkpan1.add(color[4]);
		color[4].setForeground(Color.blue);
		color[4].addItemListener(new Colorset());
		
		color[5] = new Checkbox("분홍색", linecolor, false);
		checkpan1.add(color[5]);
		color[5].setForeground(Color.pink);
		color[5].addItemListener(new Colorset());
		
		color[6] = new Checkbox("랜덤", linecolor, false);
		checkpan1.add(color[6]);
		color[6].addItemListener(new Colorset());
		
		color[7] = new Checkbox("사용자지정", linecolor, false);
		checkpan1.add(color[7]);
		color[7].addItemListener(new Colorset());
		
		red = new Scrollbar(Scrollbar.HORIZONTAL, 127, 1, 0, 255);
		checkpan1.add(red);
		
		green = new Scrollbar(Scrollbar.HORIZONTAL, 127, 1, 0, 255);
		checkpan1.add(green);
		
		blue = new Scrollbar(Scrollbar.HORIZONTAL, 127, 1, 0, 255);
		checkpan1.add(blue);
		
		reset1 = new Button("초기화");
		reset1.addActionListener(new ClearCanvas());
		checkpan1.add(reset1);

		add(checkpan1);		
		
		//*********************************************************************** checkpan2 부분
		checkpan2 = new Panel();
		checkpan2.setBounds(450, 200, 125, 370);
		checkpan2.setBackground(Color.WHITE);
		checkpan2.setLayout(null);
		add(checkpan2);
		checkpan2.setVisible(false);
		
		preimglabel = new Label("스티커를 골라보세요");
		preimglabel.setAlignment(Label.CENTER);
		preimglabel.setBounds(0, 0, checkpan2.getWidth(), 40);
		preimglabel.setFont(f4);
		preimglabel.setForeground(c2);
		checkpan2.add(preimglabel);
		
		
		smallpan = new Panel();
		smallpan.setSize(125, 125);
		smallpan.setLocation(0, 40);
		smallpan.setBackground(Color.LIGHT_GRAY);
		checkpan2.add(smallpan);
		
		preimage =  new Canvas(){
			public void paint(Graphics g) {
				int wid, hei;
				img = tk.getImage(imgarr[index]);
				wid = (preimage.getWidth() - preimage.getWidth()/ratio)/2;
				hei = (preimage.getHeight() - preimage.getHeight()/ratio)/2;
				g.drawImage(img, wid, hei, preimage.getWidth()/ratio, preimage.getHeight()/ratio, Color.white, this);
			}
		};
		preimage.setBackground(Color.WHITE);
		preimage.setBounds(5, 5, smallpan.getWidth()-10, smallpan.getHeight()-10);
		smallpan.add(preimage);
		
		
		size = new Scrollbar(Scrollbar.HORIZONTAL, 1, 1, 1, 10);
		size.setBounds(0, 165, checkpan2.getWidth(), 25);
		size.setBackground(Color.WHITE);
		size.addAdjustmentListener(new ImageRatio());
		checkpan2.add(size);
		
		
		list = new List(3, false);
		list.setBounds(0, 190, checkpan2.getWidth(), 155);
		list.addActionListener(new StickerEvent());
		list.add("겨울배경,눈사람");
		list.add("벨(파랑)");
		list.add("링");
		list.add("구슬(초록)");
		list.add("선물상자");
		list.add("벨(빨강)");
		list.add("구슬(빨강)");
		list.add("링(빨간꽃)");
		list.add("순록");
		list.add("산타");
		list.add("산타");
		list.add("트리1");
		list.add("트리2");
		list.add("트리3");
		list.add("벨(노랑)");
		list.add("플랑크톤사장");
		list.add("스폰지밥");
		list.add("스마일");
		list.add("뚱이");
		list.add("징징이");
		list.add("집게사장");
		list.add("다람이");
		checkpan2.add(list);
		
		
		reset2 = new Button("초기화");
		reset2.addActionListener(new ClearCanvas());
		reset2.setSize(checkpan2.getWidth(), 25);
		reset2.setLocation(0, checkpan2.getHeight() - reset2.getHeight());
		reset2.addActionListener(new ClearCanvas());
		checkpan2.add(reset2);
		
		setVisible(true);
	}
	
	
	public void reset(Graphics g) {
		g.clearRect(0,  0,  canvas.getWidth(), canvas.getHeight());
	}
	
	
	class SwitchMod implements ItemListener{
		public void itemStateChanged(ItemEvent arg0) {
			if(mod1.getState()) {
				checkpan1.setVisible(true);
				checkpan2.setVisible(false);
			}
			else if (mod2.getState()){
				checkpan1.setVisible(false);
				checkpan2.setVisible(true);
			}
		}
	}
	
	class Colorset implements ItemListener{
		int a, b, c;
		public void itemStateChanged(ItemEvent arg0) {
			if(color[0].getState()) {
				c1 = new Color(255, 0, 0);
				c2 = new Color(255-255, 255-0, 255-0);
			}
			else if(color[1].getState()) {
				c1 = new Color(255, 255, 0);
				c2 = new Color(255-255, 255-255, 255-0);
			}
			else if(color[2].getState()) {
				c1 = new Color(0, 255, 0);
				c2 = new Color(255-0, 255-255, 255-0);
			}
			else if(color[3].getState()) {
				c1 = new Color(0, 255, 255);
				c2 = new Color(255-0, 255-255, 255-255);
			}
			else if(color[4].getState()) {
				c1 = new Color(0, 0, 255);
				c2 = new Color(255-0, 255-0, 255-255);
			}
			else if(color[5].getState()) {
				c1 = new Color(255, 0, 255);
				c2 = new Color(255-255, 255-0, 255-255);
			}
			else if(color[6].getState()) {
				a = (int)(Math.random()*256);
				b =	(int)(Math.random()*256);
				c = (int)(Math.random()*256);
				c1 = new Color(a, b, c);
				c2 = new Color(255-a, 255-b, 255-c);
				if(a+b+c <100) c2 = new Color(0, 0, 0);
			}
			else if(color[7].getState()) {
				a = red.getValue();
				b =	green.getValue();
				c = blue.getValue();
				c1 = new Color(a, b, c);
				c2 = new Color(255-a, 255-b, 255-c);
				if(a+b+c <100) c2 = new Color(0, 0, 0);
			}
			

			setBackground(c1);
			title.setForeground(c2);
			mode.setForeground(c2);
			mod1.setForeground(c2);
			mod2.setForeground(c2);
			preimglabel.setBackground(c1);
			preimglabel.setForeground(c2);
		}
	}
	
	class CanvasMouseEvents implements MouseListener, MouseMotionListener{
		public void mouseClicked(MouseEvent arg0) {
			if(mod2.getState()) {
				x = arg0.getX();
				y = arg0.getY();
				
				canvas.repaint();
			}
		}
		public void mouseDragged(MouseEvent e) {
			if(mod1.getState()) {
				x = e.getX();
				y = e.getY();
				canvas.repaint();
			}
		}
		public void mouseMoved(MouseEvent arg0) {}
		public void mouseEntered(MouseEvent arg0) {}
		public void mouseExited(MouseEvent arg0) {}
		public void mousePressed(MouseEvent arg0) {}
		public void mouseReleased(MouseEvent arg0) {}
	}
	
	class ClearCanvas implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			clear = true;
			canvas.repaint();
		}
	}
	
	class StickerEvent implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			index = list.getSelectedIndex() + 1;
			img = tk.getImage(imgarr[index]);
			preimage.repaint();
		}
	}
	
	class ImageRatio implements AdjustmentListener{
		public void adjustmentValueChanged(AdjustmentEvent arg0) {
			ratio = size.getValue();
			preimage.repaint();
		}
	}
}
