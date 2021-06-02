
public class Buyer {
	int money;
	int bonusPoint = 0;
	
	Buyer(int money){
		this.money = money;
	}
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		System.out.println(p+"구매 감사합니다.");
	}
	
}
