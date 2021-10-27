package BSP;

import java.util.Random;

public class Binary_Space_Partitioning {

	private String[][] map;
	private int X;
	private int Y;
	private String wall;
	
	private int minimum;
	
	public Binary_Space_Partitioning(String[][] MAP, String WALL ) {
		this( MAP, WALL , 0 );
	}
	
	public Binary_Space_Partitioning(String[][] MAP, String WALL , int minimum) {
		if( !checkRect(MAP) )
		{
			System.out.println(" It is not Rectangle");
			return;
		}
		else if ( !checkRectLength(MAP) )
		{
			System.out.println(" this Rectangle length short than minimum length ");
			return;
		}
		map = MAP;
		X = MAP.length;
		Y = MAP[0].length;
		wall = WALL;
		this.minimum = minimum;
	}
	
	public void init() {

		partition( X , Y );
		
	}
	
	public String[][] getMAP(){
		return this.map;
	}
	
	private void partition(int x, int y) {
		Random ran = new Random();
		if(x <= y) 
		{
			int max = y - minimum - ( (minimum > 0) ? 1 : 0 ) ;
//			int targetYgird = ran.nextInt( ( max + 1 - minimum) ) + minimum;
			int targetYgird = (int) ( Math.random() * max ) + minimum;
//			System.out.println("y : " + y + " max : " + max +  " minimum : " + minimum + " targetYgird : " + targetYgird);
			for (int i = 0 ; i < x; i ++)
			{
				map[i][targetYgird] = wall;
			}
		}
		else
		{
			int max = x - minimum - ( (minimum > 0) ? 1 : 0 ) ;
//			int targetXgird = ran.nextInt( ( max + 1 - minimum) ) + minimum;
			int targetXgird = (int) ( Math.random() * max ) + minimum;
//			System.out.println("x : " + x + " max : " + max +  " minimum : " + minimum + " targetYgird : " + targetXgird);
			for (int i = 0 ; i < y; i ++)
			{
				map[targetXgird][i] = wall;
			}
		}
	}
	
	
	/*
	 * check Rectangle height , width length 
	 * 
	 * if height or width short than minimum
	 * return false
	 * else
	 * return true;
	 * */
	private boolean checkRectLength( String[][] target) {
		int yLength = target.length;
		int xLength = target[0].length;

		if( yLength <= minimum*2 ) 
		{
			System.out.println(" yLength <= minimum*2 ");
			return false;
		}
		else if ( xLength <= minimum*2 )
		{
			System.out.println(" xLength <= minimum*2 ");
			return false;
		}
		
		return true;
	}

	/*
	 * input String[][] array
	 * if ractangle shape
	 * return true
	 * 
	 * if not rectangle shape
	 * return false
	 * */
	private boolean checkRect( String[][] target) {
		int first = target[0].length;
		for(String[] line : target) {
			if(first != line.length)
			{
				return false;
			}
		}
		return true;
	}
}
