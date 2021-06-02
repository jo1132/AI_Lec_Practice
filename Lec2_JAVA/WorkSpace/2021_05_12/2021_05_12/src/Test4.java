import java.util.Scanner;

//사용자 입력받고 별찍기
/*
 * ***** 
 * ****
 * ***
 * **
 * *
 */
public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, num;
		
		System.out.print("행 입력: ");
		num = sc.nextInt();
		
		for(i=0;i<=num;i++) {
			for(j=num;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
