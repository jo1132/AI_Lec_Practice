//�ڹٴ� ���� ��Ӹ� ����!
public class Bus extends Car{ //CarŬ������ ��ӹ޴� BusŬ����
	int window; // �ν��Ͻ� ���� //��ü�� �����ؾ� �� �� �ִ� �����̴�.

	Bus(int window){
		//super()�� �θ��� ������ ȣ���� �� ���!
		// ��� ������ �տ� super()�� �ۼ��Ǿ����� ������ �����Ϸ��� super();�� �߰����ش�.
		//��, this()�� ������ super();�� �߰������� ����/
		super(); //Car(); �� ����. ����Ŭ������ �����ڸ� ȣ���Ͽ� ����� �� �ִ�.
		/*
		Car(){
			this("GRAY"); //�ڽ��� ������ �ٸ� �����ڸ� ȣ���Ѵ�.
			doors = 10;
			System.out.println("()������ �Դϴ�.");
		}
		*/
		//�� ȣ��ȴ�.
		this.window = window;
	}
	void Start() {
		super.Start();
		System.out.println("���� ����մϴ�.");
	}
	void busStop() {
		System.out.println("���� ����ϴ�.");
	}
	
	public String toString() {
		return "Bus Ŭ����";
	}
}
