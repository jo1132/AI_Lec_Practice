
public class TEST2 {

	public static void main(String[] args) {
		
		Car c1 = null;
		FireEngine fe1 = new FireEngine();
		FireEngine fe2 = null;
		Ambulence ab1 = new Ambulence();
		
		fe1.water();
		c1 = fe1;  //Car(부모)->FireEngine(자식) 은 자동 형변환이 지원된다. UpCasting
		
		c1.Start();
		
		fe2 = (FireEngine)c1;  // Car(조상)->FireEngine(자식), DownCasting 이라 강제 형변환이 필요하다.
		
		fe2.water();
		
		ab1.Siren();
		
		c1 = ab1; //업캐스팅, 자동형변환
		//ab1 = (Ambulence)c1 // 다운캐스팅, 강제 형변환이 필요하다.
		//fe2 = ab1;		//조상-자식관계가 아니라 형제관계는 형변환 자체가 불가능하다.
		
		
		// 참조변수가 참조하는 인스턴스 실제 타입인제 아닌지 체크하는 instanceof 연산자.
		if(fe1 instanceof FireEngine) {
			System.out.println("fe1은 FireEngine 객체 입니다.");
		}
		if(fe1 instanceof Car) {
			System.out.println("fe1은 Car 객체 입니다.");
		}
		if(fe1 instanceof Object) {
			System.out.println("fe1은 Object 객체 입니다.");
		}
	}
	

}
