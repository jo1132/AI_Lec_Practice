//�����ڴ� ��� �ʱ�ȭ�� ���
//�����ڴ� Ŭ������� ����, �ݵ�� 1�� �̻��� �����ڰ� �־�� �Ѵ�.
//�����ڴ� �޼ҵ� �ƴ�, ����Ÿ���� ����

public class Test2 {

	int n;
	static int[] arr = new int[10]; //Ŭ���� ����(1���� �迭�� �ٷ�� ����)
	static {	//Ŭ���� �ʱ�ȭ ��(���α׷� ���۽� 1ȸ ȣ��ȴ�.)
		for(int i=0;i<arr.length;i++) arr[i] = (int)(Math.random()*10)+1;
	}

	public static void main(String[] args) {
		int i;
		for(i=0;i<Test2.arr.length;i++) {
			System.out.println("arr["+i+"] = " + arr[i]);
		}
	}
}
