import java.awt.*;
import java.awt.event.*;


public class Test3 extends Frame{

	CheckboxGroup group;
	Checkbox cb1, cb2, cb3;
	
	Test3(String title){
		super(title);
		this.setBounds(500, 300, 500, 300);
		this.setLayout(new FlowLayout());
		this.setBackground(Color.RED);
		
		this.addWindowListener(new WindowAdapter(){	//익명클래스를 사용하는 방법!
			public void windowClosing(WindowEvent e) {
				System.exit(0); 		//완전 종료
			}
		}); 	
		
		
		//******************************************************************Checkbox부분
		group = new CheckboxGroup();
		cb1 = new Checkbox("Red", group, true);
		cb2 = new Checkbox("Green", group, false);
		cb3 = new Checkbox("Blue", group, false);
		
		cb1.addItemListener(new EventG());
		cb2.addItemListener(new EventG());
		cb3.addItemListener(new EventG());
		//*******************************************************************프레임에 컴포넌트 붙히기
		add(cb1);add(cb2);add(cb3);
		setVisible(true);
	}
	
	//체크박스 cb1, cb2, cb3를 체크 선택/해제했을 떄 처리하는 클래스
	class EventG implements ItemListener{
		public void itemStateChanged(ItemEvent arg0) {
			Checkbox cb = (Checkbox) arg0.getSource();
			String color = cb.getLabel();
			
			if(color.equals("Red")) {
				setBackground(Color.red);
				cb1.setBackground(Color.red);
				cb2.setBackground(Color.red);
				cb3.setBackground(Color.red);
			}
			else if(color.equals("Green")) {
				setBackground(Color.GREEN);
				cb1.setBackground(Color.GREEN);
				cb2.setBackground(Color.GREEN);
				cb3.setBackground(Color.GREEN);
			}
			else {
				setBackground(Color.BLUE);
				cb1.setBackground(Color.BLUE);
				cb2.setBackground(Color.BLUE);
				cb3.setBackground(Color.BLUE);
			}
			System.out.println(color);
		}
	}
	
	public static void main(String[] args) {
		new Test3("CheckBox Events");
	}
	
	
}
