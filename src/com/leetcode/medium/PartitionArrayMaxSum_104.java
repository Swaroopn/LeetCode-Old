package com.leetcode.medium;

public class PartitionArrayMaxSum_104
{
	public static void main( String[] args )
	{
		System.out.println( maxSumAfterPartitioning( new int[]
		{ 1, 15, 7, 9, 2, 5, 10 }, 3 ) );
	}

	public static int maxSumAfterPartitioning( int[] arr, int k )
	{
		int N = arr.length;
		int[] dp = new int[N];

		int max = Integer.MIN_VALUE;
		for ( int i = 0; i < k; i++ )
		{
			max = Math.max( max, arr[i] );
			dp[i] = max * ( i + 1 );
		}

		for ( int i = k; i < N; i++ )
		{
			for ( int j = 1; j <= k; j++ )
			{
				max = Math.max( max, arr[i - j + 1] );
				dp[i] = Math.max( dp[i], dp[i - j] + max * j );
			}
		}

		return dp[N - 1];
	}
}
