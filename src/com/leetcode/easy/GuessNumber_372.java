package com.leetcode.easy;

public class GuessNumber_372
{

	public static int guessNumber( int n )
	{
		int low = 0, high = n;
		while ( low <= high )
		{
			int mid = low + ( high - low ) / 2;
			int temp = guess( mid );
			if ( temp == 0 )
				return mid;
			else if ( temp == -1 )
				high = mid - 1;
			else
				low = mid + 1;
		}

		return -1;
	}

	public static int guess( int num )
	{
		return 0;
	}
}
