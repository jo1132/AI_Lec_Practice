import java.util.*;

//숫자 1`~50 맞추기 프로그램
//>>결과화면<<
//ㅓ정수 입력 : 30
// 30보다 작습니다.
//.....
// 정답입니다.

public class Test12 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int r, n;
		
		r = (int)((Math.random()*50)+1);
		
		System.out.println("1~50 숫자 맞추기 게임 시작합니다.");
		System.out.println("=======================");

		for(;;) {
			System.out.print("1~50사이의 숫자를 입력해주세요: ");
			n = sc.nextInt();
			
			if(r > n) System.out.println("Up!");
			else if(r < n) System.out.println("Down!");
			else {
				System.out.println(r+" 정답입니다!!!");
				break;
			}
		}
	}
}
	