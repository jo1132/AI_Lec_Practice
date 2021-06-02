
public class GameObject {
	int state;
	int ClosemineNum;
	boolean isclicked;
	private boolean ismine;
	
	GameObject(){
		state = 0;
		ClosemineNum = 0;
		isclicked = false;
		ismine = false;
	}

	void Setmine() {
		this.ismine = true;
	}

	boolean Ismine() {
		return this.ismine;
	}
}
