
public class Test3 {
	public static void main(String[] args) {
		int[] ball = new int[45]; //�迭�� �ٷ�� ���� ball ���� �� �ʱ�ȭ
		int i, j, temp;
		int min, num;
		for(i=0;i<ball.length;i++) ball[i] = i + 1;
		
		for(i=0;i<100;i++) {
			j = (int)(Math.random()*45);
			
			//SWAP ��ü �˰��� -> �ӽú����� �ʿ��ϴ�.
			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}
		
		
		for(i=0;i<6;i++) {
			min = ball[i];
			for(j=i;j<6;j++) {
				if(ball[j] < min) {
					min = ball[j];
					temp = ball[j];
					ball[j] = ball[i];
					ball[i] = temp;
				}
			}
		}
		System.out.print("������ �ζ� ��ȣ�� ");
		for(i=0;i<6;i++) {
			System.out.print(ball[i]+"��");
			if(i != 5) System.out.print(" ");
			else System.out.println(" �Դϴ�.");
		}
	}
}
