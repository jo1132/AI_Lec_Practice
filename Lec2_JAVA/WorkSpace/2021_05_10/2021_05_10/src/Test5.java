import java.util.*; // Scanner Ŭ���� ����ϱ� ���� import

// Ȧ��/¦�� ���� ���α׷�
//>>���ȭ��<<
//�Է��Ͻ� 15�� Ȧ �� �Դϴ�.

public class Test5 {
	public static void main(String[] args) {
		int n;
		String str = new String();
		Scanner sc = new Scanner(System.in);//��ĳ�� ��ü ����
		
		System.out.print("������ �Է����ּ���: "); // \n: �ٹٲ�
		n = sc.nextInt();
		
		if(n == 0) str = "0";
		
		else if(n%2 == 0) str = "¦��";
		
		else str = "Ȧ��";
		
		System.out.println(">>" + n + "�� "+str+" �Դϴ�." + "<<");
		}
}
