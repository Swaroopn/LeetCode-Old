package com.leetcode.easy;

/*
 * Dynamic Programming
 */
public class HouseRobber
{
	public static void main( String[] args )
	{
		System.out.println( rob( new int[]
		{ 1, 2, 3, 1 } ) );
	}

	public static int rob( int[] houseVal )
	{
		int N = houseVal.length;

		if ( N == 0 )
			return 0;

		if ( N == 1 )
			return houseVal[0];

		if ( N == 2 )
			return Math.max( houseVal[0], houseVal[1] );

		// dp[i] represent the maximum value stolen so far after reaching house i. 
		int[] dp = new int[N];
		dp[0] = houseVal[0];
		dp[1] = Math.max( houseVal[0], houseVal[1] );

		// Fill remaining positions 
		for ( int i = 2; i < N; i++ )
			dp[i] = Math.max( houseVal[i] + dp[i - 2], dp[i - 1] );

		return dp[N - 1];
	}
}
