
public class TEST2 {

	public static void main(String[] args) {
		
		Car c1 = null;
		FireEngine fe1 = new FireEngine();
		FireEngine fe2 = null;
		Ambulence ab1 = new Ambulence();
		
		fe1.water();
		c1 = fe1;  //Car(�θ�)->FireEngine(�ڽ�) �� �ڵ� ����ȯ�� �����ȴ�. UpCasting
		
		c1.Start();
		
		fe2 = (FireEngine)c1;  // Car(����)->FireEngine(�ڽ�), DownCasting �̶� ���� ����ȯ�� �ʿ��ϴ�.
		
		fe2.water();
		
		ab1.Siren();
		
		c1 = ab1; //��ĳ����, �ڵ�����ȯ
		//ab1 = (Ambulence)c1 // �ٿ�ĳ����, ���� ����ȯ�� �ʿ��ϴ�.
		//fe2 = ab1;		//����-�ڽİ��谡 �ƴ϶� ��������� ����ȯ ��ü�� �Ұ����ϴ�.
		
		
		// ���������� �����ϴ� �ν��Ͻ� ���� Ÿ������ �ƴ��� üũ�ϴ� instanceof ������.
		if(fe1 instanceof FireEngine) {
			System.out.println("fe1�� FireEngine ��ü �Դϴ�.");
		}
		if(fe1 instanceof Car) {
			System.out.println("fe1�� Car ��ü �Դϴ�.");
		}
		if(fe1 instanceof Object) {
			System.out.println("fe1�� Object ��ü �Դϴ�.");
		}
	}
	

}
