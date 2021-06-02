// 성적관리 프로그램
//>>결과화면<<

// = 3명의 국,영,수 점수의 총점을 구하는 프로그램 = 
// 번호 국어 영어 수학 총점
//  1  90 98 78 xx
//  1  77 80 90 xx
//  1  60 90100 xx


public class Test5 {
	public static void main(String[] args) {
		int i, j, total = 0;
		int stu[][] = new int[][] {{90, 98, 78}, {77, 80, 90}, {60, 90, 100}, {88, 91, 73}};
		
		System.out.println("<"+stu.length+"명의 국,영,수 점수의 총점을 구하는 프로그램>");
		System.out.printf(" 번호\t 국어\t 영어\t 수학\t 총점\t   평균\n");
		
		
		for(i=0;i<stu.length;i++) {
			System.out.printf("%3d\t", i+1);
			total = 0;
			for(j=0;j<stu[i].length;j++) {
				System.out.printf("%3d\t", stu[i][j]);
				total += stu[i][j];
			}
			System.out.printf("%3d\t%4.1f\n", total, (double)total/stu.length);
		}
	}
}
