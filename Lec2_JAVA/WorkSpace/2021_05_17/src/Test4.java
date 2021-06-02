
// 1~100사이의 4의 배수이거나 또는 7의 배수이면 출력하는 프로그램
// 5개당 줄 바꿈하여 출력한다.
// >>결과화면<<
//4 7 8 12 14
//16 20 21 ...
public class Test4 extends Object{
	public static void main(String[] args) {
		int i, cnt = 0;
		
		for(i=1;i<=100;i++) {
			if(i%4 == 0 || i%7 == 0) {
				cnt++;
				System.out.printf("%3d", i);
				if(cnt % 5 == 0 || i == 100) System.out.println();
				else System.out.print(", ");
			}
		}
	}
}
