//1~9 ������ �ߺ����� ���� ���ڷ� �̷���� 3�ڸ� ���ڸ� ������ ���α׷��̴�.
// (1), (2) �� �˸��� �ڵ带 �־ ���α׷��� �ϼ��Ͻÿ�
// ���� <Math.random() ���, p156 5-5 ����
public class TEST5 {

	public static void main(String[] args) {
		int ballArr[] = {1,2, 3, 4, 5, 6, 7, 8, 9};
		int ball3[] = new int[3];
		int ball3_2[] = new int[3];
		int i, j, temp;
		
		//�迭 ballArr�� ������ ��Ҹ� ��� ��ġ�� �ٲ۴�.
		
		for(i=0;i<ballArr.length;i++) {
			j = (int)(Math.random()*ballArr.length);
			temp = 0;
			
			/*(1)*/
			temp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = temp;
		}
		
		//�迭 ballArr�� �տ��� 3���� ���� ball3�� �����Ѵ�.
		/* (2) */
		for(i=0;i<ball3.length;i++) ball3[i] = ballArr[i];
		System.arraycopy(ballArr, 0, ball3_2, 0, 3);
		
		for(i=0;i<ball3.length;i++) System.out.print(ball3[i] + "");
		System.out.println();
		for(i=0;i<ball3_2.length;i++) System.out.print(ball3_2[i] + "");
	}
	
}
