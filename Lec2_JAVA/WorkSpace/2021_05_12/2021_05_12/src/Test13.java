/*1
      1~100사이의 r의 배수를 모두 출력
      r은 1~5사이의 랜덤값 발생
      
*/
public class Test13 {
	public static void main(String[] args) {
		int i, r, cnt = 0;
		
		r = (int)((Math.random()*6)+5);
		System.out.println("랜덤값은 "+r+"입니다.");
		
		for(i=1;i<=100;i++) {
			if(i%r == 0) {
				cnt++;
				if(cnt % 4 == 0 || i+r>100) System.out.printf("%3d\n", i);
				else System.out.printf("%3d, ", i);
			}
		}
	}
}
