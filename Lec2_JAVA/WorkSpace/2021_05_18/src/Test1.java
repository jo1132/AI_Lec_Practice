// final ������
// ��������: ó�� ������ ��(�ʱ�ȭ)���Ŀ� �������� �Ұ�!
// �������: ó�� ������ ��(1. ������� ����� �ʱ�ȭ, 2. ������ �ʱ�ȭ) ���� �ϳ��� ����. �� ���� ���� �Ұ�!
// �޼ҵ�: ����� �� ���� �޼ҵ�, �������̵��� �Ұ���������.
// Ŭ����: ������ �� ���� Ŭ����, finalŬ������ ��� ������ ����Ŭ������ �� �� ����.


// ���� ������ (access modifier)
// public: ��� Ŭ�������� ���� ���� (���� ���� ����)
// protected: ���� ��Ű�� ������ + �ٸ� ��Ű���� �ڼ�Ŭ���� ���� ����
// (default): ���� ��Ű�� �������� ������ ����
// private: ���� Ŭ���� �������� ���� ���� (����鳢���� ��� ����)


public class Test1 {

	public static void main(String[] args) {
		final int NUM = 123;   // �������� + final == ������ ����� ����.
		

		Car c1 = new Car();
		Car c2 = new Car("Gray", 8, true);
		Bus b1 = new Bus();
		
		
		c1.Start();
		c2.Stop();
		b1.Start();
		b1.Stop();
		System.out.println("b1�� "+b1.toString()+"�Դϴ�.");
		
		
		/*
		System.out.println("c1 power : "+c1.IsPowerOn());
		System.out.println("c1 color : "+c1.color);
		System.out.println("c1 doors : "+c1.doors);
		System.out.println("c1 wheels : "+Car.wheels);
		System.out.println();
		System.out.println("c2 power : "+c2.IsPowerOn());
		System.out.println("c2 color : "+c2.color);
		System.out.println("c2 doors : "+c2.doors);
		System.out.println("c2 wheels : "+Car.wheels);
		 */
	}

}
