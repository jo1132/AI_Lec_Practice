import java.util.Scanner;

// 성적관리 프로그램
//A: 90~100, B: 80~89, C: 70~79, D: 60~69, F: 0~59
//사용자에게 점수를 입력받아 등급을 알려주는 프로그램
// 점수는 0~100점 사이인 입력 받아야함. (에러메세지 추가)
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		char degree;
		while(true) {
			System.out.print("점수를 입력해 주세요 : ");
			num = sc.nextInt();
			if(num < 0 || num > 100) System.out.print("점수는 0~100 사이의 값을 입력해주세요");
			else break;
		}
		
		if(num >=90) degree = 'A';
		else if(num>=80) degree = 'B';
		else if(num>=70) degree = 'C';
		else if(num>=60) degree = 'D';
		else degree = 'F';
		
		System.out.println("당신의 성적은 "+degree+"입니다.");
	}
}