import java.util.Scanner;
// ����ڿ��� ���� �Է¹޾Ƽ� ��, õ, ��, ��, �� ������ ǥ���ϴ� ���α׷�
// >>���ȭ��<<
// �� �Է�: 12345
// 0�� 2õ 3�� 4�� 4��
public class Test18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money;
		System.out.print("�� �Է�: ");
		money = sc.nextInt();
		System.out.print(money/10000+"�� "+money%10000/1000+"õ "+money%1000/100+"�� "+money%100/10+"�� "+money%10+"��");
	}
}

