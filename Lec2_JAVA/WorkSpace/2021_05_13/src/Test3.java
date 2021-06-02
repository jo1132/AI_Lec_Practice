
public class Test3 {
	public static void main(String[] args) {
		int[] ball = new int[45]; //배열을 다루는 변수 ball 선언 및 초기화
		int i, j, temp;
		int min, num;
		for(i=0;i<ball.length;i++) ball[i] = i + 1;
		
		for(i=0;i<100;i++) {
			j = (int)(Math.random()*45);
			
			//SWAP 교체 알고리즘 -> 임시변수가 필요하다.
			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}
		
		
		for(i=0;i<6;i++) {
			min = ball[i];
			for(j=i;j<6;j++) {
				if(ball[j] < min) {
					min = ball[j];
					temp = ball[j];
					ball[j] = ball[i];
					ball[i] = temp;
				}
			}
		}
		System.out.print("금주의 로또 번호는 ");
		for(i=0;i<6;i++) {
			System.out.print(ball[i]+"번");
			if(i != 5) System.out.print(" ");
			else System.out.println(" 입니다.");
		}
	}
}
