import java.util.Scanner;

public class GameMain {
	static void buildMap(GameObject[][] GO, int level) {
		int mine = 0, x, y;
		while(mine < level) {
			x = (int)(Math.random()*level)+1;
			y = (int)(Math.random()*level)+1;
			
			if(GO[x][y].Ismine()) {
				continue;
			}
			else {
				GO[x][y].Setmine();
				mine++;
			}
		}
	}
	
	static void ShowMap(GameObject[][] GO, int level) {
		int i, j;
		for(i=0;i<level;i++) {
			for(j=0;j<level;j++) {
				if(GO[i][j].isclicked) {
					if(GO[i][j].Ismine()) System.out.print("X");
					
					else System.out.print(GO[i][j].ClosemineNum);
				}
				else {
					System.out.print("O");
				}
			}
			System.out.println();
		}
	}
	
	static void SetCloseMineNum(GameObject[][] GO, int i, int j, int level[]) {
		int x, y, cnt = 0;
		if(i-1<0) x = 0; else x = i-1;
		if(j-1<0) y = 0;
		else y = j-1;
		
		while(x<GO.length) {
			while(y<GO[i].length) {
				if(GO[i][j].Ismine()) cnt++;
				y++;
			}
			x++;
		}
		
		GO[i][j].ClosemineNum = cnt;
		
	}
	
	static void ShowMapAll(GameObject[][] GO, int level) {
		int i, j;
		for(i=0;i<level;i++) {
			for(j=0;j<level;j++) {
				if(GO[i][j].Ismine()) System.out.print("X");
				
				else System.out.print("O");
			}
			System.out.println();
		}
	}
	
	static void GamePlay(GameObject[][] GO, int level, int[] GameState) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		while(GameState[0] == 1) {
			ShowMap(GO, level);
			x = sc.nextInt();
			y = sc.nextInt();
			
			
			if(GO[x][y].Ismine()) {
				GameState[0] = 0;
			}
			else {
				GameState[2]++;
				if(GameState[1] == GameState[2]) {
					GameState[0] = 2;
				}
			}
			GO[x][y].isclicked = true;
			
			
		}
	}
	
	public static void main(String[] args) {
		int[] level = new int[]{10, 5, 100};
		GameObject[][] GO = new GameObject[100][100];    
		int num  = 0;
		int i, j;
		int[] GameState = {1, level[num]*level[num] - level[num], 0};  //{GameState,max opened num, present opened num}
		//0:Gameover, 1:playing, 2:win  
		
		for(i=0;i<GO.length;i++) {
			for(j=0;j<GO[i].length;j++) {
				GO[i][j] = new GameObject();
			}
		}
		
		buildMap(GO, level[num]);  //buildMap at first
		
		for(i=0;i<level[num];i++) {
			for(j=0;j<level[num];j++) {
				SetCloseMineNum(GO, i, j, level);
			}
		}
		
		GamePlay(GO, level[num], GameState); //GamePlay
		
	}

}
