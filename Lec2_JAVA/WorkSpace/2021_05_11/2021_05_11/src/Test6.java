import java.util.*;

public class Test6 {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		int n;
		
		
		System.out.println("정수 입력: ");
		n = scanner.nextInt();
		
		
		// 찾는값은 변수명, 수식, 상수
		// switch(찾는값) {문장들}
		// break문은 조건/반복문 (블럭)을 빠져나감.(단 if문을 제외)
		
		switch(n) {
			case 5 : System.out.print("이건은 *입니다.");
			case 4 : System.out.print("이건은 *입니다.");
			case 3 : System.out.print("이건은 *입니다.");
			case 2 : System.out.print("이건은 *입니다.");
			case 1 : System.out.print("이건은 *입니다."); break;
			default: System.out.print("1~5만 입력 가능합니다.");
		}
	}
}
	