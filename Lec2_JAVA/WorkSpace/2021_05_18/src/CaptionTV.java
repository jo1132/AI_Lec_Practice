
public class CaptionTV extends TV{
	String text;
	
	CaptionTV(){
		this.text = "자막입니다.";
	}
	
	void caption() {
		System.out.println(text);
	}
}
