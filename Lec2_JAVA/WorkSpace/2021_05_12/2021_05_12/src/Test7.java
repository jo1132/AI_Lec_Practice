import java.util.Scanner;

//			��	��
//*****		1 		
// ****
//  ***
//   **
//    *			1~5
public class Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, k, num;
		
		System.out.print("���� �Է����ּ���: ");
		num = sc.nextInt();
		
		for(i=1;i<=num;i++) {
			for(j=1;j<i;j++) System.out.print(" ");
			for(k=num;k>=i;k--) System.out.print("*");
			System.out.println();
		}
	}
}
