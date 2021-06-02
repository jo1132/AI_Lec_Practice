
public class InterfaceTEST implements Inter3{

	@Override
	public void TestMethod1() {
		System.out.println("Interface1의 테스트메소드1입니다.");
		
	}

	@Override
	public void TestMethod2() {
		System.out.println("Interface1의 테스트메소드2입니다.");
		
	}

	@Override
	public int GetState() {
		System.out.println(A);
		return 0;
	}

	@Override
	public void TestMethod3() {
		System.out.println("Interface2의 테스트메소드3입니다.");
		
	}

}
