package com.leetcode.easy;

/*
 * Dynamic Programming
 */
public class MinCostClimbingStairs_746_DP
{
	public static void main( String[] args )
	{
		System.out.println( minCostClimbingStairs( new int[]
		{ 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 } ) );
	}

	public static int minCostClimbingStairs( int[] cost )
	{
		int N = cost.length;
		int[] dp = new int[N];
		dp[0] = cost[0];
		dp[1] = cost[1];
		for ( int i = 2; i < N; i++ )
		{
			dp[i] = cost[i] + Math.min( dp[i - 1], dp[i - 2] );
		}

		return Math.min( dp[N - 1], dp[N - 2] );
	}
}
