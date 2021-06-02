
public class Test6 {

	public static void main(String[] args) {
		String str = " hello java!! ";
		String str2 = "programming";
		char ch = ',';
		String str3 = str.concat(str2) + ch + ch + ch;
													//substring(0, 5)는 index 0부터 5 미만까지 추출!!
		System.out.println(str.substring(0, 5));
													//toUpperCase()는 str을 대문자로 변환시켜 리턴해줌!!
		System.out.println(str.toUpperCase());
													//length()는 str의 길이를 리턴해준다.!!
		System.out.println(str + " 은" + str.length()+"개의 글자가 있다.");
													//trim()은 문자열의 양 옆에 공백이있다면 삭제해준다.
		System.out.println(str.trim());
													//charAt()은 문자열의 입력한 인덱스에 있는 문자를 반환해준다!!
		System.out.println(str.charAt(7));
													//concat()은 문자열 뒤에 입력한 부분이 이어서 나오게 해준다.
		System.out.println(str.concat(str2));
		System.out.println(str.concat(""+ch+ch+ch));
		System.out.println(str3);
	}
}
