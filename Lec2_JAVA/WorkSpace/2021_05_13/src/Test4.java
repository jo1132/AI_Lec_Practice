import java.util.Scanner;

//1���� �迭 ����
//>>���ȭ��<<
//�л�1 �����Է� : 98
//�л�2 ���� �Է� : 75
//�л�3 ���� �Է� : 100

// ��ȣ ����
//  1  98
//  2  75
//  3  100
public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stu[] = new int[3];
		int i;
		
		for (i=0;i<stu.length;i++) {
			System.out.print("�л�"+(i+1)+" ���� �Է� : ");
			stu[i] = sc.nextInt();
		}
		
		System.out.println("  ��ȣ     ����");
		for (i=0;i<stu.length;i++) {
			System.out.printf("%3d  %3d\n", i+1, stu[i]);
		}
	}
}
