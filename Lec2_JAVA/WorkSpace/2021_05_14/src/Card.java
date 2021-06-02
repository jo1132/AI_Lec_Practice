
public class Card {
	String kind;
	int number;
	static int width = 100; //2개의 클래스 변수, static변수, 공유변수
	static int height = 100;
	
	int prnNumber(int n) {
		System.out.println("n은 "+n+"입니다.");
		return n;
	}
}
