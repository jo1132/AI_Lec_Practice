import java.util.Scanner;

/*1
      1			1	1~1~1
     212		2	1~2~1
    32123		3	1~3~1
   4321234		4
  543212345		5 	1~5~1
 */
public class Test12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, num;
		
		//System.out.print("행을 입력해주세요: ");
		//num = sc.nextInt();
		num = 5;
		
		for(i=1;i<=num;i++) {
			for(j=num;j>i;j--) {
				System.out.print(" ");
			}
			for(j=i;j>0;j--) {
				System.out.print(j);
			}
			for(j=2;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
}
