import java.util.Scanner;

//			За	ї­
//    *			1 		
//   **
//  ***
// ****
//*****			1~5
public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, k, num;
		num = 5;
		
		for(i=1;i<=5;i++) {
			for(j=5;j>i;j--) {
				System.out.print(" ");
			}
			for(k=0;k<i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
