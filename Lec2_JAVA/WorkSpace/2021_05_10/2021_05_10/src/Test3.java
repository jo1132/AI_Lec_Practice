// 연산자
//1. 단항 연산자 : 피연산자가 1개, +5, -5, ++i, --i, i++, i--
//2. 이항연산자 : 피연산자가 2개, 1+2, a>b
//3. 삼항 연산자 : 조건? 참일때 : 거짓일때 

//산술 연상자: +, -, *, /(몪), %(나머지)
//비교연산자 : <, >, <=, >=, ==, !=
//논리연산자: &&(AND), ||(OR), !(NOT)
//대입연상자: = (우선순위 제일 낮음, 오른쪽-> 왼쪽 방향이된다.)
//복합대입연산자: +=, -=, *= (a+=3은 a= a+3과 같다.)
//증감연산자: ++, -- (++a 선증가, --a 선감소, b++ 후 증가)


public class Test3 {
	public static void main(String[] args) {
		boolean b = false;
		int n = 26;
		
		System.out.println("n = " + n);
		System.out.println("n = " + ++n);
		System.out.println("n = " + n++);
		System.out.println("n = " + n);
		
		n += 10;
		System.out.println("n의 값은" + n + "입니다.");
		if (!b) {
			System.out.println(n>=15 && n <= 25 ? "입장료 2000원" : "입장료 1000원");
		}
	}
}
