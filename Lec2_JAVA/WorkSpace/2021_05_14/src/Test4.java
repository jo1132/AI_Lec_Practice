
public class Test4 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("<Before>ain() : x = "+d.x);
		
		
		//�� ���� ��� : ����/ �μ��� �⺻���� ���
		//�ּ� ���� ���: ����/�μ��� �������� ���
		
		change(d.x);
		//change(d);
		
		System.out.println("<After>main() : x = "+d.x);
	}
	
	static void change(int x) {  //Ŭ���� �޼ҵ�, static�޼ҵ�, ���� �޼ҵ�
		x = 1000;
		System.out.println("change() : x = "+x);
	}
}
