import java.util.Scanner;

//		
//1
//12
//123
//1234
//12345	1

//5
//54
//543
//5432
//54321
public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, k, num;
		
		System.out.print("행을 입력해주세요: ");
		num = sc.nextInt();
		
		for(i=1;i<=num;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for(i=1;i<=num;i++) {
			for(j=num;j>num-i;j--) {
				System.out.print(j);
			}
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
