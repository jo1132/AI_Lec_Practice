import java.util.Scanner; 

// ����ڿ��� ���� 1���� �Է¹޾� 3�� ������� �ƴ��� ���ϴ� ���α׷�
// >> ���ȭ�� <<
//�����Է� : 12
//12 �� 3�� ��� �Դϴ�.

public class Test7 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Է�: ");
		num = sc.nextInt();
		
		if(num % 3 == 0 && num != 0) System.out.println(">>>" + num + "�� 3�� ��� �Դϴ�." + "<<<");
		
		else System.out.println(">>>" + num + "�� 3�� ��� �� �ƴմϴ�." + "<<<");
	}
}
