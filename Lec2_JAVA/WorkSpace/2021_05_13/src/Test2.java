import java.util.Scanner;

//학생 3명으 ㅣ점수를 입력받아 총점과 평균 구하는 프로그램
//>>결과화면<<
//3명의 점수는 xx점, xx점, xx점 입니다.
//총점 : xx
//평균 : xx.x

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int point[] = new int[]{88, 99, 78, 82, 91};
		int i, total = 0, avg;
		
		System.out.println(point.length+"명의 점수를 입력하세요");
		//for(i=0;i<score.length;i++) point[i] = sc.nextInt();
		
		System.out.print(point.length+"명의 점수는 ");
		
		for(i=0;i<point.length;i++) {
			total += point[i];
			System.out.print(point[i]+"점");
			if(i<point.length - 1) System.out.print(", ");
			else System.out.println();
		}
		
		System.out.printf("%3d명의 총점은 %3d점이고, 평균은 %5.1f입니다.\n", point.length, total, (double)total/point.length);
		
		
		
	}
}
