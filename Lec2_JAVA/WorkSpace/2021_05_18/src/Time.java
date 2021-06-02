
public class Time {
	//�ܺ� Ŭ�������� ���� �Ұ��� private ������ ���� �����̶�� ��.
	private int hour, minute, second;
	private int[] arr = {1, 2, 3, 4, 5};
	
	Time(){
		this(10, 10, 10);
	}
	Time(int hour, int minute, int second){
		SetHour(hour);
		SetMin(minute);
		SetSec(second);
	}
	
	public int GetHour() { // ��� Ŭ�������� ���� ������ public �޼ҵ�!!
		return hour;
	}
	public int GetMin() { // ��� Ŭ�������� ���� ������ public �޼ҵ�!!
		return minute;
	}
	public int GetSec() { // ��� Ŭ�������� ���� ������ public �޼ҵ�!!
		return second;
	}
	
	public void SetHour(int hour) { // ��� Ŭ�������� ���� ������ public �޼ҵ�!!
		if(hour < 0 ||hour > 23) {
			System.out.println("�ð��� 0~23������ ������ �� �� �ֽ��ϴ�.");
			return;
		}
		this.hour = hour;
	}
	public void SetMin(int minute) { // ��� Ŭ�������� ���� ������ public �޼ҵ�!!
		if(minute < 0 ||minute > 60) {
			System.out.println("���� 0~60������ ������ �� �� �ֽ��ϴ�.");
			return;
		}
		this.minute = minute;
	}
	public void SetSec(int second) { // ��� Ŭ�������� ���� ������ public �޼ҵ�!!
		if(second < 0 ||second > 60) {
			System.out.println("���� 0~60������ ������ �� �� �ֽ��ϴ�.");
			return;
		}
		this.second = second;
	}
	
	public String toString() {
		return ("���� �ð���: "+GetHour()+"�� "+GetMin()+"�� "+GetSec()+"�� �Դϴ�.");
	}
	
	public int[] getArr() {
		//return arr;
		// �迭�� �ٷ�� ���� arr�� �����Ѵٴ� ���� ���� �迭 �����ּҸ� �����°�!!
		
		int arr2[] = new int[5];
		
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		return arr2;
	}
	public void ShowArr() {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
}
