// ����ó�� (Exception Handling)

public class Test2 {

	public static void main(String[] args) {
		//Exception Ex = new Exception("�����Դϴ�.");  //���� ��ü ����
		try {
			System.out.println("try�� �Դϴ�.");
			throw new Exception("�����Դϴ�.");
		}catch(Exception e) {
			System.out.println("���ο��� �߻��� throw�� ���� �����Դϴ�.");
			System.out.println(e.getMessage());	//���� ������ ������ �������ش�.
			e.printStackTrace();	
		}
	}

}
