//자바는 단일 상속만 가능!
public class Bus extends Car{ //Car클래스를 상속받는 Bus클래스
	int window; // 인스턴스 변수 //객체를 생성해야 볼 수 있는 변수이다.

	Bus(int window){
		//super()는 부모의 생성자 호출할 때 사용!
		// 모든 생성자 앞에 super()이 작성되어있지 않으면 컴파일러가 super();를 추가해준다.
		//단, this()가 있으면 super();을 추가해주지 않음/
		super(); //Car(); 와 같다. 상위클래스의 생성자를 호출하여 사용할 수 있다.
		/*
		Car(){
			this("GRAY"); //자신을 제외한 다른 생성자를 호출한다.
			doors = 10;
			System.out.println("()생성자 입니다.");
		}
		*/
		//가 호출된다.
		this.window = window;
	}
	void Start() {
		super.Start();
		System.out.println("버스 출발합니다.");
	}
	void busStop() {
		System.out.println("버스 멈춥니다.");
	}
	
	public String toString() {
		return "Bus 클래스";
	}
}
