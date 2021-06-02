// 예외처리 (Exception Handling)
// throw : 강제로 예외 발생
// throws : 떠넘기기(예외 던지기)


public class Test3 {

	public static void main(String[] args) {
		System.out.println("메인입니다.");		
		try {
			method1();  //메소드1 호출.
		}
		catch(Exception E){
			System.out.println("메인에서 예외처리하겟습니다.");
		}
	}
	
	static void method1() throws Exception{		//예외처리를 떠넘긴다. 이렇게 선언되어있는 메소드는 이를 선언하는 전 단계에서 예외처리 문이 있어야 한다.
		System.out.println("메소드1입니다.");
		method2();
	}
	
	static void method2() throws Exception{  // 예외를 떠넘긴다. 메인-> 메솓1 -> 메솓2 순서로 스택에 있으니, 메솓1로 예외처리를 떠넘긴다.
		System.out.println("메소드2입니다.");
		throw new Exception("예외발생!");
	}
	
}
