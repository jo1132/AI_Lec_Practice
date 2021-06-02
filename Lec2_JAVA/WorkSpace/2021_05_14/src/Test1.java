import java.util.Scanner;

//동물 맞추기 게임
//>>결과화면<<
//===메뉴===
//1. 힌트 1
//2. 힌트 2
//3. 힌트 3
//4. 힌트 없음

// 메뉴 입력 : 1
// 다리가 4개 입니다.
// [1회 도전] (최대 n번 까지)
// 동물 입력: 강아지
// 정답입니다.

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answers = new String("tiger");
		String result = new String();
		int i, j, num;
		
		System.out.println("동물 맞추기 게임!");
		System.out.println("===메뉴===");
		
		for(j=1;j<=5;j++) {
			for (i=1;i<=4;i++) {
				if(i == 4) System.out.println(i+". 힌트없음");
				else System.out.println(i+". 힌트 "+i);
			}
			System.out.printf("메뉴 입력: ");
			num = sc.nextInt();
			switch(num) {
				case 1:
					System.out.println("다리가 4개 입니다.");
					break;
				case 2:
					System.out.println("한국에서도 있었다고 합니다.");
					break;
				case 3:
					System.out.println("육식동물 입니다.");
					break;
				case 4:
					break;
				default: System.out.println("1~4사이의 정수를 입력해주세요!"); 
			}
			System.out.println("["+j+"회 도전]");
			System.out.print("정답을 입력하세요: ");
			result = sc.next();
			System.out.println(result+"를 입력하셨습니다.");

			if(result.equals(answers)) {
				System.out.println("정답입니다!!");
				break;
			}
			else {
				System.out.println("틀렸습니다. 다시도전하세요!");
				System.out.printf("[남은기회 "+(5-j)+"번]\n\n");
			}
			if(j == 5) {
				System.out.print("실패하셨습니다....");
				System.out.println("정답은 "+answers+"입니다.");
				System.exit(0);
			}
			
		}
	}
}
