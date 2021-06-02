import java.util.Scanner;

//최대값/최솟값 구하는 프로그램
// >>결과화면<<
// 정수 1: 10
// 정수 2: 20

// 최대값: 20
// 최솟값: 10
public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, max, min;
		System.out.print(" 정수 1: ");
		a = sc.nextInt();
		System.out.print(" 정수 2: ");
		b = sc.nextInt();
		System.out.print(" 정수 3: ");
		c = sc.nextInt();
		
		if(a >= b && a >= c) max = a;
		else if(b >= c && b >= a) max = b;
		else max = c;
		
		if(a <= b && a <= c) min = a;
		else if(b <= c && b <= a) min = b;
		else min = c;
		
		System.out.println("\n 최대값: "+max+"\n 최솟값: "+min);
	}
}