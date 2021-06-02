//1~9 사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다.
// (1), (2) 에 알맞은 코드를 넣어서 프로그램을 완성하시오
// 참고 <Math.random() 사용, p156 5-5 문제
public class TEST5 {

	public static void main(String[] args) {
		int ballArr[] = {1,2, 3, 4, 5, 6, 7, 8, 9};
		int ball3[] = new int[3];
		int ball3_2[] = new int[3];
		int i, j, temp;
		
		//배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		
		for(i=0;i<ballArr.length;i++) {
			j = (int)(Math.random()*ballArr.length);
			temp = 0;
			
			/*(1)*/
			temp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = temp;
		}
		
		//배열 ballArr의 앞에서 3개의 수를 ball3에 복사한다.
		/* (2) */
		for(i=0;i<ball3.length;i++) ball3[i] = ballArr[i];
		System.arraycopy(ballArr, 0, ball3_2, 0, 3);
		
		for(i=0;i<ball3.length;i++) System.out.print(ball3[i] + "");
		System.out.println();
		for(i=0;i<ball3_2.length;i++) System.out.print(ball3_2[i] + "");
	}
	
}
