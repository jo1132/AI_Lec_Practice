import java.util.Scanner;

//자판기 프로그램
//>>결과화면<<
// === 메뉴 ===
// 1. 아메리카노
// 2. 카페라떼
// 3. 카푸치노
// 4. 종료
public class Test12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, money;

		System.out.print("돈 입력: ");
		money = sc.nextInt();
		
		System.out.println("=== 메뉴 ===\n 1. 아메리카노 500원\n 2. 카페라떼 700원\n 3. 카푸치노1000원\n 4. 종료");
		n = sc.nextInt();
		
		if(n == 1) {
			if(money < 500) {
				System.out.println("현재 잔액 : "+money+"\n 금액이 부족합니다.\n");
			}
			else {
				System.out.println("메뉴: "+n+"\n 1. 아메리카노를 선택하셨습니다.\n");
				money -= 500;
			}
		}
		else if(n == 2) {
			if(money < 700) {
				System.out.println("현재 잔액 : "+money+"\n 금액이 부족합니다.\n");
			}
			else {
				System.out.println("메뉴: "+n+"\n 2. 카페라떼를 선택하셨습니다.\n");
				money -= 700;
			}
		}
		else if(n == 3) {
			
			if(money < 1000) {
				System.out.println("현재 잔액 : "+money+"\n 금액이 부족합니다.\n");
			}
			else {
				System.out.println("메뉴: "+n+"\n 3. 카푸치노를 선택하셨습니다.\n");
				money -= 1000;
			}
		}
		else if(n == 4) {
			System.out.println("메뉴: "+n+"\n 4. 종료를 선택하셨습니다.\n");
		}
		else System.out.println("메뉴에 존재하는 번호를 입력해 주세요.\n");
		
		System.out.println("현재 잔액 : "+money);
	}
}