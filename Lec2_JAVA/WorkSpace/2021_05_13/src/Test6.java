
public class Test6 {
	public static void main(String[] args) {
		int i, j;
		int arr1[][] = new int[][] {{1, 2},{11, 12}, {914,121334}};
		boolean flag = true;
		int arr2[][] = new int [3][2];
		
		for(i=0;i<arr1.length;i++) {
			System.arraycopy(arr1[i], 0, arr2[i], 0, arr1[i].length);
		}
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		loop: for(i=0;i<arr1.length;i++) {
			for(j=0;j<arr1[i].length;j++) {
				if(arr1[i][j] != arr2[i][j]) {
					flag = false;
					break loop;
				}
			}
		}
		System.out.print(flag);
	}
}
