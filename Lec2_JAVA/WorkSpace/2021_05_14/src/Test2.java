//�ڹ��� Ÿ��
// 1. �⺻��(8��) - boolean, char, byte, short, int, long, float, double

// 2. ������(Ŭ������)
//�ּҸ� ���� ������! (4byte)
public class Test2 {
	public static void main(String[] args) {
		Car.door = 4;  // ����� ����ƽ ������ ��ü ���� ���ص� ���� ����
		int n;
		Car c1;
		Car c2 = new Car();
		c2.color = "Pink";
		c1 = c2;
		System.out.print(c1.color);
		c2.color = "BLUE";
		System.out.print(c1.color);
		c1.start(); //Car�� Startȣ��(��)
		c1.stop();  // Car�� stopȣ��
		
		Car.stop();
		
	}
}
