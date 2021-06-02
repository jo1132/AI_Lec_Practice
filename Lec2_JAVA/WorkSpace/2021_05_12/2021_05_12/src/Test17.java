import java.util.Scanner;

// 3명의 점수 (double형)를 입력받아 총점과 평균을 구하는 프로그램
// >>결과화면 <<
// 학생1 점수 입력: 90.5
// 학생2 점수 입력: 38.7
// 학생3 점수 입력: 78.1
//
//3명의 총점 : xxx.x
//3명의 평균 : xx.x
public class Test17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double stu1 = 0, stu2 = 0, stu3 = 0;
		int i;
		
		for(i=1;i<=3;i++) {
			System.out.print("학생"+i+"의 점수 입력: ");
			switch(i) {
			case 1: stu1 = sc.nextDouble(); break;
			case 2: stu2 = sc.nextDouble(); break;
			case 3: stu3 = sc.nextDouble(); break;
			}
		}
		
		System.out.printf("3명의 총점 : %5.1f\n", (stu1+stu2+stu3));
		System.out.printf("3명의 총점 : %5.1f", (stu1+stu2+stu3)/3);
	}
}

