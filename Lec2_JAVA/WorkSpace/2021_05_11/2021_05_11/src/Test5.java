import java.util.Scanner;

// 덧셈 프로그램
// 1~9사이의 숫자 2개의 덧셈 구하는 프로그램
// >>결과화면<<
// 5 + 4 = 10
// 정답입니다!
public class Test5 {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		int r1, r2, n;
		
		r1 = (int)((Math.random()*9)+1);
		r2 = (int)((Math.random()*9)+1);
		
		System.out.print("1~9사이의 숫자 2개의 덧셈의 결과(2~18)를 입력하세요: ");
		n = scanner.nextInt();
		
		System.out.println(r1+" + "+r2+" = "+(r1+r2)+"입니다.");
		if(n == (r1+r2)) System.out.print("정답입니다!");
		else System.out.print("틀렸습니다.");
	}
}