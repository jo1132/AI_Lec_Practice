import java.util.*;

//�ݺ��� (for��)
//1~100������ �������� ���ϴ� ���α׷�
//>>���ȭ��<<
//1~100 ������ �������� xxx�Դϴ�.

public class Test9 {
	public static void main(String[] args) {		
		int i;
		int num = 0;  //���������� �ʱ�ȭ�ʼ�!!
		//for(1.�ʱⰪ; 2.���ǽ�; 3.������){����~~}
		for(i=1;i<=100;i++) {
			num += i;
		}
		System.out.println("1~100������ �������� "+num+"�Դϴ�.");
	}
}
	