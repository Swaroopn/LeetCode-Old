package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class PathCrossing_1496
{
	public static void main( String[] args )
	{
		System.out.println( isPathCrossing( "NES" ) );
	}

	public static boolean isPathCrossing( String path )
	{
		Set<String> coordinates = new HashSet<>();
		coordinates.add( "(0,0)" );

		int x = 0;
		int y = 0;

		for ( char ch : path.toCharArray() )
		{
			if ( ch == 'N' )
				x++;
			else if ( ch == 'S' )
				x--;
			else if ( ch == 'E' )
				y++;
			else if ( ch == 'W' )
				y--;

			if ( !coordinates.add( "(" + x + "," + y + ")" ) )
				return true;
		}

		return false;
	}
}
