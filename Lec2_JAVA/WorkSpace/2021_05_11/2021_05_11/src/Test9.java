import java.util.*;

//반복문 (for문)
//1~100사이의 누적합을 구하는 프로그램
//>>결과화면<<
//1~100 사이의 누적합은 xxx입니다.

public class Test9 {
	public static void main(String[] args) {		
		int i;
		int num = 0;  //누적변수는 초기화필수!!
		//for(1.초기값; 2.조건식; 3.증감식){문장~~}
		for(i=1;i<=100;i++) {
			num += i;
		}
		System.out.println("1~100사이의 누적합은 "+num+"입니다.");
	}
}
	