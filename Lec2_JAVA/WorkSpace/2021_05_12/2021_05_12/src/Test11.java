import java.util.Scanner;

//543212345		1 5~1~5
// 4321234		2 4~1~4
//  32123		3 3~1~3
//   212		4 2~1~2
//    1	 		5 1~1~1

public class Test11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, k, num;
		
		//System.out.print("행을 입력해주세요: ");
		//num = sc.nextInt();
		num = 5;
		
		for(i=1;i<=num;i++) {
			for(j=1;j<i;j++) System.out.print(" ");
			
			for(j=num;j>=i;j--) System.out.print(j);
			
			for(j=i+1;j<=num;j++) System.out.print(j); 
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
