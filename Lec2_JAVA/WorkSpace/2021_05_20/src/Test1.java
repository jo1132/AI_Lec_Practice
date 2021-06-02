// 예외처리 (Exception Handling)

public class Test1 {

	public static void main(String[] args) {
		int n;
		
		System.out.println(1);
		System.out.println(2);
		
		try { //예외가 발생할 수 도 있고, 안할수도 있는 문장들이 온다.
			return;					// finally 가 있으면 중간에 return이 있더라돈 finally를 들렸다 가게 된다.
//			System.out.println(3);
	//		System.out.println(4);
		}catch (ArithmeticException ae){
			System.out.println("try에서 에러가 나왔다.");	//이렇게 출력하는건 해킹의 위험이있어 배포판에서는 지워야한다.
			System.out.println(ae.getMessage());	//무슨 오류가 났는지 리턴해준다.
			ae.printStackTrace();					//어느 지점에서 발생했는지 찍어준다.
		}catch(Exception e) {
			System.out.println(5);
		}finally {
			System.out.println("FINAL");
		}
		
		

	}

}
