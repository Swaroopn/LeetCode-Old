package com.leetcode.medium;

/*
 * https://leetcode.com/problems/counting-bits/
 */
public class CountingBits_338
{
	public static void main( String[] args )
	{
		countBits( 2 );
	}

	public static int[] countBits( int num )
	{
		if ( num == 0 )
			return new int[]
			{ 0 };

		if ( num == 1 )
			return new int[]
			{ 0, 1 };

		int[] dp = new int[num + 1];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;

		for ( int i = 3; i <= num; i++ )
		{
			if ( i % 2 == 0 )
				dp[i] = dp[i / 2];
			else
				dp[i] = 1 + dp[i / 2];
		}

		return dp;
	}
}
