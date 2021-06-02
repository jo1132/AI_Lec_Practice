import java.awt.*;
import java.awt.event.*;


public class Test4 extends Frame{

	CheckboxGroup bgroup;
	Checkbox bA, bB, bO, bAB;
	Panel btype;
	Label result, result2;
	Button ok;
	String str;
	
	Test4(String title){
		super(title);
		
		Font f1 = new Font("Serif", Font.BOLD+Font.ITALIC, 25);
		Font f2 = new Font("SansSerif", Font.BOLD, 35);
		//************************************************************** Frame초기화 부분
		this.setBounds(500, 300, 600, 400);
		this.setLayout(null);
		this.setBackground(Color.LIGHT_GRAY);
		
		this.addWindowListener(new WindowAdapter(){	//익명클래스를 사용하는 방법!
			public void windowClosing(WindowEvent e) {
				System.exit(0); 		//완전 종료
			}
		}); 	
		
		//**************************************************************** Panel부분
		btype = new Panel();
		btype.setLayout(new FlowLayout());
		btype.setBounds(50, 50, 400, 60);
		//btype.setBackground(Color.GRAY);
		btype.setBackground(new Color(170, 0, 0));
		btype.setFont(f2);
		add(btype);
		
		//***************************************************************** checkbox부분
		bgroup = new CheckboxGroup();
		bA = new Checkbox("A형", bgroup, false);
		bA.setBackground(Color.RED);
		
		bB = new Checkbox("B형", bgroup, false); 
		bB.setBackground(Color.RED);
		
		bO = new Checkbox("O형", bgroup, false); 
		bO.setBackground(Color.RED);
		
		bAB = new Checkbox("AB형", bgroup, false);
		bAB.setBackground(Color.RED);
		
		bA.addItemListener(new BloodTypeEvent());
		bB.addItemListener(new BloodTypeEvent());
		bO.addItemListener(new BloodTypeEvent());
		bAB.addItemListener(new BloodTypeEvent());
		btype.add(bA);btype.add(bB);btype.add(bO);btype.add(bAB);
		
		//******************************************************************** Label부분
		result = new Label();
		result.setBounds(50, 150, 400, 100);
		result.setBackground(new Color(14, 156, 117));
		result.setForeground(Color.white);
		result.setFont(f1);
		add(result);
		
		result2 = new Label("혈액형을 선택해주세요~GameObject");
		result2.setBounds(50, 275, 400, 100);
		result2.setBackground(new Color(23, 167, 253));
		result2.setForeground(Color.white);
		result2.setFont(f1);
		add(result2);
		//******************************************************************* ok선택 버튼 부분
		ok = new Button("선택");
		ok.setBounds(475, 50, 50, 200);
		ok.addActionListener(new ButtonEvent());
		add(ok);
		
		
		
		
		setVisible(true);
	}
	

	class BloodTypeEvent implements ItemListener{
		public void itemStateChanged(ItemEvent arg0) {
			Checkbox cb = (Checkbox) arg0.getSource();
			str = cb.getLabel();
			
			result.setText("당신의 혈액형은 "+str+" 입니다.");
		}
	}
	
	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//result2.setText("당신은 "+str+"을 선택하셨습니다.");
			if(bA.getState()) {
				System.out.println(bA.getLabel()+"을 선택하셨습니다!");
				result2.setText(bA.getLabel()+"을 선택하셨습니다!");
			}
			else if(bB.getState()) {
				System.out.println(bB.getLabel()+"을 선택하셨습니다!");
				result2.setText(bB.getLabel()+"을 선택하셨습니다!");
			}
			
			else if(bO.getState()) {
				System.out.println(bO.getLabel()+"을 선택하셨습니다!");
				result2.setText(bO.getLabel()+"을 선택하셨습니다!");
			}
			else {
				System.out.println(bAB.getLabel()+"을 선택하셨습니다!");
				result2.setText(bAB.getLabel()+"을 선택하셨습니다!");
			}
			
		}
	}
	public static void main(String[] args) {
		new Test4("혈액형 프로그램");
	}
	
	
}
