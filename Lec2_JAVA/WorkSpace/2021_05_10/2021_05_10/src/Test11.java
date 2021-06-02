import java.util.Scanner;

//자판기 프로그램
//>>결과화면<<
// === 메뉴 ===
// 1. 아메리카노
// 2. 카페라떼
// 3. 카푸치노
// 4. 종료
public class Test11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		for(int i=0;i<5;i++) {
			System.out.println("=== 메뉴 ===\n 1. 아메리카노\n 2. 카페라떼\n 3. 카푸치노\n 4. 종료");
			n = sc.nextInt();
			if(n == 1) System.out.println("메뉴: "+n+"\n 1. 아메리카노를 선택하셨습니다.\n");
			else if(n == 2) System.out.println("메뉴: "+n+"\n 2. 카페라떼를 선택하셨습니다.\n");
			else if(n == 3) System.out.println("메뉴: "+n+"\n 3. 카푸치노를 선택하셨습니다.\n");
			else if(n == 4) System.out.println("메뉴: "+n+"\n 4. 종료를 선택하셨습니다.\n");
			else System.out.println("메뉴에 존재하는 번호를 입력해 주세요.\n");
		}
		
		System.out.println("System 종료;;");
	}
}