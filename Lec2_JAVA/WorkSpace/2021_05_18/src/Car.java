import java.lang.*; // java.lang. ��Ű�� ������ System, string, Object, Math�� �⺻ �����Ǵ�  �͵��� �ִ�.


// Ŭ���� ������ 1�� �̻��� �����ڰ� �־�� ��!
//�⺻ ������ ���ڸ� �����ʰ� �ʱ�ȭ�ϴ� �������̴�.
//extends�� ������ , �ڵ����� Object�� ��ӹް� �ȴ�.

// abstract(�߻�) Ŭ������ 1�� �̻��� abstract(�߻�) �޼ҵ尡 �ִ� Ŭ������ �ǹ���!
// �߻�Ŭ������ ��ӹ��� ���� ����!!!!!


public  class Car extends Object{
	int doors;
	String color;
	static int wheels = 4; //����� �ʱ�ȭ ���
	private boolean power;
	
	Car(){
		this("Black", 6, false);// �� this()�� super()�� ���� ó���� ���;� �Ѵ�. 
		/*
		color = "black";
		doors = 6;
		wheels = 4;
		power = false;
		*/
	}
	
	Car(String color, int doors, boolean power){
		super(); 			// this()�� ���� �����ڴ� super()�� �����Ϸ��� �־��ش�. ������ �����ڸ� ȣ�����ش�.
		this.color = color;
		this.doors = doors;
		this.power = power;
	}
	
	void Start() {
		System.out.println("Car ����մϴ�~~");
	}
	
	void Stop() {
		System.out.println("Car ����~~");
	}
	
	boolean IsPowerOn() {
		return this.power;
	}
	  
	//abstract void method();  // abstract(�߻�, ����) �޼ҵ� ����.
							// �޼ҵ��� ����� �ְ�, �ٵ� ���°�
}
