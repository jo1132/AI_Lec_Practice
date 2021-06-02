import java.util.Scanner;

//		
//    *
//   ***
//  *****
// *******
//*********	1
public class Test8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, k, num;
		
		System.out.print("행을 입력해주세요: ");
		num = sc.nextInt();
		
		for(i = 1;i<=num;i++) {
			for(j=num;j>i;j--) System.out.print(" ");
			for(k=0;k<(2*i-1);k++) System.out.print("*");
			System.out.println();
		}
	}
}
