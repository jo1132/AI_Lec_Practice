import java.util.*;
//�������� ���α׷� (Switch��)
//A:90~100, B:80~89, C: 70~79, D:60~69, F:0~59;

public class Test8 {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		int num;
		Math.random();
		System.out.print("������ �Է��� �ּ���: ");
		num = scanner.nextInt();
		
		if(num >= 0 && num <= 100) {
			switch (num/10) {
			case 10:                            //100���� 90���� �Ȱ��� A�� ������ break���� ��ĭ���� ���ΰ� A�� ����Ѵ�.
			case 9: System.out.print("A");break;
			case 8: System.out.print("B");break;
			case 7: System.out.print("C");break;
			case 6: System.out.print("D");break;
			default: System.out.print("F");
			}
		}
		else {
			System.out.println("0~100������ ������ �Է� ���� �մϴ�.");
		}
		
	}
}
	