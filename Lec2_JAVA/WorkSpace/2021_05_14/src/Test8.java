import java.util.Scanner;


//>>���ȭ��<<
//p1_x �Է�: 10
//p1_y �Է�: 20
//p2_x �Է�: 55 
//p2_y �Է�: 40
//p1(10, 20)�� p2(33, 44)
//������ �Ÿ��� xx/x �Դϴ�.

public class Test8 {
	public static void main(String[] args) {
		int p1_x, p1_y, p2_x, p2_y;
		int width, height;
		Scanner sc = new Scanner(System.in);
		System.out.print("p1_x �Է� : ");p1_x = sc.nextInt();
		System.out.print("p1_y �Է� : ");p1_y = sc.nextInt();
		System.out.print("p2_x �Է� : ");p2_x = sc.nextInt();
		System.out.print("p2_y �Է� : ");p2_y = sc.nextInt();
		
		System.out.println("�� ������ :("+p1_x+","+p1_y+"), ("+p2_x+","+p2_y+")");
		System.out.println("width: "+(Math.abs(p1_x - p2_x))+", height: "+(Math.abs(p1_y - p2_y)));
		System.out.printf("�� �� ������ �Ÿ��� : %.5f�̴�.", Math.sqrt(Math.pow(p1_x - p2_x, 2) + Math.pow(p1_y - p2_y, 2)));
	}
}
