
public class Test6 {
	public static void main(String[] args) {
		int n = 10;
		double n2 = 15.5;
		System.out.print("Hello WORLD!");
		System.out.print("Hello WORLD!\n");
		System.out.println("Hello WORLD!");
		
		//형식 지정자
		//%d: 10진 정수
		// %c : 문자 1개
		// %s : 문자열
		// %f : float
		System.err.println("메롱~");
		System.out.printf("n의 값은 %d 입니다.\n", n); //c언어처럼 형식 지정자를 사용하여 출력하는 방법이다.
		System.out.printf("n의 값은 %.2f 입니다.\n", n2);
	}
}
