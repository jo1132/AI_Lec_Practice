import java.util.Scanner;

//�ִ밪/�ּڰ� ���ϴ� ���α׷�
// >>���ȭ��<<
// ���� 1: 10
// ���� 2: 20

// �ִ밪: 20
// �ּڰ�: 10
public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, max, min;
		System.out.print(" ���� 1: ");
		a = sc.nextInt();
		System.out.print(" ���� 2: ");
		b = sc.nextInt();
		System.out.print(" ���� 3: ");
		c = sc.nextInt();
		
		if(a >= b && a >= c) max = a;
		else if(b >= c && b >= a) max = b;
		else max = c;
		
		if(a <= b && a <= c) min = a;
		else if(b <= c && b <= a) min = b;
		else min = c;
		
		System.out.println("\n �ִ밪: "+max+"\n �ּڰ�: "+min);
	}
}