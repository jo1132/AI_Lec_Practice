//생성자: 클래스명과 같고, 리턴타입은 없음!!!!
//클래스당 1개 이상의 생성자가 있어야 한다.!

public class Bus {
	//4개의 인스턴스 변수, 초기화 하지 않으면 기본값
	String color;
	int door;
	int window;
	boolean power;
	
	//컴파일러가 생성자가 없으면 기본생성자로 Bus(){}를 자동으로 추가해줌
	Bus(){
		color = "black";
		door = 4;
		window = 10;
		power = false;
	}
	void start() {
		System.out.println("버스 출발합니다~");
	}
}
