import java.util.Scanner;

//������ Ȱ��
//>>����Է�<<
// �� �Է� : 12345
//12345�ʴ� ~~�ð� ~~�� ~~��
public class Test9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int h, m, s;
		
		h = time/3600;
		m = (time % 3600)/60;
		s = time % 60;
		
		System.out.println(time+"�ʴ� "+h+"�ð� "+m+"�� "+s+"�� �Դϴ�.");
		System.out.println(time+"�ʴ� "+time/3600+"�ð� "+(time % 3600)/60+"�� "+time%60+"�� �Դϴ�.");
	}
}