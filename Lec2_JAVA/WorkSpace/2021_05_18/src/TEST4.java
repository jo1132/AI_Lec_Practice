
public class TEST4 {

	public static void main(String[] args) {
		Buyer buyer = new Buyer(1000);
		Computer com = new Computer();
		Audio aud = new Audio();
		Bag bag = new Bag();
		
		buyer.buy(com);
		System.out.println("���� ���� �ܾ��� "+buyer.money+"���� �Դϴ�.");
		System.out.println("���� ����Ʈ�� "+buyer.bonusPoint+"�� �Դϴ�.");
		buyer.buy(aud);
		System.out.println("���� ���� �ܾ��� "+buyer.money+"���� �Դϴ�.");
		System.out.println("���� ����Ʈ�� "+buyer.bonusPoint+"�� �Դϴ�.");
		buyer.buy(bag);
		System.out.println("���� ���� �ܾ��� "+buyer.money+"���� �Դϴ�.");
		System.out.println("���� ����Ʈ�� "+buyer.bonusPoint+"�� �Դϴ�.");
		
		//System.out.println(buyer.equals(aud));
	}
	
}
