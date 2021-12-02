import java.awt.*;

public class GameObject {
	int data, i, j;
	boolean isclicked;
	boolean ismine;
	Label minenum;

	Font f1 = new Font("Serif", Font.BOLD, 30);
	GameObject(){
		data = 0;
		isclicked = false;
		ismine = false;

		minenum = new Label();
		minenum.setBackground(Color.gray);
		minenum.setAlignment(Label.CENTER);
		minenum.setForeground(Color.white);
	}
}