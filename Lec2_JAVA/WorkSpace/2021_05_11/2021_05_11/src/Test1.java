import java.util.Scanner;

// �������� ���α׷�
//A: 90~100, B: 80~89, C: 70~79, D: 60~69, F: 0~59
//����ڿ��� ������ �Է¹޾� ����� �˷��ִ� ���α׷�
// ������ 0~100�� ������ �Է� �޾ƾ���. (�����޼��� �߰�)
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		char degree;
		while(true) {
			System.out.print("������ �Է��� �ּ��� : ");
			num = sc.nextInt();
			if(num < 0 || num > 100) System.out.print("������ 0~100 ������ ���� �Է����ּ���");
			else break;
		}
		
		if(num >=90) degree = 'A';
		else if(num>=80) degree = 'B';
		else if(num>=70) degree = 'C';
		else if(num>=60) degree = 'D';
		else degree = 'F';
		
		System.out.println("����� ������ "+degree+"�Դϴ�.");
	}
}