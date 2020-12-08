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

			if ( 'L' == ch )
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
