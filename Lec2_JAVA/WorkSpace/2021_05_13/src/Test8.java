// arr �迭�� 10, 30, 25���� ����Ǿ� �ְ�, 
// �ִ밪 / �ּڰ��� ���ϴ� ���α׷�

public class Test8 {
	public static void main(String[] args) {
		int arr[] = new int[10];
		int i, max, min;
		
		for(i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100) + 1;
		}

		max = arr[0];
		min = arr[0];
		System.out.print("arr�迭�� ���Ҵ� ");
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i < arr.length - 1) System.out.print(", ");
			if(max < arr[i]) max = arr[i];
			else if(min > arr[i]) max = arr[i];
		}
		System.out.println("�Դϴ�.");	
		System.out.println("MAX: "+max+", MIN: "+min+", ���: "+(max+min)/2);	
	}
}
