import java.util.Scanner;

// ���� ���α׷�
// 1~9������ ���� 2���� ���� ���ϴ� ���α׷�
// >>���ȭ��<<
// 5 + 4 = 10
// �����Դϴ�!
public class Test5 {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		int r1, r2, n;
		
		r1 = (int)((Math.random()*9)+1);
		r2 = (int)((Math.random()*9)+1);
		
		System.out.print("1~9������ ���� 2���� ������ ���(2~18)�� �Է��ϼ���: ");
		n = scanner.nextInt();
		
		System.out.println(r1+" + "+r2+" = "+(r1+r2)+"�Դϴ�.");
		if(n == (r1+r2)) System.out.print("�����Դϴ�!");
		else System.out.print("Ʋ�Ƚ��ϴ�.");
	}
}