
public class Test9 {
	public static void main(String[] args) {
		String Menu[] = {"치킨", "피자", "순대국", "뼈다귀해장국", "집에있는밥", "돈까스", "족발", "보쌈","라면", "햄버거"};
		
		int r = (int)((Math.random()*Menu.length));
		
		System.out.print("전체 메뉴는 ");
		for(int i=0;i<Menu.length;i++) {
			System.out.print(Menu[i]+" ");
		}
		System.out.println();
		System.out.print("오늘의  메뉴는 ");
		System.out.print(Menu[r] + "입니다.");
		
	}
}
