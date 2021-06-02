//생성자는 멤버 초기화를 담당
//생성자는 클래스명과 같고, 반드시 1개 이상의 생성자가 있어야 한다.
//생성자는 메소드 아님, 리턴타입이 없음

public class Test2 {

	int n;
	static int[] arr = new int[10]; //클래스 변수(1차원 배열을 다루는 변수)
	static {	//클래스 초기화 블럭(프로그램 시작시 1회 호출된다.)
		for(int i=0;i<arr.length;i++) arr[i] = (int)(Math.random()*10)+1;
	}

	public static void main(String[] args) {
		int i;
		for(i=0;i<Test2.arr.length;i++) {
			System.out.println("arr["+i+"] = " + arr[i]);
		}
	}
}
