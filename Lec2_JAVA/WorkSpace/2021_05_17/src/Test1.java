//�����ڴ� ��� �ʱ�ȭ�� ���
//�����ڴ� Ŭ������� ����, �ݵ�� 1�� �̻��� �����ڰ� �־�� �Ѵ�.
//�����ڴ� �޼ҵ� �ƴ�, ����Ÿ���� ����

import java.lang.*; // �����Ϸ��� �ڵ� �߰�
public class Test1 {

	Test1(){} // �⺻������, �����Ϸ��� �����ڰ� ������ �⺻ ������ �߰�����

	public static void main(String[] args) {
		System.out.println("������ �����Դϴ�.");
		Car c1 = new Car(); // ��ü(�ν��Ͻ�) c1����.  �̰͵� ���������� ���������̴�.
		Car c2 = new Car(2);
		Car c3 = new Car("RED");
		Car c4 = new Car("HOTPINK", 6);
		Car c5 = new Car(c1);
		int n = 123; //�������� -> �ʱ�ȭ���� ������ �����Ⱚ�� ����.

		System.out.println("c1�� ������ : "+ c1.wheels);
		System.out.println("c1�� ���� : "+ c1.doors);
		System.out.println("c1�� ���� : "+ c1.color);
		
		System.out.println();
		System.out.println("c2�� ������ : "+ c2.wheels);
		System.out.println("c2�� ���� : "+ c2.doors);
		System.out.println("c2�� ���� : "+ c2.color);
		
		System.out.println();
		System.out.println("c3�� ������ : "+ c3.wheels);
		System.out.println("c3�� ���� : "+ c3.doors);
		System.out.println("c3�� ���� : "+ c3.color);
		
		System.out.println();
		System.out.println("c4�� ������ : "+ c4.wheels);
		System.out.println("c4�� ���� : "+ c4.doors);
		System.out.println("c4�� ���� : "+ c4.color);
		
		System.out.println();
		System.out.println("c5�� ������ : "+ c5.wheels);
		System.out.println("c5�� ���� : "+ c5.doors);
		System.out.println("c5�� ���� : "+ c5.color);
		
		c1.Start();
		c1.Stop();		
	}
}
