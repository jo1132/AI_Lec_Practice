import java.util.Scanner;

//팩토리얼 (5! = 5*4*3*2*1
//>>결과화면 <<
// 정수입력: 5
//5! = 120


public class Test16 {
	public static void main(String[] args) {
		int i, num, total = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력: ");
		num = sc.nextInt();
		
		System.out.print(num+"!: ");
		for(i=num;i>0;i--) {
			System.out.print(i);
			total *= i;
			if(i == 1) {
				System.out.print("="+total);
			}
			else {
				System.out.print("*");
			}
		}
	}
}

