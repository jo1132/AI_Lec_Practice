import java.util.*; // Scanner 클래스 사용하기 위해 import

// 홀수/짝수 구별 프로그램
//>>결과화면<<
//입력하신 15는 홀 수 입니다.

public class Test5 {
	public static void main(String[] args) {
		int n;
		String str = new String();
		Scanner sc = new Scanner(System.in);//스캐너 객체 생성
		
		System.out.print("정수를 입력해주세요: "); // \n: 줄바꿈
		n = sc.nextInt();
		
		if(n == 0) str = "0";
		
		else if(n%2 == 0) str = "짝수";
		
		else str = "홀수";
		
		System.out.println(">>" + n + "은 "+str+" 입니다." + "<<");
		}
}
