import java.util.*;

//���� 1`~50 ���߱� ���α׷�
//>>���ȭ��<<
//������ �Է� : 30
// 30���� �۽��ϴ�.
//.....
// �����Դϴ�.

public class Test12 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int r, n;
		
		r = (int)((Math.random()*50)+1);
		
		System.out.println("1~50 ���� ���߱� ���� �����մϴ�.");
		System.out.println("=======================");

		for(;;) {
			System.out.print("1~50������ ���ڸ� �Է����ּ���: ");
			n = sc.nextInt();
			
			if(r > n) System.out.println("Up!");
			else if(r < n) System.out.println("Down!");
			else {
				System.out.println(r+" �����Դϴ�!!!");
				break;
			}
		}
	}
}
	