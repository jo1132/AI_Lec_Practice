//생성자는 멤버 초기화를 담당
//생성자는 클래스명과 같고, 반드시 1개 이상의 생성자가 있어야 한다.
//생성자는 메소드 아님, 리턴타입이 없음

import java.lang.*; // 컴파일러가 자동 추가
public class Test1 {

	Test1(){} // 기본생성자, 컴파일러가 잿ㅇ성자가 없으면 기본 생성자 추가해줌

	public static void main(String[] args) {
		System.out.println("메인의 시작입니다.");
		Car c1 = new Car(); // 객체(인스턴스) c1생성.  이것도 마찬가지로 지역변수이다.
		Car c2 = new Car(2);
		Car c3 = new Car("RED");
		Car c4 = new Car("HOTPINK", 6);
		Car c5 = new Car(c1);
		int n = 123; //지역변수 -> 초기화하지 않으면 쓰레기값이 들어간다.

		System.out.println("c1의 바퀴는 : "+ c1.wheels);
		System.out.println("c1의 문은 : "+ c1.doors);
		System.out.println("c1의 색은 : "+ c1.color);
		
		System.out.println();
		System.out.println("c2의 바퀴는 : "+ c2.wheels);
		System.out.println("c2의 문은 : "+ c2.doors);
		System.out.println("c2의 색은 : "+ c2.color);
		
		System.out.println();
		System.out.println("c3의 바퀴는 : "+ c3.wheels);
		System.out.println("c3의 문은 : "+ c3.doors);
		System.out.println("c3의 색은 : "+ c3.color);
		
		System.out.println();
		System.out.println("c4의 바퀴는 : "+ c4.wheels);
		System.out.println("c4의 문은 : "+ c4.doors);
		System.out.println("c4의 색은 : "+ c4.color);
		
		System.out.println();
		System.out.println("c5의 바퀴는 : "+ c5.wheels);
		System.out.println("c5의 문은 : "+ c5.doors);
		System.out.println("c5의 색은 : "+ c5.color);
		
		c1.Start();
		c1.Stop();		
	}
}
