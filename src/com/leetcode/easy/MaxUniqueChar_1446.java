package com.leetcode.easy;

public class MaxUniqueChar_1446
{
	public static void main( String[] args )
	{
		System.out.println( maxPower( "ccbccbbb" ) );
	}

	public static int maxPower( String s )
	{
		int count = 0;
		int maxCount = 0;
		char prev = ' ';
		for ( int i = 0; i < s.length(); i++ )
		{
			char ch = s.charAt( i );
			if ( ch == prev )
				count++;
			else
			{
				count = 1;
				prev = ch;
			}
			
			maxCount = Math.max( maxCount, count );
		}

		return maxCount;
	}
}
