
public class Buyer {
	int money;
	int bonusPoint = 0;
	
	Buyer(int money){
		this.money = money;
	}
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		System.out.println(p+"���� �����մϴ�.");
	}
	
}
