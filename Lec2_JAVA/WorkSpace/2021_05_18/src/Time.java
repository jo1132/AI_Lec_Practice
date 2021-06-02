
public class Time {
	//외부 클래스에서 접근 불가인 private 변수를 정보 은닉이라고 함.
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
	
	public int GetHour() { // 모든 클래스에서 접근 가능한 public 메소드!!
		return hour;
	}
	public int GetMin() { // 모든 클래스에서 접근 가능한 public 메소드!!
		return minute;
	}
	public int GetSec() { // 모든 클래스에서 접근 가능한 public 메소드!!
		return second;
	}
	
	public void SetHour(int hour) { // 모든 클래스에서 접근 가능한 public 메소드!!
		if(hour < 0 ||hour > 23) {
			System.out.println("시간은 0~23사이의 정수만 들어갈 수 있습니다.");
			return;
		}
		this.hour = hour;
	}
	public void SetMin(int minute) { // 모든 클래스에서 접근 가능한 public 메소드!!
		if(minute < 0 ||minute > 60) {
			System.out.println("분은 0~60사이의 정수만 들어갈 수 있습니다.");
			return;
		}
		this.minute = minute;
	}
	public void SetSec(int second) { // 모든 클래스에서 접근 가능한 public 메소드!!
		if(second < 0 ||second > 60) {
			System.out.println("초은 0~60사이의 정수만 들어갈 수 있습니다.");
			return;
		}
		this.second = second;
	}
	
	public String toString() {
		return ("현재 시간은: "+GetHour()+"시 "+GetMin()+"분 "+GetSec()+"초 입니다.");
	}
	
	public int[] getArr() {
		//return arr;
		// 배열을 다루는 변수 arr을 리턴한다는 것은 원본 배열 시작주소를 보내는것!!
		
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
