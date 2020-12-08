package com.leetcode.medium;

public class MinASCIIDelete_712
{
	public int minimumDeleteSum( String s1, String s2 )
	{
		char[] str1 = s1.toCharArray();
		char[] str2 = s2.toCharArray();

		int ROW = str1.length;
		int COL = str2.length;
		int dp[][] = new int[ROW + 1][COL + 1];

		for ( int i = 0; i <= ROW; i++ )
		{
			for ( int j = 0; j <= COL; j++ )
			{
				if ( i == 0 || j == 0 )
				{
					dp[i][j] = 0;
				}
				else if ( str1[i - 1] == str2[j - 1] )
				{
					dp[i][j] = dp[i - 1][j - 1] + 1;
				}
				else
				{
					dp[i][j] = Math.max( dp[i][j - 1], dp[i - 1][j] );
				}
			}
		}

		return dp[ROW][COL];
	}
}