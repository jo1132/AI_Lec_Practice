import java.util.Scanner;

//����� �Է¹ް� �����
/*
 * ***** 
 * ****
 * ***
 * **
 * *
 */
public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, num;
		
		System.out.print("�� �Է�: ");
		num = sc.nextInt();
		for(i=1;i<=num;i++) {
			for(j=num;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}