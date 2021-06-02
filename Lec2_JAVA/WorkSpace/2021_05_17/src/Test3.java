//자바의 최고조상 클래스: Object라는 클래스 이다.
//클래스 정의시 extends를 하지 않으면 자동으로 Object클래스를 상속한다!
import java.lang.*;
public class Test3 extends Object{
	public static void main(String[] args) {
		Bus b1 = new Bus(10);
		Car c1 = new Car();
		
		System.out.println("b1의 값은: "+b1.toString()+"입니다.");
		System.out.println("c1의 값은: "+c1+"입니다.");  //c1의 주소값이 나온다. java에서 자동으로 c1.toString()해서 출력해준다.
		
		c1.Start();
		b1.Start();
		
	}
}
