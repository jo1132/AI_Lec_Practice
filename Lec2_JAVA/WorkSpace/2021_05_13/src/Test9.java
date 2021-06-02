//
public class Test9 {
	public static void main(String[] args) {
		int arr[][] = new int[4][5];

		
		int i, j, temp, min, max;
		
		for (i=0;i<arr[0].length;i++) arr[0][i] = (int)(Math.random()*100) +1;
		for (i=0;i<arr.length - 1;i++) System.arraycopy(arr[i], 0, arr[i+1], 0, arr[i].length); 
		
		
		System.out.print("원본 배열은 ");
		for (i=0;i<arr[0].length;i++) System.out.print(arr[0][i]+" ");
		System.out.println("입니다.");
		
//---------------------------------------------------------------
		for(i=0;i<arr[1].length;i++) {
			min = i;
			for(j=i;j<arr[1].length;j++) {
				if(arr[1][min] > arr[1][j]) {
					min = j;
				}
			}
			temp = arr[1][i];
			arr[1][i] = arr[1][min];
			arr[1][min] = temp;
		}
		
//_---------------------------------------------------------------------
		
		for(i=arr[2].length-1;i>0;i--) {
			for(j=i;j>0;j--) {
				if(arr[2][j-1] < arr[2][j]) {
					temp = arr[2][j-1];
					arr[2][j-1] = arr[2][j];
					arr[2][j] = temp;
				}
			}
		}
//-------------------------------------------------------------------------
		System.out.println("정렬된 배열은 ");
		for (i=1;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		System.out.println("입니다.");
	}
}
