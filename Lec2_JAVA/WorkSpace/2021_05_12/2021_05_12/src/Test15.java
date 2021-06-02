import java.util.Scanner;

/*
    	음료자판기 프로그램
    	>>결과화면<<
    	// 돈 입력: 100
    	 
    	====메뉴====
    	1. 콜라(500원)
    	2. 사이다(600원)
    	3. 핫식스(700원)
    	4. 종료
    	===========
    	메뉴입력: 1
    	콜라를 선택하셨습니다.
*/

public class Test15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0, menu, mon;
		
		System.out.println("====메뉴====");
		System.out.println("1. 콜라(500원)");
		System.out.println("3. 핫식스(700원)");
		System.out.println("4. 종료");
		
		loop1 : while(true) {
			System.out.print("돈을 넣어주세요. (현재잔액 :"+total+"원) : ");
			mon = sc.nextInt();
			total += mon;
			
			while(true) {
				System.out.println("메뉴를 입력해주세요");
				menu=sc.nextInt();
					if (menu == 1) {
						System.out.println("콜라(500원)을 선택하셨습니다. ");
						if(total >= 500) {
							total -= 500;
							System.out.println("(현재잔액: "+total+")");
						}
						else {
							System.out.println("잔액이 부족합니다. (현재잔액: "+total+")");
							break;
						}
						
					}
					
					else if (menu == 2) {
						System.out.println("사이다(600원)을 선택하셨습니다.");
						if(total >= 600) {
							total -= 600;
							System.out.println("(현재잔액: "+total+")");
						}
						else {
							System.out.println("잔액이 부족합니다. (현재잔액: "+total+")");
							break;
						}
						
					}
					
					else if (menu == 3) {
						System.out.println("핫식스(700원)을 선택하셨습니다.");
						if(total >= 700) {
							total -= 700;
							System.out.println("(현재잔액: "+total+")");
						}
						else {
							System.out.println("잔액이 부족합니다. (현재잔액: "+total+")");
							break;
						}
					}
					
					else if (menu == 4) {
						System.out.println("프로그램을 종료합니다.");
						System.out.println(total+"원을 반환합니다.");
						System.exit(0);
					}
					
					else {
						System.out.println("1~4의 정수를 입력해주세요.");
						System.out.println("(현재잔액: "+total+")");
					}
					if(total==0) break;
					
					System.out.println();
			}
		}
	}
}

