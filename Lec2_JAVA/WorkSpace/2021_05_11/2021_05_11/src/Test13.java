import java.util.*;

//오늘의 운세 프로그램
// 별 1~10개 사이의 출력해줌

public class Test13 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int r, i;
		
		r = (int)((Math.random()*10)+1);
		
		for(i=1;i<=r;i++) {
			System.out.print("*");
		}
	}
}
	