
public class Test6 {

	public static void main(String[] args) {
		String str = " hello java!! ";
		String str2 = "programming";
		char ch = ',';
		String str3 = str.concat(str2) + ch + ch + ch;
													//substring(0, 5)�� index 0���� 5 �̸����� ����!!
		System.out.println(str.substring(0, 5));
													//toUpperCase()�� str�� �빮�ڷ� ��ȯ���� ��������!!
		System.out.println(str.toUpperCase());
													//length()�� str�� ���̸� �������ش�.!!
		System.out.println(str + " ��" + str.length()+"���� ���ڰ� �ִ�.");
													//trim()�� ���ڿ��� �� ���� �������ִٸ� �������ش�.
		System.out.println(str.trim());
													//charAt()�� ���ڿ��� �Է��� �ε����� �ִ� ���ڸ� ��ȯ���ش�!!
		System.out.println(str.charAt(7));
													//concat()�� ���ڿ� �ڿ� �Է��� �κ��� �̾ ������ ���ش�.
		System.out.println(str.concat(str2));
		System.out.println(str.concat(""+ch+ch+ch));
		System.out.println(str3);
	}
}
