import java.util.*;

//구구단 프로그램
// >>결과화면<<
//단 (2~9) 입력 : 9
//9*2 = 18
//....
//9*9 = 81
public class Test11 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int n, i;
		
		while(true) {
			System.out.print("단을 입력하시오: ");
			n = sc.nextInt();
			if (1<n && n<10) break;
			else System.out.print("2~9단만 가능");
		}
		
		for(i=1;i<10;i++) {
			System.out.printf("%2d * %2d = %2d\n", n, i, n*i);
		}
	}
}
	