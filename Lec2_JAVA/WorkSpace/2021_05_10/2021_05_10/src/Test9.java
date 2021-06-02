import java.util.Scanner;

//연산자 활용
//>>결과입력<<
// 초 입력 : 12345
//12345초는 ~~시간 ~~분 ~~초
public class Test9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int h, m, s;
		
		h = time/3600;
		m = (time % 3600)/60;
		s = time % 60;
		
		System.out.println(time+"초는 "+h+"시간 "+m+"분 "+s+"초 입니다.");
		System.out.println(time+"초는 "+time/3600+"시간 "+(time % 3600)/60+"분 "+time%60+"초 입니다.");
	}
}