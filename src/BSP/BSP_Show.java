package BSP;

public class BSP_Show {

	public String[][] TestMAP;
	private int minimum;
	
	public BSP_Show() {
		this(5,9);
	}
	
	public BSP_Show(int X, int Y) {
		this( X , Y , 0);
	}
	
	public BSP_Show(int X, int Y , int minimum) {
		this.minimum = minimum;
		TestMAP = new String[X][Y];
	}
	
	
	public void init() {
		mapInit(TestMAP , "□");
		
		Binary_Space_Partitioning test = new Binary_Space_Partitioning(TestMAP, "■" , minimum );
		
		test.init();
		
		mapPrint(TestMAP);

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
