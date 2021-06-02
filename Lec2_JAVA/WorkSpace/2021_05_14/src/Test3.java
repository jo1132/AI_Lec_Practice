
public class Test3 {
	public static void main(String[] args) {
		Card c1 = new Card(); //인스턴스 객체 생성
		Card c2 = new Card();
		int n = 10;
		Card.width = 50;
		Card.height = 80;
		c1.kind = "heart";
		c1.number = 7;
		System.out.println("c1.kind = "+c1.kind+", c1.number = "+c1.number);
		System.out.println("c1.width = "+c1.width+", c1.height = "+c1.height);
		
		c2.kind = "spade";
		c2.number = 4;
		System.out.println("c2.kind = "+c2.kind+", c2.number = "+c2.number);
		System.out.println("c2width = "+c2.width+", c2.height = "+c2.height);
		
		c1.prnNumber(n);
	}
}
