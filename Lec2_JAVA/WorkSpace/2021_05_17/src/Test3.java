//�ڹ��� �ְ����� Ŭ����: Object��� Ŭ���� �̴�.
//Ŭ���� ���ǽ� extends�� ���� ������ �ڵ����� ObjectŬ������ ����Ѵ�!
import java.lang.*;
public class Test3 extends Object{
	public static void main(String[] args) {
		Bus b1 = new Bus(10);
		Car c1 = new Car();
		
		System.out.println("b1�� ����: "+b1.toString()+"�Դϴ�.");
		System.out.println("c1�� ����: "+c1+"�Դϴ�.");  //c1�� �ּҰ��� ���´�. java���� �ڵ����� c1.toString()�ؼ� ������ش�.
		
		c1.Start();
		b1.Start();
		
	}
}
