package com.leetcode.easy;

public class MatchesInTour_1688
{
	public static void main( String[] args )
	{
		System.out.println( numberOfMatches( 7 ) );
		System.out.println( numberOfMatches( 14 ) );
	}

	public static int numberOfMatches( int n )
	{
		int totalMatches = 0;
		while ( n > 1 )
		{
			totalMatches += n / 2;
			n = ( n % 2 ) + ( n / 2 );
		}

		return totalMatches;
	}
}
