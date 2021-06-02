import java.util.*;

// 주사위2개 던져서 숫자 맞추는 프로그램
// 5회의 기회를 줌! (못맞추면 정답을 알려주고 종료)
public class Test15 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int r1, r2, n, i = 0;
		
		r1 = (int)((Math.random()*6)+1);
		r2 = (int)((Math.random()*6)+1);
		
		while(i<5) {
			i++;
			System.out.println(i+"번째, 정수를 입력하세요: ");
			n = sc.nextInt();
			
			if((r1+r2) == n) {
				System.out.println("("+r1+"+"+r2+") = "+(r1+r2)+" 정답입니다!");
				break;
			}
			else {
				System.out.println("틀렸습니다 ㅠ ");
			}
		}
		System.out.println("정답은"+(r1+r2)+"이었습니다.");
	}
}
	