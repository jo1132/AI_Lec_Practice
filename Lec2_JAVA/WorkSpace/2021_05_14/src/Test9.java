
public class Test9 {
	public static void main(String[] args) {
		String Menu[] = {"ġŲ", "����", "���뱹", "���ٱ����屹", "�����ִ¹�", "���", "����", "����","���", "�ܹ���"};
		
		int r = (int)((Math.random()*Menu.length));
		
		System.out.print("��ü �޴��� ");
		for(int i=0;i<Menu.length;i++) {
			System.out.print(Menu[i]+" ");
		}
		System.out.println();
		System.out.print("������  �޴��� ");
		System.out.print(Menu[r] + "�Դϴ�.");
		
	}
}
