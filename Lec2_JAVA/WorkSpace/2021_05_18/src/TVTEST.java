
public class TVTEST {

	public static void main(String[] args) {
		TV t1 = new TV();
		CaptionTV ct1 = new CaptionTV();
		TV t2 = new CaptionTV();	//������: ����Ÿ���� ���������� �ڼ�Ÿ���� ��ü�� �ٷ� �� �ִ� ��;
		//CaptionTV = new TV();   �������� �ݴ��� ��� ������ ����.
		
		System.out.println("t1.channel: "+t1.charnnel);
		ct1.text = "Hello JAVA!";
		ct1.caption();
		
		//t2.text  �� �и��� ������ ����������, TV������ �����Ͽ��� ������ ������� ���Ѵ�.
		//TV�� ����� TV���� �������� ���� �����̶� ����� ����� ������� ���ϴ� �Ͱ� ����.
		
		//t1 = ct1;  // ct1�� Ÿ���� CaptionTV(�ڽ�) -> t1�� Ÿ���� TV(�θ�)
					// Upcasting(��ĳ����)�� ����ȯ ���� ����!
		
		//ct1 = (CaptionTV)t1;	//t1�� Ÿ���� TV(����) -> ct1�� Ÿ���� CaptionTV(�ڼ�)
								//DownCasting(�ٿ�ĳ����)�� ����ȯ �ʼ�!!
								//������ (Ŭ������)�� ����ȯ�� �ݵ�� ���ϰ��� (��Ӱ���)
	}

}
