import java.util.Scanner;

//�л� 3���� �������� �Է¹޾� ������ ��� ���ϴ� ���α׷�
//>>���ȭ��<<
//3���� ������ xx��, xx��, xx�� �Դϴ�.
//���� : xx
//��� : xx.x

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int point[] = new int[]{88, 99, 78, 82, 91};
		int i, total = 0, avg;
		
		System.out.println(point.length+"���� ������ �Է��ϼ���");
		//for(i=0;i<score.length;i++) point[i] = sc.nextInt();
		
		System.out.print(point.length+"���� ������ ");
		
		for(i=0;i<point.length;i++) {
			total += point[i];
			System.out.print(point[i]+"��");
			if(i<point.length - 1) System.out.print(", ");
			else System.out.println();
		}
		
		System.out.printf("%3d���� ������ %3d���̰�, ����� %5.1f�Դϴ�.\n", point.length, total, (double)total/point.length);
		
		
		
	}
}
