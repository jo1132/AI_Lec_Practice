import java.util.Scanner;
// 사용자에게 돈을 입력받아서 만, 천, 백, 십, 원 단위로 표시하는 프로그램
// >>결과화면<<
// 돈 입력: 12345
// 0만 2천 3백 4십 4원
public class Test18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money;
		System.out.print("돈 입력: ");
		money = sc.nextInt();
		System.out.print(money/10000+"만 "+money%10000/1000+"천 "+money%1000/100+"백 "+money%100/10+"십 "+money%10+"원");
	}
}

