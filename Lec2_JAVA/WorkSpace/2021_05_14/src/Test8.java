import java.util.Scanner;


//>>결과화면<<
//p1_x 입력: 10
//p1_y 입력: 20
//p2_x 입력: 55 
//p2_y 입력: 40
//p1(10, 20)와 p2(33, 44)
//사이의 거리는 xx/x 입니다.

public class Test8 {
	public static void main(String[] args) {
		int p1_x, p1_y, p2_x, p2_y;
		int width, height;
		Scanner sc = new Scanner(System.in);
		System.out.print("p1_x 입력 : ");p1_x = sc.nextInt();
		System.out.print("p1_y 입력 : ");p1_y = sc.nextInt();
		System.out.print("p2_x 입력 : ");p2_x = sc.nextInt();
		System.out.print("p2_y 입력 : ");p2_y = sc.nextInt();
		
		System.out.println("두 꼭지점 :("+p1_x+","+p1_y+"), ("+p2_x+","+p2_y+")");
		System.out.println("width: "+(Math.abs(p1_x - p2_x))+", height: "+(Math.abs(p1_y - p2_y)));
		System.out.printf("두 점 사이의 거리는 : %.5f이다.", Math.sqrt(Math.pow(p1_x - p2_x, 2) + Math.pow(p1_y - p2_y, 2)));
	}
}
