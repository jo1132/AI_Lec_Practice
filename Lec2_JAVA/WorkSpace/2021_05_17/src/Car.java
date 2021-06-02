
public class Car {
	int wheels;
	int doors;
	String color;

	
	//3. �ʱ�ȭ ���ऩ �̿��� ���!
	//3-1, �ν��Ͻ� �ʱ�ȭ ��()
	//------�����ں��� ���� ȣ��ȴ�.
	//------��ü(�ν��Ͻ�) �����ø��� ȣ��ȴ�.
	{
		System.out.println("�ν��Ͻ� �ʱ�ȭ ȣ���Դϴ�.");
	}
	
	
	//3-2, Ŭ���� �ʱ�ȭ ��
	//Ŭ������ �ε��Ǵ� ���� �� 1ȸ ȣ��ȴ�!(���α׷� ���۽�)
	static {
		System.out.println("Ŭ���� �ʱ�ȭ �� �Դϴ�.");
	}
	Car(){
		this("GRAY"); //�ڽ��� ������ �ٸ� �����ڸ� ȣ���Ѵ�.
		doors = 10;
		System.out.println("()������ �Դϴ�.");
	}
	
	Car(int wheels){
		this.wheels = wheels;  //this.�� ��ü �ڽ��� �ּ�!!
		doors = 2;
		color = "White";
		System.out.println("(int)������ �Դϴ�.");
	}
	
	Car(String color){
		super(); // ������ �⺻ ������ Object();ȣ�� �Ѵ�. ��, ������ �� �տ� �־�� �Ѵ�.
		wheels = 1;
		doors = 2;
		this.color = color;
		System.out.println("(String)������ �Դϴ�.");
	}
	
	Car(String color, int door){
		wheels = 1;
		this.doors = 2;
		this.color = color;
		System.out.println("(String, int)������ �Դϴ�.");
	}
	
	Car(Car c){ 
		//this.wheels = c.wheels;  //�ٸ� ��ü�� �Ӽ��� �״�ε� ����� �� �ִ�.
		//this.doors = c.doors + 2;
		//this.color = c.color;
		//c.wheels = 2;
		this(c.color, c.doors);  //���뼺�� ���� �� �ִ� ���, �ٸ� �����ڸ� ����� �� �ִ�.
		System.out.println("(Car)������ �Դϴ�.");
		
	}
	
	
	void Start() {
		System.out.println("����մϴ�~");
	}
	
	void Stop() {
		System.out.println("����ϴ�~");
	}
	
	public String toString() {
		return "Car Ŭ����";
	}
}