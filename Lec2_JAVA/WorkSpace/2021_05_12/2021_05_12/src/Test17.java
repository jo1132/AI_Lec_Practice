import java.util.Scanner;

// 3���� ���� (double��)�� �Է¹޾� ������ ����� ���ϴ� ���α׷�
// >>���ȭ�� <<
// �л�1 ���� �Է�: 90.5
// �л�2 ���� �Է�: 38.7
// �л�3 ���� �Է�: 78.1
//
//3���� ���� : xxx.x
//3���� ��� : xx.x
public class Test17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double stu1 = 0, stu2 = 0, stu3 = 0;
		int i;
		
		for(i=1;i<=3;i++) {
			System.out.print("�л�"+i+"�� ���� �Է�: ");
			switch(i) {
			case 1: stu1 = sc.nextDouble(); break;
			case 2: stu2 = sc.nextDouble(); break;
			case 3: stu3 = sc.nextDouble(); break;
			}
		}
		
		System.out.printf("3���� ���� : %5.1f\n", (stu1+stu2+stu3));
		System.out.printf("3���� ���� : %5.1f", (stu1+stu2+stu3)/3);
	}
}

