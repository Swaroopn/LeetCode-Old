package com.leetcode.easy;

public class NumberOfSegmentsInAString_434
{
	public static void main( String[] args )
	{
		System.out.println( countSegments( "  love live! mu'sic forever" ) );
	}

	public static int countSegments( String s )
	{
		int segments = 0;
		boolean isSpace = true;

		for ( char ch : s.toCharArray() )
		{
			if ( Character.isWhitespace( ch ) )
				isSpace = true;
			else if ( isSpace )
			{
				isSpace = false;
				segments++;
			}
		}

		return segments;
	}
}
