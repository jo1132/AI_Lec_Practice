import java.util.Scanner;

//사칙연산 프로그램
//>>결과화면<<
// 정수1 : 10
// 정수2 : 20

//=== 사칙연산 ===
//1. 덧셈
//2. 뺄셈
//3. 곱셈
//4. 종료
//=============

// 선텍: x
//10 - 20 = -10

public class Test11 {
	public static void main(String[] args) {
		int arr[] = new int[2];
		int func;
		//int n1, n2; //지역변수는 초기화 하지 않으면 쓰레기값이다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1: ");
		arr[0] = sc.nextInt();
		System.out.print("정수2: ");
		arr[1] = sc.nextInt();
		
		while(true) {
			
			System.out.println("=== 사칙연산 ===");
			System.out.println("1. 덧셈");
			System.out.println("2. 뺄셈");
			System.out.println("3. 곱셈");
			System.out.println("4. 종료");
			System.out.println();
			System.out.print("연산 입력: ");
			func = sc.nextInt();
			
			switch(func) {
			case 1:
				System.out.println(arr[0]+" + "+arr[1]+" = "+ (arr[0]+arr[1])); break;
			case 2: 
				System.out.println(arr[0]+" - "+arr[1]+" = "+ (arr[0]-arr[1])); break;
			case 3:
				System.out.println(arr[0]+" * "+arr[1]+" = "+ (arr[0]*arr[1])); break;
			case 4:
				System.out.print("시스템을 종료합니다.");
				System.exit(0);
			default: System.out.println("1~4 사이의 값을 입력해 주세요.");
			}
		}
	}
}
