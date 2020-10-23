package com.leetcode.easy;

public class ClimbingStairs
{
	public static void main( String[] args )
	{
		System.out.println( climbStairs( 4 ) );
	}

	public static int climbStairs( int n )
	{
		/*if ( n == 1 )
			return 1;
		
		if ( n == 2 )
			return 2;
		
		return climbStairs( n - 2 ) + climbStairs( n - 1 );*/

		if ( n == 1 || n == 2 )
			return n;

		int[] dp = new int[n + 1];
		dp[1] = 1;
		dp[2] = 2;
		for ( int i = 3; i <= n; i++ )
			dp[i] = dp[i - 1] + dp[i - 2];

		return dp[n];
	}
}
