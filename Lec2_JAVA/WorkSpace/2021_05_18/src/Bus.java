
public class Bus extends Car{  //자바는 단일상속만 가능하여 가장 많이 쓰는 클래스를 상속받고 나머지 클래스는 멤버변수로 선언해 포함시켜 포함관계로 사용한다.
	int windows;
	
	Bus(){
		windows = 10;
	}
	
	void Start() {  //Car의 start를 오버라이딩한다.
		System.out.println("Bus가 출발합니다~~");
	}
	
	public String toString() {
		return "Bus";
	}
}
