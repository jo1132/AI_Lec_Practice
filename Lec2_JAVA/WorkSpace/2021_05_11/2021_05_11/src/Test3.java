import java.util.Scanner;

//1~100 ������ �������� �߻����Ѽ� 5�� ������� �ƴ��� üũ�ϴ� ���α׷�
// >>���ȭ��<<
// 15�� 5�� ����Դϴ�.

public class Test3 {
	public static void main(String[] args) {
		int r;
		r = (int)(Math.random()*100);
		
		if(r % 5 == 0) System.out.println(r+"�� 5�� ����̸�, ���� "+r/5+"�Դϴ�.");
		else System.out.println(r+"�� 5�� ����� �ƴմϴ�.");
	}
}