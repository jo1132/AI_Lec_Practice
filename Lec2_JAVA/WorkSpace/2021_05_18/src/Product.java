
public class Product {
	int price; //제품가격
	int bonusPoint; // 구매시 제공 보너스 점수
	
	Product(int price){
		this.price = price;
		bonusPoint = price/10;
	}
}
