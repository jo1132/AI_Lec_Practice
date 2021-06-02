// 추상클래스 : abstract 메소드가 1개이상 있는 클래스
// 인터페이스 : 멤버 변수가 상수이고, 멤버 메소드가 추상메소드임;
public interface Inter {
	int A = 100;
	public static final int B = 20;
	final int C = 3;
	
	void TestMethod1();
	abstract void TestMethod2();
	
	int GetState();
}
