// 예외처리 (Exception Handling)

public class Test2 {

	public static void main(String[] args) {
		//Exception Ex = new Exception("예외입니다.");  //예외 객체 생성
		try {
			System.out.println("try문 입니다.");
			throw new Exception("예외입니다.");
		}catch(Exception e) {
			System.out.println("메인에서 발생한 throw에 의한 에러입니다.");
			System.out.println(e.getMessage());	//무슨 오류가 났는지 리턴해준다.
			e.printStackTrace();	
		}
	}

}
