
// 1~100������ 4�� ����̰ų� �Ǵ� 7�� ����̸� ����ϴ� ���α׷�
// 5���� �� �ٲ��Ͽ� ����Ѵ�.
// >>���ȭ��<<
//4 7 8 12 14
//16 20 21 ...
public class Test4 extends Object{
	public static void main(String[] args) {
		int i, cnt = 0;
		
		for(i=1;i<=100;i++) {
			if(i%4 == 0 || i%7 == 0) {
				cnt++;
				System.out.printf("%3d", i);
				if(cnt % 5 == 0 || i == 100) System.out.println();
				else System.out.print(", ");
			}
		}
	}
}
