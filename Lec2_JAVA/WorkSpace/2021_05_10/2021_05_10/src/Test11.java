import java.util.Scanner;

//���Ǳ� ���α׷�
//>>���ȭ��<<
// === �޴� ===
// 1. �Ƹ޸�ī��
// 2. ī���
// 3. īǪġ��
// 4. ����
public class Test11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		for(int i=0;i<5;i++) {
			System.out.println("=== �޴� ===\n 1. �Ƹ޸�ī��\n 2. ī���\n 3. īǪġ��\n 4. ����");
			n = sc.nextInt();
			if(n == 1) System.out.println("�޴�: "+n+"\n 1. �Ƹ޸�ī�븦 �����ϼ̽��ϴ�.\n");
			else if(n == 2) System.out.println("�޴�: "+n+"\n 2. ī��󶼸� �����ϼ̽��ϴ�.\n");
			else if(n == 3) System.out.println("�޴�: "+n+"\n 3. īǪġ�븦 �����ϼ̽��ϴ�.\n");
			else if(n == 4) System.out.println("�޴�: "+n+"\n 4. ���Ḧ �����ϼ̽��ϴ�.\n");
			else System.out.println("�޴��� �����ϴ� ��ȣ�� �Է��� �ּ���.\n");
		}
		
		System.out.println("System ����;;");
	}
}