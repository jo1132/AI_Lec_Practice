
public class TVTEST {

	public static void main(String[] args) {
		TV t1 = new TV();
		CaptionTV ct1 = new CaptionTV();
		TV t2 = new CaptionTV();	//다형성: 조상타입의 참조변수로 자손타입의 객체를 다룰 수 있는 것;
		//CaptionTV = new TV();   다형성의 반대의 경우 에러가 난다.
		
		System.out.println("t1.channel: "+t1.charnnel);
		ct1.text = "Hello JAVA!";
		ct1.caption();
		
		//t2.text  는 분명히 공간에 존재하지만, TV형으로 선언하였기 때문에 사용하지 못한다.
		//TV는 고오급 TV지만 리모콘이 옛날 버전이라 기능을 제대로 사용하지 못하는 것과 같다.
		
		//t1 = ct1;  // ct1은 타입이 CaptionTV(자식) -> t1은 타입이 TV(부모)
					// Upcasting(업캐스팅)은 형변환 생략 가능!
		
		//ct1 = (CaptionTV)t1;	//t1의 타입은 TV(조상) -> ct1은 타입이 CaptionTV(자손)
								//DownCasting(다운캐스팅)은 형변환 필수!!
								//참조형 (클래스명)의 형변환은 반드시 상하관계 (상속관계)
	}

}
