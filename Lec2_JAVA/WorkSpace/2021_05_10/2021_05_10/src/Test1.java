// ���� �ּ�
/*
 	������
 	�ּ�
 		*/
public class Test1 { // Ŭ���� Test1 ����, ���� Ŭ������ ������ �빮��

	public static void main(String[] args) { // main �޼ҵ� ����, main�� Ư���ϰ� �� �ϳ��� �����ؾ� �Ѵ�.
		
		// �ڹ� �⺻�� (8��)
		// boolean(1byte) - true/false �� ���� ����
		// char(2byte) - ���� 1���� ���� ���� ('' ����ǥ ���) 
		// byte(1byte) - ����
		//short(1byte) - ����
		// int(4byte) - ���� (����Ʈ Ÿ��)
		// long(8byte) - ����
		// float(4byte) - �Ǽ�
		//double(8byte) - �Ǽ� (����Ʈ Ÿ��)
		
		// ������(Ŭ���������� �Ǿ�����), �ּҸ� ���� �����ϴ�.
		
		/*
		char ch = 'a';
		boolean flag = true;
		
		int n; //��������, �޼ҵ� ��, �� ���� ������ ���� �̴�. (���� �ʱ�ȭ���� ������ �����Ⱚ�� ����.)
		n = 10; //�ʱ�ȭ, ���� ó�� ����
		
		if (flag){
			System.out.println(""+ ch + n + flag);
		}
		*/
		
		int n = 10;
		double n2 = 12.7;
		char ch = 'a';
		
		//char-int�� ASCII�ڵ忡 ���� ���� ��� ����!
		// A:65, a:97 '0':48 �̴�.
		
		//��------------------>ū
		//byte(1)-short(2)-int(4)-long(8)-float(4)-double(8)
		//��������ȯ: ū->������ �� ���Խ� �ʼ�!
		//�ڵ�����ȯ: ��->ū ���� �� ���Խ� ����ȯ ���ص� ��!
		ch = 65; // �ƽ�Ű�ڵ忡�� 65�� 'A'�̴�.
		System.out.println("ch = "+ch);
		
		n2 = n; // int(4byte) -> double(8byte), �� -> ū, �ڵ����� ����ȯ�� �Ͼ��.
		n = (int)n2; // double(8byte) -> int(4byte), ū -> ��, ������ ��ȯ�� �ʿ��ϴ�.
		
		n2 = ch;
		ch = (char)n2;
		System.out.println(n);
		System.out.println(ch);
	}

}
