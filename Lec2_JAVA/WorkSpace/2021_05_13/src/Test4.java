import java.util.Scanner;

//1차원 배열 연습
//>>결과화면<<
//학생1 점수입력 : 98
//학생2 점수 입력 : 75
//학생3 점수 입력 : 100

// 번호 점수
//  1  98
//  2  75
//  3  100
public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stu[] = new int[3];
		int i;
		
		for (i=0;i<stu.length;i++) {
			System.out.print("학생"+(i+1)+" 점수 입력 : ");
			stu[i] = sc.nextInt();
		}
		
		System.out.println("  번호     점수");
		for (i=0;i<stu.length;i++) {
			System.out.printf("%3d  %3d\n", i+1, stu[i]);
		}
	}
}
