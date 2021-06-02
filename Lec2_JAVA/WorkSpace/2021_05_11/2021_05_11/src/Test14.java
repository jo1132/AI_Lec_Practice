import java.util.*;

// 1~10까지의 누적합은 55입니ㅏㄷ.
// 1+2+3+4+5++6+7+8+9+10 = 55

public class Test14 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int i, sum = 0;
		for(i=1;i<=10;i++) {
			sum += i;
			if(i!=10) System.out.print(i+"+");
			else System.out.println(i + "="+sum);
		}
	}
}
	