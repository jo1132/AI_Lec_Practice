import java.util.Scanner;

// 입장료 프로그램
//1~15세 입장료 1000원
//16~30세 입장료 2000원
//30~40세 입장료 3000원
//41~ : 10000원

//>>결과화면<<
//나이 입력: 
//25세는 입장료 2000원 입니다.

public class Test8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 0, age;
		while(true){
			System.out.print("나이 입럭: ");
			age = sc.nextInt();
			if(age>0) break;
			else System.out.println("1 이상의 값을 입력하십시오.");
		}
		
		if(age<=15) money = 1000;
		else if(age <= 30) money = 2000;
		else if(age <= 40) money = 3000;
		else if(age>40)money = 10000;
		System.out.print(age+"세는 입장료 "+money+"원 입니다.");
	}
}
