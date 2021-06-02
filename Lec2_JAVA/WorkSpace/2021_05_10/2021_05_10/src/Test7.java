import java.util.Scanner; 

// 사용자에게 정수 1개를 입력받아 3의 배수인지 아닌지 구하는 프로그램
// >> 결과화면 <<
//정수입력 : 12
//12 는 3의 배수 입니다.

public class Test7 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력: ");
		num = sc.nextInt();
		
		if(num % 3 == 0 && num != 0) System.out.println(">>>" + num + "은 3의 배수 입니다." + "<<<");
		
		else System.out.println(">>>" + num + "은 3의 배수 가 아닙니다." + "<<<");
	}
}
