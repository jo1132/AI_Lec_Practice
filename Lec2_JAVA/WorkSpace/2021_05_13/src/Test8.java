// arr 배열에 10, 30, 25으로 저장되어 있고, 
// 최대값 / 최솟값을 구하는 프로그램

public class Test8 {
	public static void main(String[] args) {
		int arr[] = new int[10];
		int i, max, min;
		
		for(i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100) + 1;
		}

		max = arr[0];
		min = arr[0];
		System.out.print("arr배열의 원소는 ");
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i < arr.length - 1) System.out.print(", ");
			if(max < arr[i]) max = arr[i];
			else if(min > arr[i]) max = arr[i];
		}
		System.out.println("입니다.");	
		System.out.println("MAX: "+max+", MIN: "+min+", 평균: "+(max+min)/2);	
	}
}
