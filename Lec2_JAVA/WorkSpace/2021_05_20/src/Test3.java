// ����ó�� (Exception Handling)
// throw : ������ ���� �߻�
// throws : ���ѱ��(���� ������)


public class Test3 {

	public static void main(String[] args) {
		System.out.println("�����Դϴ�.");		
		try {
			method1();  //�޼ҵ�1 ȣ��.
		}
		catch(Exception E){
			System.out.println("���ο��� ����ó���ϰٽ��ϴ�.");
		}
	}
	
	static void method1() throws Exception{		//����ó���� ���ѱ��. �̷��� ����Ǿ��ִ� �޼ҵ�� �̸� �����ϴ� �� �ܰ迡�� ����ó�� ���� �־�� �Ѵ�.
		System.out.println("�޼ҵ�1�Դϴ�.");
		method2();
	}
	
	static void method2() throws Exception{  // ���ܸ� ���ѱ��. ����-> �ޙ�1 -> �ޙ�2 ������ ���ÿ� ������, �ޙ�1�� ����ó���� ���ѱ��.
		System.out.println("�޼ҵ�2�Դϴ�.");
		throw new Exception("���ܹ߻�!");
	}
	
}
