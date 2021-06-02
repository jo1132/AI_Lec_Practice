
public class Test4 {

	public static void main(String[] args) {
		int i, n = 100, result = 0;
		
		for (i=0;i<100;i++) {
			try {
				result = n / (int)(Math.random()*10);
				System.out.println(result);
			}
			catch(Exception E) {
				System.out.print("Error : /by zero ");
				System.out.println(0);
			}
		}
	}
}
