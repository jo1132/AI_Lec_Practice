import java.util.Scanner;

import aa.folder.*;
public class pointTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Point p1 = new Point();
		Point p2 = new Point();
		int width, height;
		
		System.out.print("p1의 x좌표, y좌표 입력: ");
		p1.x = sc.nextInt();
		p1.y = sc.nextInt();
		
		System.out.print("p2의 x좌표, y좌표 입력: ");
		p2.x = sc.nextInt();
		p2.y = sc.nextInt();
		
		
		width = Math.abs(p1.x - p2.x);
		height = Math.abs(p1.y - p2.y);
		
		double dist = Math.sqrt(width*width + height*height);
		
		System.out.println("p1: ("+p1.GetLocation()+")");
		System.out.println("p2: ("+p2.GetLocation()+")");
		System.out.println("두 점 사이의 너비: "+width+", 두 점 사이의 높이: "+height);
		System.out.printf("두 점 사이의 거리: %5.2f\n", dist);
		}
}
