import java.util.*;

//������ ���α׷�
// >>���ȭ��<<
//�� (2~9) �Է� : 9
//9*2 = 18
//....
//9*9 = 81
public class Test11 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int n, i;
		
		while(true) {
			System.out.print("���� �Է��Ͻÿ�: ");
			n = sc.nextInt();
			if (1<n && n<10) break;
			else System.out.print("2~9�ܸ� ����");
		}
		
		for(i=1;i<10;i++) {
			System.out.printf("%2d * %2d = %2d\n", n, i, n*i);
		}
	}
}
	