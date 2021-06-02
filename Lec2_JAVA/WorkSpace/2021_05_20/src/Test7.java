import java.awt.*; 		// 컨테이너, 컴포넌트 이용하기 위해.

public class Test7 {

	public static void main(String[] args) {
		
		int i, j;
		Button[][] bts = new Button[10][10];
		Frame f = new Frame("프레임 연습중 입니다..."); // 프레임 객체생성!  == 컨테이너?
							// 여기가  창의 이름이 된다. (HTML의 타이틀과 같음)
		
		f.setBounds(200,300,600,600);	//setSize와 setLocation 이 두개를 한번에 처리하는 방법이다.
										//프레임의 시작위치x, 시작위치y, 너비, 높이, 를 한번에 설정한다.
		
		f.setBackground(Color.GRAY);
		
		
		f.setTitle("제목이지롱~~");
		String str = f.getTitle();
		System.out.println("제목표시줄의 내용은 " + str + "입니다.");
		
		f.setLayout(null); 	//기본 레이아웃 안쓰고 직접 좌표로 위치시킴
		//f.setSize(400, 300);	//프레임의 너비, 높이 설정.
		//f.setLocation(200, 300);  	//프레임의 시작 위치(x, y)설정.
		
		
		Button b1 = new Button("버튼을 눌러 보세요.");
		b1.setBounds(100, 100, 100, 100);
		b1.setBackground(Color.pink);
		b1.setForeground(Color.white);
		
		Button b2 = new Button("버튼2를 누르세요!");
		b2.setBounds(200, 100, 100, 100);
		b2.setBackground(Color.red);
		b2.setForeground(Color.CYAN);
		//프레밍의 컴포넌트 붙이기
		
		for(i=0;i<10;i++) {
			for(j=0;j<10;j++) {
				bts[i][j] = new Button(""+i+j);
				bts[i][j].setBounds((i*50+50), (j*50 + 50), 50, 50);
				bts[i][j].setBackground(Color.GRAY);
				f.add(bts[i][j]);
			}
		}
		//f.add(b1);
		//f.add(b2);
		
		f.setVisible(true);		//프레임 보이기
	}

}
