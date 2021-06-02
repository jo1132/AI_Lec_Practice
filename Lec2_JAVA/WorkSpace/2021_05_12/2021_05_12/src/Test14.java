/*
      >>결과화면<<
      1+2+3+4+5=15
*/

public class Test14 {
	public static void main(String[] args) {
		int i, total = 0;
		
		for(i=1;i<=5;i++) {
			if(i%2 == 0) {
				total += i;
				System.out.print("+");
			}
			else {
				total -= i; 
				System.out.print("-");
			}
			System.out.print(i);
			
			if(i == 5) System.out.print("="+total); 
		}

	}
}
