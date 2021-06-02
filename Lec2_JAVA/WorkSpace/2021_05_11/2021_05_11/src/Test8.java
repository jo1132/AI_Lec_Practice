import java.util.*;
//성적관리 프로그램 (Switch문)
//A:90~100, B:80~89, C: 70~79, D:60~69, F:0~59;

public class Test8 {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		int num;
		Math.random();
		System.out.print("성적을 입력해 주세요: ");
		num = scanner.nextInt();
		
		if(num >= 0 && num <= 100) {
			switch (num/10) {
			case 10:                            //100점과 90점이 똑같이 A기 때문에 break없이 빈칸으로 나두고 A를 출력한다.
			case 9: System.out.print("A");break;
			case 8: System.out.print("B");break;
			case 7: System.out.print("C");break;
			case 6: System.out.print("D");break;
			default: System.out.print("F");
			}
		}
		else {
			System.out.println("0~100사이의 성적만 입력 가능 합니다.");
		}
		
	}
}
	