import java.util.*;

public class Test6 {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		int n;
		
		
		System.out.println("���� �Է�: ");
		n = scanner.nextInt();
		
		
		// ã�°��� ������, ����, ���
		// switch(ã�°�) {�����}
		// break���� ����/�ݺ��� (��)�� ��������.(�� if���� ����)
		
		switch(n) {
			case 5 : System.out.print("�̰��� *�Դϴ�.");
			case 4 : System.out.print("�̰��� *�Դϴ�.");
			case 3 : System.out.print("�̰��� *�Դϴ�.");
			case 2 : System.out.print("�̰��� *�Դϴ�.");
			case 1 : System.out.print("�̰��� *�Դϴ�."); break;
			default: System.out.print("1~5�� �Է� �����մϴ�.");
		}
	}
}
	