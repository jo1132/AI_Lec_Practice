import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class FishGame implements Runnable, KeyListener {
	JFrame f;				//�������� ����
	DrawFishComponent c;	//�Ѹ� ������Ʈ 
	Thread thr = null;		//�����带 ������
	ArrayList<Enemy> enemyList = new ArrayList<Enemy>();	//���� ��� ����Ʈ ����
	ArrayList<Item> itemList = new ArrayList<Item>();		//������ ��� ����Ʈ ����
	
	final int [] nPlayerWidthArray = { 45, 70, 140, 240, 350 };	//�÷��̾��� �׸� ����
	final int [] nPlayerHeightArray = { 33, 52, 105, 186, 270 };//�÷��̾��� �׸� ����
	int nPlayerLevel = 0;		//�÷��̾� ����
	int nPlayerPosX = 100;		//��ġ
	int nPlayerPosY = 100;	
	int nPlayerSpeed = 2;
	int nStageLevel = 1;		//���������� ����
	int nScore = 0;				//���ھ�
	
	MyRect rcPlayer = new MyRect();	//�÷��̾��� ��Ʈ
	
	int nEnemyMax = 15;		//������ �� ����
	int nColorSeed = 0;		//welcome to my world�� ���������� �Ѹ��� ���� �õ����
	long nEnemyAddTime = 0;	//������ ���ϴ� Ÿ��
	long nColorChangeTime = 0;//�÷��� �ٲ�� �ð�
	
	boolean isKeyRight = false;
	boolean isKeyUp = false;
	boolean isKeyLeft = false;
	boolean isKeyDown = false;
	
	boolean isCheat = false;
	boolean bPause = false;
	public void run()
	{
		while( thr != null )	//�����带 ������.
		{
			try{
				Thread.sleep(10);
			} catch( InterruptedException e ){
				
			}
			if ( bPause )	//���� ���� ���¶�� �ǳʶڴ�.
				continue;
			movePlayer();	//�÷��̾ �����δ�.
			for ( int i = 0; i < nEnemyMax; i++ )	//������ �����̰� �÷��̾�� �浹üũ�� �Ѵ�.
			{
				Enemy enemy = enemyList.get(i);
				enemy.Move();
				enemy.InterSectRect( rcPlayer );
			}
			for ( int i = 0; i < 10; i++ )	//�������� �����̰� �÷��̾�� �浹üũ�� �Ѵ�.
			{
				Item item = itemList.get(i);
				item.Move();
				item.InterSectRect( rcPlayer );
			}
			AddEnemy();		//���� ���Ѵ�.
			StageUpdate();	//���������� ������Ʈ�Ѵ�.
			c.repaint();	//�ٽ� �׸���.
		}
	}
	public void StageUpdate()		//���ھ ���� �÷��̾� ������ ���������� ���Ѵ�.
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
	public void AddEnemy()	//������ �� �����Ѵ�.
	{
		if ( nStageLevel > 3 )	
			return;
		if ( System.currentTimeMillis() - nEnemyAddTime > 3000 + nStageLevel * 200 )	//���� �ð��� �°� ����
		{
			Enemy enemy = new Enemy();	//������ ���Ѵ�.
			enemyList.add(enemy);
			nEnemyMax ++;
			nEnemyAddTime = System.currentTimeMillis();
		}
	}
	public void movePlayer()	//���� Ű�� �°� �÷��̾ �����δ�.
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
		//�÷��̾� �簢���� ������Ʈ
		rcPlayer.nLeft = nPlayerPosX;			
		rcPlayer.nTop = nPlayerPosY + nPlayerLevel * 3;
		rcPlayer.nRight = nPlayerPosX + nPlayerWidthArray[nPlayerLevel];
		rcPlayer.nBottom = nPlayerPosY + nPlayerHeightArray[nPlayerLevel];
	}
	public void keyPressed( KeyEvent e )	//Ű�� �������� üũ�Ѵ�.
	{
		char key = e.getKeyChar();
		//������ �ִ� ���̶�� boolean�� ������ �����.
		//���⿡�� �÷��̾ �̵����� �ʴ������� ���ܼ� �̵��ϱ� ����
		
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
		switch(e.getKeyCode())//Ű�� �������ٸ� boolean�� �������� �����.
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
		
		//������ ����
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
		
		initConponents();	//������Ʈ ����	
		thr = new Thread(this);//������ ����
		thr.start();		//������ ��ŸƮ
		
		//�÷��̾� �簢���� ������Ʈ
		rcPlayer.nLeft = nPlayerPosX;
		rcPlayer.nTop = nPlayerPosY + nPlayerLevel * 3;
		rcPlayer.nRight = nPlayerPosX + nPlayerWidthArray[nPlayerLevel];
		rcPlayer.nBottom = nPlayerPosY + nPlayerHeightArray[nPlayerLevel];
	}
	
	public void initConponents()
	{
		FishGame fg = this;	
		fg.f = new JFrame();	//�������� ����
		f.setTitle("FISH GAME!");	//Ÿ��Ʋ
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	//�ݱ� �ɼ�
		f.setSize(1366, 768);	//ũ�� ����
		f.setLocation(0, 0);	//��ġ
		
		fg.c = new DrawFishComponent();	//�׸��� ������Ʈ Ŭ����
		f.add(fg.c);		//���Ѵ�.
		
		f.requestFocus();
		f.addKeyListener(this);	//Ű ������
		f.setVisible(true);
	}
	
	class DrawFishComponent extends JComponent{	//�Ѹ���� Ŭ����
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
			
			g.drawImage(imgBgr, 0, 0, this);		//��� �׸�
			g.drawImage(imgMe, 10, 0, this);		//�� ����
			for ( int i = 0; i < nEnemyMax; i++ )	//������ �׸���. ȭ�� �ۿ��� ������� ���� �׸��� �ʴ´�.
			{
				Enemy enemy = enemyList.get(i);
				if ( !enemy.canMove() )
					continue;
				
				if ( enemy.nType == 0 )		//�����̸�
					g.drawImage(imgEnemyLeft[enemy.nLevel],enemy.nX, enemy.nY, this);
				if ( enemy.nType == 1 )		//�������̸�
					g.drawImage(imgEnemyRight[enemy.nLevel],enemy.nX, enemy.nY, this);
			}
			
			for ( int i = 0; i < 10; i++ )	//�������� �׸���. ȭ�� �ۿ��� ������� �������� �׸��� �ʴ´�.
			{
				Item item = itemList.get(i);
				if ( !item.canMove() )
					continue;
				
				g.drawImage(imgItem[item.nItemType],item.nX, item.nY, this);		
			}
			
			if ( nLeftRight == 1 )		//�÷��̾ �����̳� �������̳� üũ
				g.drawImage(imgPlayerRight[nPlayerLevel], nPlayerPosX, nPlayerPosY, this);
			else
				g.drawImage(imgPlayerLeft[nPlayerLevel], nPlayerPosX, nPlayerPosY, this);
			
			g.setFont(new Font("Dialog", Font.BOLD, 20));		//��Ʈũ�� ������
			
			str = "Score : " + nScore;		//���ھ� ����
			
			if ( System.currentTimeMillis() - nColorChangeTime > 300 )	//������ �ǽ����� ����ϱ� ���� ���� �ð� ��
			{
				nColorSeed += 1;		//�÷� �õ带 �ø���.
				nColorChangeTime = System.currentTimeMillis();
			}
			for ( int i = 0; i < strWelcome.length(); i++ )
			{
				int rVal = 0, gVal = 0, bVal = 0;
				
				rVal = (i * 10 + nColorSeed * 100) % 256;		//�� ���� ����
				gVal = (i * 30 + nColorSeed * 100) % 256;
				bVal = (i * 20 + nColorSeed * 100) % 256;
				
				g.setColor(new Color(rVal,gVal,bVal));
				g.drawString(strWelcome.substring(i, i+1), 500 + i * 18, 30);		//Welcome to FishWorld�� �Ѹ���.
			}
			
			g.setColor(Color.black);		//�ٽ� �������� �ٲٰ�
			g.drawString(str, 1100, 30);	//���ھ �Ѹ���.
		}
		public void InitImage(){		//�̹������� �о�´�.
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
			InitImage();			//�̹����� �а�
			addMouseListener( new MouseEventHd1() );	//���콺 Ŭ���� ���ؼ� �̺�Ʈ ���
		}
		class MouseEventHd1 extends MouseAdapter {
			public void mousePressed(MouseEvent e)		//Ŭ�� �Ǿ�����
			{
				if ( e.getX() > 10 && e.getX() < 251 && e.getY() > 0 && e.getY() < 194)		//�������̸� 
				{
					bPause = true;
					int nTemp = JOptionPane.showConfirmDialog(null, "�׷�! ���� �ٷ� �� �� �� �� ġ Ʈ �� �� �ߵ�!", "�ƽ� ������!", JOptionPane.DEFAULT_OPTION);
					if ( nTemp == JOptionPane.OK_OPTION )
					{
						bPause = false;
						if ( isCheat )
						{
							isCheat = false;//ġƮ������̸� �޽���
						}
						else
						{
							isCheat = true;//ġƮ��� �ߵ�!!
						}
						
					}
				}
			}
			public void mouseReleased(MouseEvent e){}
		}
	}
	class Enemy	//���� Ŭ����
	{
		final int [] nWidthArray = { 25, 51, 93, 178, 262 };
		final int [] nHeightArray = { 23, 48, 86, 166, 242 };
		int nX = 0;
		int nY = 0;
		int nType = 0;	//0�̸� ������ ���� �̵�, 1�̸� �������� ���� �̵�
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
			lCreateTime = System.currentTimeMillis();	//���� Ÿ��
			Random random =new Random();				//��������
			nType = random.nextInt(2);		//Ÿ���� ���´�.
			nMoveDistance = 0;				//�̵� �Ÿ� ����
			if ( nType == 0 )				//�����̳� �������̳�
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
			nY = random.nextInt(720);		//y�� ��ġ ����
			
			//���� �簢�� ����
			rc.nLeft = nX;
			rc.nRight = nX + nWidthArray[nLevel];
			rc.nTop = nY;
			rc.nBottom = nY + nHeightArray[nLevel];
			
			nWait = random.nextInt(5) * 1000;		//��ٸ��� �ð� ����
		}
		public int getLevel( Random random )	//�������� ������ ���� ����� ������ ������
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
			return ( System.currentTimeMillis() - lCreateTime > nWait );	//�̵� �� �� �ִ��� üũ
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
			
			//�̵��Ÿ� üũ�ؼ� �� �̵��ߴٸ� �ٽ� �ʱ�ȭ
			if( nMoveDistance > 1400 || nMoveDistance < -1400 )
				SetEnemy();
		}
		public void InterSectRect( MyRect rectPlayer )	//�簢�� �浹üũ 
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
			//�浹üũ�� �Ǿ��ٸ�
			if ( bCollision == true )
			{
				if ( nPlayerLevel >= nLevel || isCheat)
				{
					nScore += 100 * (nLevel * 2 + 1);	//������ ���������� �ȳ�����
					SetEnemy();		//�ʱ�ȭ
				}
				else	//�ƴϸ� �۾�����.
				{
					bPause = true;
					//�׼ǿ� �޼����ڽ�
					int nTemp = JOptionPane.showConfirmDialog(null, "�� �׾����� �ְ����̴�!", "�Ƶ����", JOptionPane.DEFAULT_OPTION);
					if ( nTemp == JOptionPane.OK_OPTION )
					{
						String inputBestName = JOptionPane.showInputDialog("���� �̸��� �Է��ϰŶ�");	//�Է�â �Ѹ���.
						f.dispose();	//â�� �ݴ´�.
					}
				}
			}
		}
	}
	class Item	//������ Ŭ����
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
			return ( System.currentTimeMillis() - lCreateTime > nWait );	//�̵� �� �� �ִ��� üũ
		}
		public void SetItem()
		{
			Random random =new Random();	//��������
			
			lCreateTime = System.currentTimeMillis();	//���� Ÿ��
			nMoveDistance = 0;				//�̵� �Ÿ� ����
			nWait = (random.nextInt(30) + 3) * 1000;
			nItemType = random.nextInt(3);
			
			nX = 1400;
			nY = random.nextInt(720);		//y�� ��ġ ����
			
			//���� �簢�� ����
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
			
			//�̵��Ÿ� üũ�ؼ� �� �̵��ߴٸ� �ٽ� �ʱ�ȭ
			if( nMoveDistance > 1400 || nMoveDistance < -1400 )
				SetItem();
		}
		public void InterSectRect( MyRect rectPlayer )	//�簢�� �浹üũ 
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
			//�浹üũ�� �Ǿ��ٸ�
			if ( bCollision == true )
			{
				switch(nItemType)
				{
					case 0:
						if ( nPlayerSpeed < 10)
							nPlayerSpeed += 1;	//���ǵ带 �ø���
					break;
					case 1:
						if ( nPlayerSpeed > 1 )
							nPlayerSpeed -= 1;	//���ǵ带 ���̰�
					break;
					case 2:
						nScore += 5000;	//����� 5õ��
					break;
				}
				SetItem();	//������ �ʱ�ȭ
			}
		}
	}
	class MyRect{		//���� ���� �簢�� Ŭ����
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

