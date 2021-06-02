class Parents{
	int x = 10;
}
class Child extends Parents{
	int x = 20;
	
	void method() {
		System.out.println("x = "+x);
		System.out.println("this.x = "+this.x);
		System.out.println("super.x = "+super.x);
	}
}
public class SuperTest extends Object{
	public static void main(String[] args) {
		Parents p1 = new Parents();
		Child c1 = new Child();
		
		c1.method();
		
	}
}
