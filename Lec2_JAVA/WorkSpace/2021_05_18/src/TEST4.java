
public class TEST4 {

	public static void main(String[] args) {
		Buyer buyer = new Buyer(1000);
		Computer com = new Computer();
		Audio aud = new Audio();
		Bag bag = new Bag();
		
		buyer.buy(com);
		System.out.println("현재 남은 잔액은 "+buyer.money+"만원 입니다.");
		System.out.println("현재 포인트는 "+buyer.bonusPoint+"점 입니다.");
		buyer.buy(aud);
		System.out.println("현재 남은 잔액은 "+buyer.money+"만원 입니다.");
		System.out.println("현재 포인트는 "+buyer.bonusPoint+"점 입니다.");
		buyer.buy(bag);
		System.out.println("현재 남은 잔액은 "+buyer.money+"만원 입니다.");
		System.out.println("현재 포인트는 "+buyer.bonusPoint+"점 입니다.");
		
		//System.out.println(buyer.equals(aud));
	}
	
}
