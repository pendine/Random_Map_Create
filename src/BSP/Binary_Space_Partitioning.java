package BSP;

import java.util.Random;

public class Binary_Space_Partitioning {

	private String[][] map;
	private int X;
	private int Y;
	private String wall;
	
	private int minimum;
	
	public Binary_Space_Partitioning(String[][] MAP, String WALL) {
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
	}
	
	private void partition(int x, int y) {
		Random ran = new Random();
		if(x <= y) 
		{
			int targetYgird = ran.nextInt( y-minimum ) + minimum;
			for (int i = 0 ; i < y; i ++)
			{
				map[i][targetYgird] = wall;
			}
		}
		else
		{
			int targetXgird = ran.nextInt( x-minimum ) + minimum;
			for (int i = 0 ; i < x; i ++)
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

		if( yLength <= minimum ) 
		{
			return false;
		}
		else if ( xLength <= minimum )
		{
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
