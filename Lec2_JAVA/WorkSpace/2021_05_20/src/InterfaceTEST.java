
public class InterfaceTEST implements Inter3{

	@Override
	public void TestMethod1() {
		System.out.println("Interface1�� �׽�Ʈ�޼ҵ�1�Դϴ�.");
		
	}

	@Override
	public void TestMethod2() {
		System.out.println("Interface1�� �׽�Ʈ�޼ҵ�2�Դϴ�.");
		
	}

	@Override
	public int GetState() {
		System.out.println(A);
		return 0;
	}

	@Override
	public void TestMethod3() {
		System.out.println("Interface2�� �׽�Ʈ�޼ҵ�3�Դϴ�.");
		
	}

}
