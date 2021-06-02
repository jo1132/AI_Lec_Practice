import java.awt.*; 		// 컨테이너, 컴포넌트 이용하기 위해.

public class Test8 {

	public static void main(String[] args) {
		Frame f = new Frame("choice 컴포넌트 연습");
		f.setBounds(500, 300, 500, 500);
		f.setLayout(null);		//프레임의 기본 레이아웃은 보더레이아웃(동, 서, 남, 북, 센터)
		f.setBackground(Color.GREEN);
		Choice day = new Choice();		//초이스 객체 생성
		day.add("월요일");  //item 추가중
		day.add("화요일");
		day.add("수요일");
		day.add("목요일");
		day.add("금요일");
		day.add("토요일");
		day.add("일요일");
		
		day.setLocation(50, 50);
		day.setSize(100, 70);
		day.remove("월요일");		//"월요일"이라는 아이템이 있다면 삭제
		
		f.add(day);		//프레임에 day(초이스)를 붙임!
		
		
		Button b1 = new Button("OK");
		b1.setBackground(Color.pink);
		b1.setBounds(150, 50, 70, 70);
		b1.setForeground(Color.WHITE);
	
		f.add(b1);
		//-------------------------------------------------------------------
		
		
		List list1 = new List();			//리스트 단일선택
		list1.add("순대국");
		list1.add("뼈해장국");
		list1.add("짜장면");
		list1.add("짬뽕");
		list1.add("돈까스");
		list1.add("커리");
		list1.add("김밥");
		list1.add("초밥");
		list1.setBounds(220, 50, 100, 100);
		f.add(list1);
		
		List list2 = new List();			// 리스트 다중선택
		list2.setMultipleMode(true);
		list2.add("순대국");
		list2.add("순대국곱빼기");
		list2.add("매운순대국");
		list2.add("내장순대국");
		list2.setBounds(320, 50, 100, 100);
		f.add(list2);
		
		
		
		f.setVisible(true);
	}

}
