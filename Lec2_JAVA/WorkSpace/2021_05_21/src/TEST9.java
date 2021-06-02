import java.awt.*;
import java.awt.event.*;


public class TEST9 extends Frame{
	Label q1, q2, score;
	Checkbox q1_cb1, q1_cb2, q1_cb3, q1_cb4;
	Checkbox q2_cb1, q2_cb2, q2_cb3, q2_cb4;
	CheckboxGroup group;
	Button end;
	
	TEST9(){
		super("Checkbox 이벤트 연습");	//프레임 제목 표시줄
		setLayout(new GridLayout(13,1, 5, 5));
		setBackground(new Color(199, 253, 196));
		setBounds(500, 200, 500, 400);
		addWindowListener(new WindowAdapter(){	//익명클래스를 사용하는 방법!
			public void windowClosing(WindowEvent e) {
				System.exit(0); 		//완전 종료
			}
		}); 	
		
		
		q1 = new Label("1. 다음 중 ActionEvent의 actionPerformed메소드가 호출된는 경우를 고르세요");

		q1_cb1 = new Checkbox("Button을 눌렀을 때");
		q1_cb1.setBackground(Color.WHITE);
		q1_cb2 = new Checkbox("TextField에서 Enter키 눌렀을 때");
		q1_cb2.setBackground(Color.WHITE);
		q1_cb3 = new Checkbox("MenuItem을 클릭했을떄");
		q1_cb3.setBackground(Color.WHITE);
		q1_cb4 = new Checkbox("List에서 더블클릭으로 item 선택했을때");
		q1_cb4.setBackground(Color.WHITE);
		
		q2 = new Label("2. Frame의 기본 LayoutManager는? (하나만 고르세요.)");

		group = new CheckboxGroup();
		q2_cb1 = new Checkbox("FlowLayout", group, false);
		q2_cb1.setBackground(Color.WHITE);
		q2_cb2 = new Checkbox("GridLayout", group, false);
		q2_cb2.setBackground(Color.WHITE);
		q2_cb3 = new Checkbox("BorderLayout", group, false);
		q2_cb3.setBackground(Color.WHITE);
		q2_cb4 = new Checkbox("CardLayout", group, false);
		q2_cb4.setBackground(Color.WHITE);
		
		score = new Label("* 결과: ");
		Font font = new Font("Sans", Font.BOLD, 20);
		score.setFont(font);
		
		end = new Button("이 버튼을 누르시면 결과를 알 수 있습니다.");		//1. 이벤트 대상, 이벤트 소스
		
		end.addActionListener(new Event5());
		add(q1);add(q1_cb1);add(q1_cb2);add(q1_cb3);add(q1_cb4);
		add(new Label());		// 아무것도 없는 레이블로 공백을 넣어본다.
		add(q2);add(q2_cb1);add(q2_cb2);add(q2_cb3);add(q2_cb4);
		
		add(score);add(end);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TEST9();
	}		

	
	class Event5 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			double totalScore = 0.0;
			
			if(q1_cb1.getState()) totalScore += 100/8.0;
			if(q1_cb2.getState()) totalScore += 100/8.0;
			if(q1_cb3.getState()) totalScore += 100/8.0;
			if(q1_cb4.getState()) totalScore += 100/8.0;
			if(q2_cb3.getState()) totalScore += 100/2;
			
			System.out.println("당신의 점수는 "+ totalScore +"점 입니다.");
			score.setText("당신의 점수는 "+ totalScore +"점 입니다.");
			
			score.setBackground(Color.white);
		}
	}
}
