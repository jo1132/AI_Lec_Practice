import java.util.Scanner;

// ����� ���α׷�
//1~15�� ����� 1000��
//16~30�� ����� 2000��
//30~40�� ����� 3000��
//41~ : 10000��

//>>���ȭ��<<
//���� �Է�: 
//25���� ����� 2000�� �Դϴ�.

public class Test8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 0, age;
		while(true){
			System.out.print("���� �Է�: ");
			age = sc.nextInt();
			if(age>0) break;
			else System.out.println("1 �̻��� ���� �Է��Ͻʽÿ�.");
		}
		
		if(age<=15) money = 1000;
		else if(age <= 30) money = 2000;
		else if(age <= 40) money = 3000;
		else if(age>40)money = 10000;
		System.out.print(age+"���� ����� "+money+"�� �Դϴ�.");
	}
}
