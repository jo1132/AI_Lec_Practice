/*1
      1~100������ r�� ����� ��� ���
      r�� 1~5������ ������ �߻�
      
*/
public class Test13 {
	public static void main(String[] args) {
		int i, r, cnt = 0;
		
		r = (int)((Math.random()*6)+5);
		System.out.println("�������� "+r+"�Դϴ�.");
		
		for(i=1;i<=100;i++) {
			if(i%r == 0) {
				cnt++;
				if(cnt % 4 == 0 || i+r>100) System.out.printf("%3d\n", i);
				else System.out.printf("%3d, ", i);
			}
		}
	}
}
