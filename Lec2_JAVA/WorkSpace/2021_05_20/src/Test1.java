// ����ó�� (Exception Handling)

public class Test1 {

	public static void main(String[] args) {
		int n;
		
		System.out.println(1);
		System.out.println(2);
		
		try { //���ܰ� �߻��� �� �� �ְ�, ���Ҽ��� �ִ� ������� �´�.
			return;					// finally �� ������ �߰��� return�� �ִ��� finally�� ��ȴ� ���� �ȴ�.
//			System.out.println(3);
	//		System.out.println(4);
		}catch (ArithmeticException ae){
			System.out.println("try���� ������ ���Դ�.");	//�̷��� ����ϴ°� ��ŷ�� �������־� �����ǿ����� �������Ѵ�.
			System.out.println(ae.getMessage());	//���� ������ ������ �������ش�.
			ae.printStackTrace();					//��� �������� �߻��ߴ��� ����ش�.
		}catch(Exception e) {
			System.out.println(5);
		}finally {
			System.out.println("FINAL");
		}
		
		

	}

}
