import java.util.Scanner;

//랜덤(난수)발생 연습
// Math.random(); 을 이용한다.
//0.0 <= r < 1.0까지의 값이 나온다.

//1~45 사이의 랜덤값 6개 발생

public class Test2 {
	public static void main(String[] args) {
		int r1, r2, r3,r4, r5, r6, r7, r8, r9, r10;
		r1 = (int)(Math.random()*45) + 1; //1~45 사이의 랜덤값  발생
		r2 = (int)(Math.random()*45) + 1;
		r3 = (int)(Math.random()*45) + 1;
		r4 = (int)(Math.random()*45) + 1;
		r5 = (int)(Math.random()*45) + 1;
		r6 = (int)(Math.random()*45) + 1;
		
		System.out.println(r1+", "+r2+", "+r3+", "+r4+", "+r5+", "+r6);
	}
}