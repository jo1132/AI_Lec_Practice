
public class Person {
	long id;
	
	Person(long id){
		this.id = id;
	}
	
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person) {
			return id == ((Person)obj).id;
		}
		return false;
	}
}
