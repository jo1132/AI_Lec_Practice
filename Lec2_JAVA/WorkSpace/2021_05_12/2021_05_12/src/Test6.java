import java.util.Scanner;

//			��	��
//    *			1 		
//   **
//  ***
// ****
//*****			1~5
public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, k, num;
		
		System.out.print("���� �Է����ּ���: ");
		num = sc.nextInt();
		
		for(i=1;i<=num;i++) {
			for(j=num;j>i;j--) System.out.print(" ");
			
			for(k=0;k<i;k++) System.out.print("*");
			
			System.out.println();
		}
	}
}
