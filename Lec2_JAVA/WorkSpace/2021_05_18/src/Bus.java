
public class Bus extends Car{  //�ڹٴ� ���ϻ�Ӹ� �����Ͽ� ���� ���� ���� Ŭ������ ��ӹް� ������ Ŭ������ ��������� ������ ���Խ��� ���԰���� ����Ѵ�.
	int windows;
	
	Bus(){
		windows = 10;
	}
	
	void Start() {  //Car�� start�� �������̵��Ѵ�.
		System.out.println("Bus�� ����մϴ�~~");
	}
	
	public String toString() {
		return "Bus";
	}
}
