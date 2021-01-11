package com.leetcode.easy;

public class SplitBalancedString_1221
{
	public int balancedStringSplit( String s )
	{
		int count = 0;
		int lCount = 0;
		int rCount = 0;
		for ( char ch : s.toCharArray() )
		{
			if ( 'R' == ch )
				rCount++;
<<<<<<< HEAD
			else if ( 'L' == ch )
=======

			if ( 'L' == ch )
>>>>>>> 92b4f99a37690f59e5bc5d2fa42b104e3318f4bd
				lCount++;

			if ( rCount == lCount )
			{
				count++;
				rCount = 0;
				lCount = 0;
			}
		}

		return count;
	}
}
