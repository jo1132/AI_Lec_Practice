import java.util.Scanner;

// �ֻ���(1~6) 2�� ������ ���� ������ �� ���ߴ� ���α׷�
// >>���ȭ�� 1<<
// (6, 3) �� ���� 9�Դϴ�.

// >>���ȭ�� 2-1<<
// �ֻ��� 2���� �� (2~12) �Է�: 10
//(6,3)�� ���� 9�Դϴ�!

// >>���ȭ�� 2-2<<
// 
public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r1 = (int)((Math.random()*6) + 1);
		int r2 = (int)((Math.random()*6) + 1);
		int sum = r1+r2;
		int n;

		System.out.print("�ֻ����� 2������(2~12) �Է� : ");
		n = sc.nextInt();
		System.out.println("("+r1+", "+r2+")�� ����"+sum+"�Դϴ�.");
		if(n == sum) System.out.println("�����Դϴ�!");
		else System.out.println("Ʋ�Ƚ��ϴ�!");
	
		
		r1 = (int)((Math.random()*6) + 1);
		r2 = (int)((Math.random()*6) + 1);
		sum = r1+r2;	
		for(int i=0;i<3 + 1;i++) {
			if(i == 4) {
				System.out.println("�����ϼ̽��ϴ�. ("+r1+", "+r2+")�� ����"+sum+"�Դϴ�.");
				break;
			}
			System.out.print("�ֻ����� ����? : ");
			n = sc.nextInt();
			if(n > sum) System.out.println("�ʹ� Ů�ϴ�!");
			else if (n < sum) System.out.println("�ʹ� �۽��ϴ�!");
			else {
				System.out.println("�����Դϴ�!");
				break;
			}
		}
		
		
	}
}