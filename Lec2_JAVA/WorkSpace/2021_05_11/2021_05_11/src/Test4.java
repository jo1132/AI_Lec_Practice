import java.util.Scanner;

// 주사위(1~6) 2개 던져서 나온 숫자의 합 맞추는 프로그램
// >>결과화면 1<<
// (6, 3) 의 합은 9입니다.

// >>결과화면 2-1<<
// 주사위 2개의 합 (2~12) 입력: 10
//(6,3)의 합은 9입니다!

// >>결과화면 2-2<<
// 
public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r1 = (int)((Math.random()*6) + 1);
		int r2 = (int)((Math.random()*6) + 1);
		int sum = r1+r2;
		int n;

		System.out.print("주사위의 2개의합(2~12) 입력 : ");
		n = sc.nextInt();
		System.out.println("("+r1+", "+r2+")의 합은"+sum+"입니다.");
		if(n == sum) System.out.println("정답입니다!");
		else System.out.println("틀렸습니다!");
	
		
		r1 = (int)((Math.random()*6) + 1);
		r2 = (int)((Math.random()*6) + 1);
		sum = r1+r2;	
		for(int i=0;i<3 + 1;i++) {
			if(i == 4) {
				System.out.println("실패하셨습니다. ("+r1+", "+r2+")의 합은"+sum+"입니다.");
				break;
			}
			System.out.print("주사위의 합은? : ");
			n = sc.nextInt();
			if(n > sum) System.out.println("너무 큽니다!");
			else if (n < sum) System.out.println("너무 작습니다!");
			else {
				System.out.println("정답입니다!");
				break;
			}
		}
		
		
	}
}