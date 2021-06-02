// 한줄 주석
/*
 	여러줄
 	주석
 		*/
public class Test1 { // 클래스 Test1 정의, 보통 클래스명 시작은 대문자

	public static void main(String[] args) { // main 메소드 정의, main은 특별하게 단 하나만 존재해야 한다.
		
		// 자바 기본형 (8개)
		// boolean(1byte) - true/false 만 저장 가능
		// char(2byte) - 문자 1개만 저장 가능 ('' 따옴표 사용) 
		// byte(1byte) - 정수
		//short(1byte) - 정수
		// int(4byte) - 정수 (디폴트 타입)
		// long(8byte) - 정수
		// float(4byte) - 실수
		//double(8byte) - 실수 (디폴트 타입)
		
		// 참조형(클래스명으로 되어있음), 주소만 저장 가능하다.
		
		/*
		char ch = 'a';
		boolean flag = true;
		
		int n; //지역변수, 메소드 내, 블럭 내에 선언한 변수 이다. (값을 초기화하지 않으면 쓰레기값이 들어간다.)
		n = 10; //초기화, 값을 처음 넣음
		
		if (flag){
			System.out.println(""+ ch + n + flag);
		}
		*/
		
		int n = 10;
		double n2 = 12.7;
		char ch = 'a';
		
		//char-int는 ASCII코드에 의해 서로 사용 가능!
		// A:65, a:97 '0':48 이다.
		
		//작------------------>큰
		//byte(1)-short(2)-int(4)-long(8)-float(4)-double(8)
		//강제형변환: 큰->작으로 값 대입시 필수!
		//자동형변환: 작->큰 으로 값 대입시 형변환 안해도 됨!
		ch = 65; // 아스키코드에서 65는 'A'이다.
		System.out.println("ch = "+ch);
		
		n2 = n; // int(4byte) -> double(8byte), 작 -> 큰, 자동으로 형변환이 일어난다.
		n = (int)n2; // double(8byte) -> int(4byte), 큰 -> 작, 강제형 변환이 필요하다.
		
		n2 = ch;
		ch = (char)n2;
		System.out.println(n);
		System.out.println(ch);
	}

}
