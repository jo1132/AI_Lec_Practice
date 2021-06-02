import java.util.Scanner;

//		
//    *
//   ***
//  *****
// *******
//*********	1
public class Test9 {
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
		for(i = num-1;i>0;i--) {
			for(j=num;j>i;j--) System.out.print(" ");
			for(k=0;k<(2*i-1);k++) System.out.print("*");
			System.out.println();
		}
	}
}

/*
 * 1:7
 * 2:5
 * 3:3
 * 4:1
 */
