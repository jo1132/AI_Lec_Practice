import java.util.Scanner;

// >>���ȭ��<<

// �� �Է�: 
// �� �Է�:
// �� �Է�:

public class TimeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Time t1 = new Time();
		int[] arr;
		
		System.out.print("�� �Է�: ");
	//	t1.SetHour(sc.nextInt());
		System.out.print("�� �Է�: ");
		//t1.SetMin(sc.nextInt());
		System.out.print("�� �Է�: ");
		//t1.SetSec(sc.nextInt());
		
		//System.out.println(t1);  //t1 == t1.toString();
		
		
		arr = t1.getArr();
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		t1.ShowArr();
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			arr[i]++;
			System.out.print(arr[i]);
		}
		System.out.println();
		t1.ShowArr();
		System.out.println();
	}

}
