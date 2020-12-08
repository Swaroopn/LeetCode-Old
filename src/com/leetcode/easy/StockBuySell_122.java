package com.leetcode.easy;

public class StockBuySell_122
{
	public static void main( String[] args )
	{
		System.out.println( maxProfit( new int[]
		{ 2, 1, 5, 3, 6, 4 } ) );
	}

	public static int maxProfit( int[] prices )
	{
		int totalProfit = 0;

		for ( int i = 1; i < prices.length; i++ )
		{
			if ( prices[i] > prices[i - 1] )
				totalProfit += prices[i] - prices[i - 1];
		}

		return totalProfit;
	}
}
