import java.util.Scanner;

//���Ǳ� ���α׷�
//>>���ȭ��<<
// === �޴� ===
// 1. �Ƹ޸�ī��
// 2. ī���
// 3. īǪġ��
// 4. ����
public class Test12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, money;

		System.out.print("�� �Է�: ");
		money = sc.nextInt();
		
		System.out.println("=== �޴� ===\n 1. �Ƹ޸�ī�� 500��\n 2. ī��� 700��\n 3. īǪġ��1000��\n 4. ����");
		n = sc.nextInt();
		
		if(n == 1) {
			if(money < 500) {
				System.out.println("���� �ܾ� : "+money+"\n �ݾ��� �����մϴ�.\n");
			}
			else {
				System.out.println("�޴�: "+n+"\n 1. �Ƹ޸�ī�븦 �����ϼ̽��ϴ�.\n");
				money -= 500;
			}
		}
		else if(n == 2) {
			if(money < 700) {
				System.out.println("���� �ܾ� : "+money+"\n �ݾ��� �����մϴ�.\n");
			}
			else {
				System.out.println("�޴�: "+n+"\n 2. ī��󶼸� �����ϼ̽��ϴ�.\n");
				money -= 700;
			}
		}
		else if(n == 3) {
			
			if(money < 1000) {
				System.out.println("���� �ܾ� : "+money+"\n �ݾ��� �����մϴ�.\n");
			}
			else {
				System.out.println("�޴�: "+n+"\n 3. īǪġ�븦 �����ϼ̽��ϴ�.\n");
				money -= 1000;
			}
		}
		else if(n == 4) {
			System.out.println("�޴�: "+n+"\n 4. ���Ḧ �����ϼ̽��ϴ�.\n");
		}
		else System.out.println("�޴��� �����ϴ� ��ȣ�� �Է��� �ּ���.\n");
		
		System.out.println("���� �ܾ� : "+money);
	}
}