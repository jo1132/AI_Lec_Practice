
public class Test5 {
	public static void main(String[] args) {
		Bus b1 = new Bus(); //객체 인스턴스 
		
		b1.start();
	}
	
	
	//오버로딩: 메소드명이 같으면서,
	//1. 매개변수의 개수가 다르거나
	//2. 매개변수의 타입이 다르면 됨!
	//단 반환타입이나 매개변수명이 다른건 오버로딩과 관계 없음
	
	void arr() {}
	void arr(int a) {}
	void arr(double a) {}
	void arr(int a, int b) {}
	
}
