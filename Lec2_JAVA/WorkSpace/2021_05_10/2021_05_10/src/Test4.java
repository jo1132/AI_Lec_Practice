import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요: ");
		
		n = sc.nextInt();
		
	
		if(n > 0) System.out.println("n = "+n+" 양수입니다.");
		else if(n == 0) System.out.println(" 0입니다.");
		else System.out.println("n = "+n+" 음수 입니다.");

	}
}
