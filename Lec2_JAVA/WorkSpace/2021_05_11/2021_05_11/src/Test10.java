import java.util.*;

//1~n 사이의 3dml qotn cnffurgksms vmfhrmfoa
// >>결과화면<<
// 정수입력 : 30
// 3 6 9 ....30
public class Test10 {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		int i, num, cnt = 0;
		
		System.out.print("정수를 입력해주세요 (0이상): ");
		num = scanner.nextInt();
		
		for(i=1;i<=num;i++) {
			if(i % 3 == 0) {
					cnt ++;
					if(cnt % 5 == 0) {
						System.out.printf("%3d\n", i);
					}
					else {
						System.out.printf("%3d, ", i);
					}
			}
		}
	}
}
	