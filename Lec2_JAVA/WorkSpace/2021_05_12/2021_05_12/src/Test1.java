import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, k, space;
		//int MAX = sc.nextInt();
		int MAX = 5;
		if(MAX%3==0) space = MAX/3;
		else {
			space = MAX - MAX/3;
			space = space - MAX/3;
		}
		
		for(i = 1;i<=MAX;i++) {
			for(j=MAX;j>i;j--) System.out.print(" ");
			for(k=0;k<(2*i-1);k++) System.out.print("*");
			for(j=MAX;j>i;j--) System.out.print(" ");
			System.out.print("|");
			
			//***************************************************************->방향
			for(k=0;k<(2*i-1);k++) System.out.print("*");
			for(j=MAX*2;j>(2*i);j--) System.out.print(" ");
			System.out.print("|");
			
			//***************************************************************아래방향
			for(j=1;j<i;j++) System.out.print(" ");
			for(k=MAX*2;k>=(2*i);k--) System.out.print("*");
			for(j=1;j<i;j++) System.out.print(" ");
			System.out.print("|");

			//***************************************************************아래방향
			for(j=MAX*2;j>(2*i);j--) System.out.print(" ");
			for(k=0;k<(2*i-1);k++) System.out.print("*");
			System.out.print("|");
			
			System.out.println();
		}
		
	}
}
