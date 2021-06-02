// final 제어자
// 지역변수: 처음 대입한 값(초기화)이후에 값변경이 불가!
// 멤버변수: 처음 대입한 값(1. 멤버변수 명시적 초기화, 2. 생성자 초기화) 둘중 하나면 가능. 그 이후 변경 불가!
// 메소드: 변경될 수 없는 메소드, 오버라이딩이 불가능해진다.
// 클래스: 변경할 수 없는 클래스, final클래스는 어느 누구의 조상클래스가 될 수 없다.


// 접근 제어자 (access modifier)
// public: 모든 클래스에서 접근 가능 (가장 넓은 개념)
// protected: 같은 패키지 내에서 + 다른 패키지의 자손클래스 접근 가능
// (default): 같은 패키지 내에서만 접근이 가능
// private: 같은 클래스 내에서만 접근 가능 (멤버들끼리만 사용 가능)


public class Test1 {

	public static void main(String[] args) {
		final int NUM = 123;   // 지역변수 + final == 고정된 상수로 쓴다.
		

		Car c1 = new Car();
		Car c2 = new Car("Gray", 8, true);
		Bus b1 = new Bus();
		
		
		c1.Start();
		c2.Stop();
		b1.Start();
		b1.Stop();
		System.out.println("b1은 "+b1.toString()+"입니다.");
		
		
		/*
		System.out.println("c1 power : "+c1.IsPowerOn());
		System.out.println("c1 color : "+c1.color);
		System.out.println("c1 doors : "+c1.doors);
		System.out.println("c1 wheels : "+Car.wheels);
		System.out.println();
		System.out.println("c2 power : "+c2.IsPowerOn());
		System.out.println("c2 color : "+c2.color);
		System.out.println("c2 doors : "+c2.doors);
		System.out.println("c2 wheels : "+Car.wheels);
		 */
	}

}
