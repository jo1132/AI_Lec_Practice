import java.util.Scanner;

//��Ģ���� ���α׷�
//>>���ȭ��<<
// ����1 : 10
// ����2 : 20

//=== ��Ģ���� ===
//1. ����
//2. ����
//3. ����
//4. ����
//=============

// ����: x
//10 - 20 = -10

public class Test11 {
	public static void main(String[] args) {
		int arr[] = new int[2];
		int func;
		//int n1, n2; //���������� �ʱ�ȭ ���� ������ �����Ⱚ�̴�.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1: ");
		arr[0] = sc.nextInt();
		System.out.print("����2: ");
		arr[1] = sc.nextInt();
		
		while(true) {
			
			System.out.println("=== ��Ģ���� ===");
			System.out.println("1. ����");
			System.out.println("2. ����");
			System.out.println("3. ����");
			System.out.println("4. ����");
			System.out.println();
			System.out.print("���� �Է�: ");
			func = sc.nextInt();
			
			switch(func) {
			case 1:
				System.out.println(arr[0]+" + "+arr[1]+" = "+ (arr[0]+arr[1])); break;
			case 2: 
				System.out.println(arr[0]+" - "+arr[1]+" = "+ (arr[0]-arr[1])); break;
			case 3:
				System.out.println(arr[0]+" * "+arr[1]+" = "+ (arr[0]*arr[1])); break;
			case 4:
				System.out.print("�ý����� �����մϴ�.");
				System.exit(0);
			default: System.out.println("1~4 ������ ���� �Է��� �ּ���.");
			}
		}
	}
}
