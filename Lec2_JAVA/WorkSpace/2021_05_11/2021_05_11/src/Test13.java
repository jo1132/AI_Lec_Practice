import java.util.*;

//������ � ���α׷�
// �� 1~10�� ������ �������

public class Test13 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int r, i;
		
		r = (int)((Math.random()*10)+1);
		
		for(i=1;i<=r;i++) {
			System.out.print("*");
		}
	}
}
	