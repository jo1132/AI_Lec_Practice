import java.util.*;

// �ֻ���2�� ������ ���� ���ߴ� ���α׷�
// 5ȸ�� ��ȸ�� ��! (�����߸� ������ �˷��ְ� ����)
public class Test15 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int r1, r2, n, i = 0;
		
		r1 = (int)((Math.random()*6)+1);
		r2 = (int)((Math.random()*6)+1);
		
		while(i<5) {
			i++;
			System.out.println(i+"��°, ������ �Է��ϼ���: ");
			n = sc.nextInt();
			
			if((r1+r2) == n) {
				System.out.println("("+r1+"+"+r2+") = "+(r1+r2)+" �����Դϴ�!");
				break;
			}
			else {
				System.out.println("Ʋ�Ƚ��ϴ� �� ");
			}
		}
		System.out.println("������"+(r1+r2)+"�̾����ϴ�.");
	}
}
	