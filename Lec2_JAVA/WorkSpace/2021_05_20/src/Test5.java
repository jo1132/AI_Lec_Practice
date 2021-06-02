// java.lang 패키지 내에는 아래 클래스 들이 있음~
// String, System, Object, Math......
//
// Object클래스의 toString()메소드 : 클래스명 @16진수해시코드
// Object클래스의 equals()메소드 : 객체 자신과 주어진 obj(객체)의 주소를 비교해서 같으면 true를 리턴
public class Test5 {

	public static void main(String[] args) {
		
		String str = "hello";
		String str2 = new String("Hello~~~~!!");
		
		System.out.println(str.toString());
		System.out.println(str2);
		System.out.println(String.valueOf(1.2));   // 숫자-> 문자열로 반환!
		//--------------------------------------------------------------------
		
		Person soo = new Person(123426435432532L);
		Person hyeon = new Person(3449855098539L);
		Person Co = new Person(123);
		Co = soo;
		
		System.out.println(soo.equals(hyeon)+", " + (hyeon.id)); 
		System.out.println(soo.equals(soo)+", " + (soo.id));
		System.out.println(soo.equals(Co)+", " + (Co.id));
	//----------------------------------------------------------------------
		
		int num = Integer.parseInt("123");  // 랩퍼클래스 : 기본형 (8개)을 클래스로 만들어 놓은 것.
		str = String.valueOf(num);
		
		System.out.println("num == "+num+", num + 1 = " +(num+1));
		System.out.println("str == "+str+", num + 1 = " +str + 1);
	}
}
