import java.util.Scanner;

//���� ���߱� ����
//>>���ȭ��<<
//===�޴�===
//1. ��Ʈ 1
//2. ��Ʈ 2
//3. ��Ʈ 3
//4. ��Ʈ ����

// �޴� �Է� : 1
// �ٸ��� 4�� �Դϴ�.
// [1ȸ ����] (�ִ� n�� ����)
// ���� �Է�: ������
// �����Դϴ�.

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answers = new String("tiger");
		String result = new String();
		int i, j, num;
		
		System.out.println("���� ���߱� ����!");
		System.out.println("===�޴�===");
		
		for(j=1;j<=5;j++) {
			for (i=1;i<=4;i++) {
				if(i == 4) System.out.println(i+". ��Ʈ����");
				else System.out.println(i+". ��Ʈ "+i);
			}
			System.out.printf("�޴� �Է�: ");
			num = sc.nextInt();
			switch(num) {
				case 1:
					System.out.println("�ٸ��� 4�� �Դϴ�.");
					break;
				case 2:
					System.out.println("�ѱ������� �־��ٰ� �մϴ�.");
					break;
				case 3:
					System.out.println("���ĵ��� �Դϴ�.");
					break;
				case 4:
					break;
				default: System.out.println("1~4������ ������ �Է����ּ���!"); 
			}
			System.out.println("["+j+"ȸ ����]");
			System.out.print("������ �Է��ϼ���: ");
			result = sc.next();
			System.out.println(result+"�� �Է��ϼ̽��ϴ�.");

			if(result.equals(answers)) {
				System.out.println("�����Դϴ�!!");
				break;
			}
			else {
				System.out.println("Ʋ�Ƚ��ϴ�. �ٽõ����ϼ���!");
				System.out.printf("[������ȸ "+(5-j)+"��]\n\n");
			}
			if(j == 5) {
				System.out.print("�����ϼ̽��ϴ�....");
				System.out.println("������ "+answers+"�Դϴ�.");
				System.exit(0);
			}
			
		}
	}
}
