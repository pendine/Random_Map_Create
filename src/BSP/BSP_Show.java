package BSP;

public class BSP_Show {

	public static String[][] TestMAP = new String[5][9];
	
	
	
	public BSP_Show() {
		this(5,9);
	}
	
	public BSP_Show(int X, int Y) {
		TestMAP = new String[X][Y];
	}
	
	
	public void init() {
		BSP_Show aa = new BSP_Show();
		aa.mapInit(TestMAP , "□");
		
		Binary_Space_Partitioning test = new Binary_Space_Partitioning(TestMAP, "■" , 1 );
		
		test.init();
		
		aa.mapPrint(TestMAP);

	}
	public void mapInit(String[][] map , String space) 
	{
		for(int i =0; i < map.length ; i ++) 
		{
			for( int j = 0 ; j < map[i].length ; j++ )
			{
				map[i][j] = space;
			}
		}
		
	}

	public void mapPrint(String[][] map ) 
	{
		for(int i =0; i < map.length ; i ++) 
		{
			for( int j = 0 ; j < map[i].length ; j++ )
			{
				System.out.print( map[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
