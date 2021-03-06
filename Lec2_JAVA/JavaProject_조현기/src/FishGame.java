import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class FishGame implements Runnable, KeyListener {
	JFrame f;				//프레임을 생성
	DrawFishComponent c;	//뿌릴 컴포넌트 
	Thread thr = null;		//쓰레드를 돌린다
	ArrayList<Enemy> enemyList = new ArrayList<Enemy>();	//적군 어레이 리스트 생성
	ArrayList<Item> itemList = new ArrayList<Item>();		//아이템 어레이 리스트 생성
	
	final int [] nPlayerWidthArray = { 45, 70, 140, 240, 350 };	//플레이어의 그림 넓이
	final int [] nPlayerHeightArray = { 33, 52, 105, 186, 270 };//플레이어의 그림 높이
	int nPlayerLevel = 0;		//플레이어 레벨
	int nPlayerPosX = 100;		//위치
	int nPlayerPosY = 100;	
	int nPlayerSpeed = 2;
	int nStageLevel = 1;		//스테이지의 레벨
	int nScore = 0;				//스코어
	
	MyRect rcPlayer = new MyRect();	//플레이어의 렉트
	
	int nEnemyMax = 15;		//적군의 총 갯수
	int nColorSeed = 0;		//welcome to my world를 랜덤색으로 뿌리기 위해 시드생성
	long nEnemyAddTime = 0;	//적군을 더하는 타임
	long nColorChangeTime = 0;//컬러가 바뀌는 시간
	
	boolean isKeyRight = false;
	boolean isKeyUp = false;
	boolean isKeyLeft = false;
	boolean isKeyDown = false;
	
	boolean isCheat = false;
	boolean bPause = false;
	public void run()
	{
		while( thr != null )	//쓰레드를 돌린다.
		{
			try{
				Thread.sleep(10);
			} catch( InterruptedException e ){
				
			}
			if ( bPause )	//만약 멈춤 상태라면 건너뛴다.
				continue;
			movePlayer();	//플레이어를 움직인다.
			for ( int i = 0; i < nEnemyMax; i++ )	//적군을 움직이고 플레이어와 충돌체크를 한다.
			{
				Enemy enemy = enemyList.get(i);
				enemy.Move();
				enemy.InterSectRect( rcPlayer );
			}
			for ( int i = 0; i < 10; i++ )	//아이템을 움직이고 플레이어와 충돌체크를 한다.
			{
				Item item = itemList.get(i);
				item.Move();
				item.InterSectRect( rcPlayer );
			}
			AddEnemy();		//적을 더한다.
			StageUpdate();	//스테이지를 업데이트한다.
			c.repaint();	//다시 그린다.
		}
	}
	public void StageUpdate()		//스코어에 따라서 플레이어 레벨과 스테이지가 변한다.
	{
		//if ( nScore < 2000 )
		if ( nScore < 500 )	
		{
			nStageLevel = 1;
		}
		//else if ( nScore < 8000 )
		else if ( nScore < 6000 )
		{
			nStageLevel = 2;
			nPlayerLevel = 1;
		}
		//else if ( nScore < 20000 )
		else if ( nScore < 17000 )
		{
			nStageLevel = 3;
			nPlayerLevel = 2;
		}
		//else if ( nScore < 45000 )
		else if ( nScore < 30000 )
		{
			nStageLevel = 4;
			nPlayerLevel = 3;
		}
		//else if ( nScore < 100000 )
		else if ( nScore < 50000 )
		{
			nStageLevel = 5;
			nPlayerLevel = 4;
		}
	}
	public void AddEnemy()	//적군을 더 생성한다.
	{
		if ( nStageLevel > 3 )	
			return;
		if ( System.currentTimeMillis() - nEnemyAddTime > 3000 + nStageLevel * 200 )	//일정 시간에 맞게 생성
		{
			Enemy enemy = new Enemy();	//적군을 더한다.
			enemyList.add(enemy);
			nEnemyMax ++;
			nEnemyAddTime = System.currentTimeMillis();
		}
	}
	public void movePlayer()	//눌린 키에 맞게 플레이어를 움직인다.
	{
		if ( isKeyLeft == true )	
		{
			nPlayerPosX -= nPlayerSpeed;
			c.nLeftRight = 0;
		}
		if ( isKeyRight == true )
		{
			nPlayerPosX += nPlayerSpeed;
			c.nLeftRight = 1;
		}
		if ( isKeyUp == true )
		{
			nPlayerPosY -= nPlayerSpeed;
		}
		if ( isKeyDown == true )
		{
			nPlayerPosY += nPlayerSpeed;
		}
		//플레이어 사각형을 업데이트
		rcPlayer.nLeft = nPlayerPosX;			
		rcPlayer.nTop = nPlayerPosY + nPlayerLevel * 3;
		rcPlayer.nRight = nPlayerPosX + nPlayerWidthArray[nPlayerLevel];
		rcPlayer.nBottom = nPlayerPosY + nPlayerHeightArray[nPlayerLevel];
	}
	public void keyPressed( KeyEvent e )	//키가 눌린것을 체크한다.
	{
		char key = e.getKeyChar();
		//눌려져 있는 중이라면 boolean을 참으로 만든다.
		//여기에서 플레이어를 이동하지 않는이유는 끊겨서 이동하기 때문
		
		switch(e.getKeyCode())
		{
			case KeyEvent.VK_LEFT:
				isKeyLeft = true;	
			break;
			case KeyEvent.VK_UP:
				isKeyUp = true;
			break;
			case KeyEvent.VK_RIGHT:
				isKeyRight = true;
			break;
			case KeyEvent.VK_DOWN:
				isKeyDown = true;
			break;
		}
		
		c.repaint();
	}
	public void keyReleased(KeyEvent e){
		switch(e.getKeyCode())//키가 떼어진다면 boolean을 거짓으로 만든다.
		{
			case KeyEvent.VK_LEFT:	
				isKeyLeft = false;
			break;
			case KeyEvent.VK_UP:
				isKeyUp = false;
			break;
			case KeyEvent.VK_RIGHT:
				isKeyRight = false;
			break;
			case KeyEvent.VK_DOWN:
				isKeyDown = false;
			break;
		}
		
		
	}
	public void keyTyped(KeyEvent e){}
	
	public FishGame() {
		// TODO Auto-generated method stub
		//m_Enemy = new Enemy[nEnemyMax];
		
		//적군을 생성
		for ( int i = 0; i < nEnemyMax; i++ )
		{
			Enemy enemy = new Enemy();
			enemyList.add(enemy);
			//m_Enemy[i].SetEnemy();	
		}
		for ( int i = 0; i < 10; i++ )
		{
			Item item = new Item();
			itemList.add(item);
		}
		
		initConponents();	//컴포넌트 생성	
		thr = new Thread(this);//쓰레드 생성
		thr.start();		//쓰레드 스타트
		
		//플레이어 사각형을 업데이트
		rcPlayer.nLeft = nPlayerPosX;
		rcPlayer.nTop = nPlayerPosY + nPlayerLevel * 3;
		rcPlayer.nRight = nPlayerPosX + nPlayerWidthArray[nPlayerLevel];
		rcPlayer.nBottom = nPlayerPosY + nPlayerHeightArray[nPlayerLevel];
	}
	
	public void initConponents()
	{
		FishGame fg = this;	
		fg.f = new JFrame();	//프레임을 생성
		f.setTitle("FISH GAME!");	//타이틀
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	//닫기 옵션
		f.setSize(1366, 768);	//크기 지정
		f.setLocation(0, 0);	//위치
		
		fg.c = new DrawFishComponent();	//그림용 컴포넌트 클래스
		f.add(fg.c);		//더한다.
		
		f.requestFocus();
		f.addKeyListener(this);	//키 리스너
		f.setVisible(true);
	}
	
	class DrawFishComponent extends JComponent{	//뿌리기용 클래스
		public Image[] imgPlayerLeft;
		public Image[] imgPlayerRight;
		public Image[] imgEnemyLeft;
		public Image[] imgEnemyRight;
		public Image imgBgr;
		public Image imgMe;
		public Image[] imgItem;
		public int nLeftRight = 1;
		public String str;
		public String strWelcome = "Welcome To Fish World!";
		
		public void paintComponent(Graphics g){
			
			g.drawImage(imgBgr, 0, 0, this);		//배경 그림
			g.drawImage(imgMe, 10, 0, this);		//내 사진
			for ( int i = 0; i < nEnemyMax; i++ )	//적군을 그린다. 화면 밖에서 대기중인 적은 그리지 않는다.
			{
				Enemy enemy = enemyList.get(i);
				if ( !enemy.canMove() )
					continue;
				
				if ( enemy.nType == 0 )		//왼쪽이면
					g.drawImage(imgEnemyLeft[enemy.nLevel],enemy.nX, enemy.nY, this);
				if ( enemy.nType == 1 )		//오른쪽이면
					g.drawImage(imgEnemyRight[enemy.nLevel],enemy.nX, enemy.nY, this);
			}
			
			for ( int i = 0; i < 10; i++ )	//아이템을 그린다. 화면 밖에서 대기중인 아이템은 그리지 않는다.
			{
				Item item = itemList.get(i);
				if ( !item.canMove() )
					continue;
				
				g.drawImage(imgItem[item.nItemType],item.nX, item.nY, this);		
			}
			
			if ( nLeftRight == 1 )		//플레이어가 왼쪽이냐 오른쪽이냐 체크
				g.drawImage(imgPlayerRight[nPlayerLevel], nPlayerPosX, nPlayerPosY, this);
			else
				g.drawImage(imgPlayerLeft[nPlayerLevel], nPlayerPosX, nPlayerPosY, this);
			
			g.setFont(new Font("Dialog", Font.BOLD, 20));		//폰트크기 ㅐ지정
			
			str = "Score : " + nScore;		//스코어 셋팅
			
			if ( System.currentTimeMillis() - nColorChangeTime > 300 )	//웰컴투 피쉬월드 출력하기 위한 랜덤 시간 텀
			{
				nColorSeed += 1;		//컬러 시드를 올린다.
				nColorChangeTime = System.currentTimeMillis();
			}
			for ( int i = 0; i < strWelcome.length(); i++ )
			{
				int rVal = 0, gVal = 0, bVal = 0;
				
				rVal = (i * 10 + nColorSeed * 100) % 256;		//색 랜덤 지정
				gVal = (i * 30 + nColorSeed * 100) % 256;
				bVal = (i * 20 + nColorSeed * 100) % 256;
				
				g.setColor(new Color(rVal,gVal,bVal));
				g.drawString(strWelcome.substring(i, i+1), 500 + i * 18, 30);		//Welcome to FishWorld를 뿌린다.
			}
			
			g.setColor(Color.black);		//다시 검정으로 바꾸고
			g.drawString(str, 1100, 30);	//스코어를 뿌린다.
		}
		public void InitImage(){		//이미지들을 읽어온다.
			imgBgr = Toolkit.getDefaultToolkit().getImage("Back.jpg");
			imgMe = Toolkit.getDefaultToolkit().getImage("me.jpg");
			imgPlayerLeft 	= new Image[5];
			imgPlayerRight 	= new Image[5];
			imgEnemyLeft 	= new Image[5];
			imgEnemyRight 	= new Image[5];
			imgItem 		= new Image[3];
			for ( int i = 0; i < 5; i++ )
			{
				imgPlayerLeft[i] 	= Toolkit.getDefaultToolkit().getImage("p" + (i+1) + "_l.png");
				imgPlayerRight[i] 	= Toolkit.getDefaultToolkit().getImage("p" + (i+1) + "_r.png");
				imgEnemyLeft[i] 	= Toolkit.getDefaultToolkit().getImage("e" + (i+1) + "_l.png");
				imgEnemyRight[i] 	= Toolkit.getDefaultToolkit().getImage("e" + (i+1) + "_r.png");
			}
			for ( int i = 0; i < 3; i++ )
			{
				imgItem[i] = Toolkit.getDefaultToolkit().getImage("item" + i + ".png");
			}
			
		}
		public DrawFishComponent()
		{
			InitImage();			//이미지를 읽고
			addMouseListener( new MouseEventHd1() );	//마우스 클릭을 위해서 이벤트 등록
		}
		class MouseEventHd1 extends MouseAdapter {
			public void mousePressed(MouseEvent e)		//클릭 되었을때
			{
				if ( e.getX() > 10 && e.getX() < 251 && e.getY() > 0 && e.getY() < 194)		//내사진이면 
				{
					bPause = true;
					int nTemp = JOptionPane.showConfirmDialog(null, "그래! 내가 바로 개 발 자 다 치 트 모 드 발동!", "아싸 개발자!", JOptionPane.DEFAULT_OPTION);
					if ( nTemp == JOptionPane.OK_OPTION )
					{
						bPause = false;
						if ( isCheat )
						{
							isCheat = false;//치트모드중이면 펄스로
						}
						else
						{
							isCheat = true;//치트모드 발동!!
						}
						
					}
				}
			}
			public void mouseReleased(MouseEvent e){}
		}
	}
	class Enemy	//적군 클래스
	{
		final int [] nWidthArray = { 25, 51, 93, 178, 262 };
		final int [] nHeightArray = { 23, 48, 86, 166, 242 };
		int nX = 0;
		int nY = 0;
		int nType = 0;	//0이면 왼쪽을 향해 이동, 1이면 오른쪽을 향해 이동
		int nLevel = 0;
		int nSpeed = 0;
		int nWait = 0;
		int nMoveDistance = 0;
		long lCreateTime = 0;
		
		MyRect rc = new MyRect();
		
		public Enemy()
		{
			SetEnemy();
		}
		
		public void SetEnemy()
		{
			lCreateTime = System.currentTimeMillis();	//생성 타임
			Random random =new Random();				//랜덤생성
			nType = random.nextInt(2);		//타입을 얻어온다.
			nMoveDistance = 0;				//이동 거리 셋팅
			if ( nType == 0 )				//왼쪽이냐 오른쪽이냐
			{
				nX = 1400;
				nSpeed = -(random.nextInt(4) + 3);
				nLevel = getLevel(random);
			}
			else
			{
				nX = -100;
				nSpeed = random.nextInt(4) + 3;
				nLevel = getLevel(random);
			}
			nY = random.nextInt(720);		//y축 위치 설정
			
			//적군 사각형 설정
			rc.nLeft = nX;
			rc.nRight = nX + nWidthArray[nLevel];
			rc.nTop = nY;
			rc.nBottom = nY + nHeightArray[nLevel];
			
			nWait = random.nextInt(5) * 1000;		//기다리는 시간 설정
		}
		public int getLevel( Random random )	//스테이지 레벨에 따라서 물고기 레벨이 정해짐
		{
			if ( isCheat )
			{
				return 3;
			}
			int nTemp = random.nextInt(200 + nStageLevel * 100 );
			if ( nTemp < 200 )
				return 0;
			else if ( nTemp < 300 )
				return 1;
			else if ( nTemp < 400 )
				return 2;
			else if ( nTemp < 550 )
				return 3;
			else
				return 4;
		}
		public boolean canMove()
		{
			return ( System.currentTimeMillis() - lCreateTime > nWait );	//이동 할 수 있는지 체크
		}
		public void Move()
		{
			if ( !canMove() )
				return;
			
			nX += nSpeed;
			nMoveDistance += nSpeed;
			
			rc.nLeft = nX;
			rc.nRight = nX + nWidthArray[nLevel];
			rc.nTop = nY;
			rc.nBottom = nY + nHeightArray[nLevel];
			
			//이동거리 체크해서 다 이동했다면 다시 초기화
			if( nMoveDistance > 1400 || nMoveDistance < -1400 )
				SetEnemy();
		}
		public void InterSectRect( MyRect rectPlayer )	//사각형 충돌체크 
		{
			boolean bCollision = false;
			if ( rectPlayer.nLeft < rc.nLeft && rectPlayer.nRight > rc.nLeft &&
					rectPlayer.nTop < rc.nTop && rectPlayer.nBottom > rc.nTop )
			{
				bCollision = true;
			}
			else if ( rectPlayer.nLeft < rc.nRight && rectPlayer.nRight > rc.nRight &&
					rectPlayer.nTop < rc.nTop && rectPlayer.nBottom > rc.nTop )
			{
				bCollision = true;
			}
			else if ( rectPlayer.nLeft < rc.nRight && rectPlayer.nRight > rc.nRight &&
					rectPlayer.nTop < rc.nBottom && rectPlayer.nBottom > rc.nBottom )
			{
				bCollision = true;
			}
			else if ( rectPlayer.nLeft < rc.nLeft && rectPlayer.nRight > rc.nLeft &&
					rectPlayer.nTop < rc.nBottom && rectPlayer.nBottom > rc.nBottom )
			{
				bCollision = true;
			}
			
			if ( rc.nLeft < rectPlayer.nLeft && rc.nRight > rectPlayer.nLeft &&
					rc.nTop < rectPlayer.nTop && rc.nBottom > rectPlayer.nTop )
			{
				bCollision = true;
			}
			else if ( rc.nLeft < rectPlayer.nRight && rc.nRight > rectPlayer.nRight &&
					rc.nTop < rectPlayer.nTop && rc.nBottom > rectPlayer.nTop )
			{
				bCollision = true;
			}
			else if ( rc.nLeft < rectPlayer.nRight && rc.nRight > rectPlayer.nRight &&
					rc.nTop < rectPlayer.nBottom && rc.nBottom > rectPlayer.nBottom )
			{
				bCollision = true;
			}
			else if ( rc.nLeft < rectPlayer.nLeft && rc.nRight > rectPlayer.nLeft &&
					rc.nTop < rectPlayer.nBottom && rc.nBottom > rectPlayer.nBottom )
			{
				bCollision = true;
			}
			//충돌체크가 되었다면
			if ( bCollision == true )
			{
				if ( nPlayerLevel >= nLevel || isCheat)
				{
					nScore += 100 * (nLevel * 2 + 1);	//나보다 적은물고기면 냠냠하자
					SetEnemy();		//초기화
				}
				else	//아니면 작아진다.
				{
					bPause = true;
					//액션용 메세지박스
					int nTemp = JOptionPane.showConfirmDialog(null, "넌 죽었지만 최고기록이다!", "아디오스", JOptionPane.DEFAULT_OPTION);
					if ( nTemp == JOptionPane.OK_OPTION )
					{
						String inputBestName = JOptionPane.showInputDialog("너의 이름을 입력하거라");	//입력창 뿌린다.
						f.dispose();	//창을 닫는다.
					}
				}
			}
		}
	}
	class Item	//아이템 클래스
	{
		final int [] nWidthArray = { 70, 70, 70 };
		final int [] nHeightArray = { 70, 70, 70 };
		int nX = 0;
		int nY = 0;
		int nWait = 0;
		int nItemType = 0;
		int nMoveDistance = 0;
		
		long lCreateTime = 0;
		
		MyRect rc = new MyRect();
		
		public Item()
		{
			SetItem();
		}
		
		public boolean canMove()
		{
			return ( System.currentTimeMillis() - lCreateTime > nWait );	//이동 할 수 있는지 체크
		}
		public void SetItem()
		{
			Random random =new Random();	//랜덤생성
			
			lCreateTime = System.currentTimeMillis();	//생성 타임
			nMoveDistance = 0;				//이동 거리 셋팅
			nWait = (random.nextInt(30) + 3) * 1000;
			nItemType = random.nextInt(3);
			
			nX = 1400;
			nY = random.nextInt(720);		//y축 위치 설정
			
			//적군 사각형 설정
			rc.nLeft = nX;
			rc.nRight = nX + nWidthArray[nItemType];
			rc.nTop = nY;
			rc.nBottom = nY + nHeightArray[nItemType];
		}
		public void Move()
		{
			if ( !canMove() )
				return;
			
			nX -= 4;
			nMoveDistance -= 4;
			
			rc.nLeft = nX;
			rc.nRight = nX + nWidthArray[nItemType];
			rc.nTop = nY;
			rc.nBottom = nY + nHeightArray[nItemType];
			
			//이동거리 체크해서 다 이동했다면 다시 초기화
			if( nMoveDistance > 1400 || nMoveDistance < -1400 )
				SetItem();
		}
		public void InterSectRect( MyRect rectPlayer )	//사각형 충돌체크 
		{
			boolean bCollision = false;
			if ( rectPlayer.nLeft < rc.nLeft && rectPlayer.nRight > rc.nLeft &&
					rectPlayer.nTop < rc.nTop && rectPlayer.nBottom > rc.nTop )
			{
				bCollision = true;
			}
			else if ( rectPlayer.nLeft < rc.nRight && rectPlayer.nRight > rc.nRight &&
					rectPlayer.nTop < rc.nTop && rectPlayer.nBottom > rc.nTop )
			{
				bCollision = true;
			}
			else if ( rectPlayer.nLeft < rc.nRight && rectPlayer.nRight > rc.nRight &&
					rectPlayer.nTop < rc.nBottom && rectPlayer.nBottom > rc.nBottom )
			{
				bCollision = true;
			}
			else if ( rectPlayer.nLeft < rc.nLeft && rectPlayer.nRight > rc.nLeft &&
					rectPlayer.nTop < rc.nBottom && rectPlayer.nBottom > rc.nBottom )
			{
				bCollision = true;
			}
			
			if ( rc.nLeft < rectPlayer.nLeft && rc.nRight > rectPlayer.nLeft &&
					rc.nTop < rectPlayer.nTop && rc.nBottom > rectPlayer.nTop )
			{
				bCollision = true;
			}
			else if ( rc.nLeft < rectPlayer.nRight && rc.nRight > rectPlayer.nRight &&
					rc.nTop < rectPlayer.nTop && rc.nBottom > rectPlayer.nTop )
			{
				bCollision = true;
			}
			else if ( rc.nLeft < rectPlayer.nRight && rc.nRight > rectPlayer.nRight &&
					rc.nTop < rectPlayer.nBottom && rc.nBottom > rectPlayer.nBottom )
			{
				bCollision = true;
			}
			else if ( rc.nLeft < rectPlayer.nLeft && rc.nRight > rectPlayer.nLeft &&
					rc.nTop < rectPlayer.nBottom && rc.nBottom > rectPlayer.nBottom )
			{
				bCollision = true;
			}
			//충돌체크가 되었다면
			if ( bCollision == true )
			{
				switch(nItemType)
				{
					case 0:
						if ( nPlayerSpeed < 10)
							nPlayerSpeed += 1;	//스피드를 올린다
					break;
					case 1:
						if ( nPlayerSpeed > 1 )
							nPlayerSpeed -= 1;	//스피드를 줄이고
					break;
					case 2:
						nScore += 5000;	//복어는 5천점
					break;
				}
				SetItem();	//아이템 초기화
			}
		}
	}
	class MyRect{		//내가 만든 사각형 클래스
		int nLeft = 0;
		int nTop = 0;
		int nRight = 0;
		int nBottom = 0;
		MyRect()
		{
			nLeft = 0;
			nTop = 0;
			nRight = 0;
			nBottom = 0;
		}
		MyRect( int left, int top, int right, int bottom )
		{
			nLeft = left;
			nTop = top;
			nRight = right;
			nBottom = bottom;
		}
		public void updateVertical(int x)
		{
			nLeft += x;
			nRight += x;
		}
	}
	static public void main(String args[]) {
		new FishGame();
	}
}

