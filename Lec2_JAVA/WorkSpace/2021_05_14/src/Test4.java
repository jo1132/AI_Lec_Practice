
public class Test4 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("<Before>ain() : x = "+d.x);
		
		
		//값 전달 방식 : 인자/ 인수가 기본형일 경우
		//주소 전달 방식: 인자/인수가 참조형일 경우
		
		change(d.x);
		//change(d);
		
		System.out.println("<After>main() : x = "+d.x);
	}
	
	static void change(int x) {  //클래스 메소드, static메소드, 공유 메소드
		x = 1000;
		System.out.println("change() : x = "+x);
	}
}
