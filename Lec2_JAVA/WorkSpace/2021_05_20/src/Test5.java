// java.lang ��Ű�� ������ �Ʒ� Ŭ���� ���� ����~
// String, System, Object, Math......
//
// ObjectŬ������ toString()�޼ҵ� : Ŭ������ @16�����ؽ��ڵ�
// ObjectŬ������ equals()�޼ҵ� : ��ü �ڽŰ� �־��� obj(��ü)�� �ּҸ� ���ؼ� ������ true�� ����
public class Test5 {

	public static void main(String[] args) {
		
		String str = "hello";
		String str2 = new String("Hello~~~~!!");
		
		System.out.println(str.toString());
		System.out.println(str2);
		System.out.println(String.valueOf(1.2));   // ����-> ���ڿ��� ��ȯ!
		//--------------------------------------------------------------------
		
		Person soo = new Person(123426435432532L);
		Person hyeon = new Person(3449855098539L);
		Person Co = new Person(123);
		Co = soo;
		
		System.out.println(soo.equals(hyeon)+", " + (hyeon.id)); 
		System.out.println(soo.equals(soo)+", " + (soo.id));
		System.out.println(soo.equals(Co)+", " + (Co.id));
	//----------------------------------------------------------------------
		
		int num = Integer.parseInt("123");  // ����Ŭ���� : �⺻�� (8��)�� Ŭ������ ����� ���� ��.
		str = String.valueOf(num);
		
		System.out.println("num == "+num+", num + 1 = " +(num+1));
		System.out.println("str == "+str+", num + 1 = " +str + 1);
	}
}
