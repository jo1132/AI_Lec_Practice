import java.util.Scanner;

/*
    	�������Ǳ� ���α׷�
    	>>���ȭ��<<
    	// �� �Է�: 100
    	 
    	====�޴�====
    	1. �ݶ�(500��)
    	2. ���̴�(600��)
    	3. �ֽĽ�(700��)
    	4. ����
    	===========
    	�޴��Է�: 1
    	�ݶ� �����ϼ̽��ϴ�.
*/

public class Test15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0, menu, mon;
		
		System.out.println("====�޴�====");
		System.out.println("1. �ݶ�(500��)");
		System.out.println("3. �ֽĽ�(700��)");
		System.out.println("4. ����");
		
		loop1 : while(true) {
			System.out.print("���� �־��ּ���. (�����ܾ� :"+total+"��) : ");
			mon = sc.nextInt();
			total += mon;
			
			while(true) {
				System.out.println("�޴��� �Է����ּ���");
				menu=sc.nextInt();
					if (menu == 1) {
						System.out.println("�ݶ�(500��)�� �����ϼ̽��ϴ�. ");
						if(total >= 500) {
							total -= 500;
							System.out.println("(�����ܾ�: "+total+")");
						}
						else {
							System.out.println("�ܾ��� �����մϴ�. (�����ܾ�: "+total+")");
							break;
						}
						
					}
					
					else if (menu == 2) {
						System.out.println("���̴�(600��)�� �����ϼ̽��ϴ�.");
						if(total >= 600) {
							total -= 600;
							System.out.println("(�����ܾ�: "+total+")");
						}
						else {
							System.out.println("�ܾ��� �����մϴ�. (�����ܾ�: "+total+")");
							break;
						}
						
					}
					
					else if (menu == 3) {
						System.out.println("�ֽĽ�(700��)�� �����ϼ̽��ϴ�.");
						if(total >= 700) {
							total -= 700;
							System.out.println("(�����ܾ�: "+total+")");
						}
						else {
							System.out.println("�ܾ��� �����մϴ�. (�����ܾ�: "+total+")");
							break;
						}
					}
					
					else if (menu == 4) {
						System.out.println("���α׷��� �����մϴ�.");
						System.out.println(total+"���� ��ȯ�մϴ�.");
						System.exit(0);
					}
					
					else {
						System.out.println("1~4�� ������ �Է����ּ���.");
						System.out.println("(�����ܾ�: "+total+")");
					}
					if(total==0) break;
					
					System.out.println();
			}
		}
	}
}

