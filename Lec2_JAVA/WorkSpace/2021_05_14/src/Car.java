//Car는 클래스명이면서 사용자 정의 타입이면서 참조형이다.

public class Car {  //modifier  class 클래스명, Car 클래스 정의
	//보통 클래스명은 대문자로 시작한다.
	
	//멤버 변수: 클래스 내부에 선언한 변수
	//멤버 변수는 초기화 하지 않으면 기본값으로 설정
	//정수: 0, 실수: 0.0, boolean: false, 참조형(클래스명) : null
	//2개의 멤버 변수이다.

	//1. 인스턴스 변수: 앞에 static이 없는 멤버변수, 객체(인스턴스)를 생성해야지만 접근할 수 있는 변수
	//2. static 변수: 클래스 변수, 공유(공용)변수이다. 객체들 사이에서도 공유된다.
	//               - 앞에 static이 있는 변수
	//               - 클래스 명으로도 접근 가능 ex: Car.door = 2;
	//				 - 객체(인스턴스)를 생성해도 되고, 안해도 접근 가능하다.
	String color; //인스턴스 변수
	static int door;

	void start() {
		System.out.println("출발합니다.");
	}
	
	static void stop() { //static변수: 클래스 변수, 공유(공용)변수이다. 객체들 사이에서도 공유된다.
		System.out.println("정지합니다.");
	}
	
	
}
