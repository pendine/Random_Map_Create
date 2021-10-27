package main;

import BSP.Binary_Space_Partitioning;

public class Main {
	
	public static String[][] TestMAP = new String[5][9];
/*
		{ 
			{ "" , "" , "" , ""} ,
			{ "" , "" , "" , ""} ,
//			{ "" , "" , "" , ""} ,
//			{ "" , "" , "" , ""} ,
//			{ "" , "" , "" , ""} ,
			{ "" , "" , "" , ""} ,
			{ "" , "" , "" , ""} ,
			{ "" , "" , "" , ""}   
	};
*/
	public static void main(String[] args) 
	{
		Main aa = new Main();

		aa.mapInit(TestMAP , "□");
		
		System.out.println("Program Start");
		
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
