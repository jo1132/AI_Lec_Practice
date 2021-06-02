//자바의 타입
// 1. 기본형(8개) - boolean, char, byte, short, int, long, float, double

// 2. 참조형(클래스명)
//주소만 저장 가능함! (4byte)
public class Test2 {
	public static void main(String[] args) {
		Car.door = 4;  // 도어는 스태틱 변수라 객체 생성 안해도 접근 가능
		int n;
		Car c1;
		Car c2 = new Car();
		c2.color = "Pink";
		c1 = c2;
		System.out.print(c1.color);
		c2.color = "BLUE";
		System.out.print(c1.color);
		c1.start(); //Car의 Start호출(콜)
		c1.stop();  // Car의 stop호출
		
		Car.stop();
		
	}
}
