import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��� �ּ���: ");
		
		n = sc.nextInt();
		
	
		if(n > 0) System.out.println("n = "+n+" ����Դϴ�.");
		else if(n == 0) System.out.println(" 0�Դϴ�.");
		else System.out.println("n = "+n+" ���� �Դϴ�.");

	}
}
