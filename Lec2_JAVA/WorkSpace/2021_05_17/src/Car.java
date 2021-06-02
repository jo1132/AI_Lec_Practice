
public class Car {
	int wheels;
	int doors;
	String color;

	
	//3. 초기화 블러긍ㄹ 이용한 방법!
	//3-1, 인스턴스 초기화 블럭()
	//------생성자보다 빨리 호출된다.
	//------객체(인스턴스) 생성시마다 호출된다.
	{
		System.out.println("인스턴스 초기화 호출입니다.");
	}
	
	
	//3-2, 클래스 초기화 블럭
	//클래스가 로딩되는 순간 단 1회 호출된다!(프로그램 시작시)
	static {
		System.out.println("클래스 초기화 블럭 입니다.");
	}
	Car(){
		this("GRAY"); //자신을 제외한 다른 생성자를 호출한다.
		doors = 10;
		System.out.println("()생성자 입니다.");
	}
	
	Car(int wheels){
		this.wheels = wheels;  //this.은 객체 자신의 주소!!
		doors = 2;
		color = "White";
		System.out.println("(int)생성자 입니다.");
	}
	
	Car(String color){
		super(); // 조상의 기본 생성자 Object();호출 한다. 또, 문장의 맨 앞에 있어야 한다.
		wheels = 1;
		doors = 2;
		this.color = color;
		System.out.println("(String)생성자 입니다.");
	}
	
	Car(String color, int door){
		wheels = 1;
		this.doors = 2;
		this.color = color;
		System.out.println("(String, int)생성자 입니다.");
	}
	
	Car(Car c){ 
		//this.wheels = c.wheels;  //다른 객체의 속성을 그대로도 사용할 수 있다.
		//this.doors = c.doors + 2;
		//this.color = c.color;
		//c.wheels = 2;
		this(c.color, c.doors);  //재사용성을 높힐 수 있는 방법, 다른 생성자를 사용할 수 있다.
		System.out.println("(Car)생성자 입니다.");
		
	}
	
	
	void Start() {
		System.out.println("출발합니다~");
	}
	
	void Stop() {
		System.out.println("멈춤니다~");
	}
	
	public String toString() {
		return "Car 클래스";
	}
}