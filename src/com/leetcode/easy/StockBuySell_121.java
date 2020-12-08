package com.leetcode.easy;

public class StockBuySell_121
{
	public static void main( String[] args )
	{
		System.out.println( maxProfit( new int[]
		{ 7, 1, 5, 3, 6, 4, 0, 10 } ) );
	}

	public static int maxProfit( int[] prices )
	{
		int buyVal = Integer.MAX_VALUE;
		int profit = 0;

		for ( int i = 0; i < prices.length; i++ )
		{
			if ( prices[i] < buyVal )
				buyVal = prices[i];
			else
				profit = Math.max( profit, prices[i] - buyVal );
		}

		return profit;
	}
}
