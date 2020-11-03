package com.leetcode.easy;

public class StockBuySell_121
{
	public static void main( String[] args )
	{
		System.out.println( maxProfit( new int[]
		{ 7, 1, 5, 3, 6, 4 } ) );
	}

	public static int maxProfit( int[] prices )
	{
		int min = Integer.MAX_VALUE;
		int profit = 0;

		for ( int i = 0; i < prices.length; i++ )
		{
			if ( prices[i] < min )
				min = prices[i];
			else
			{
				int sellVal = prices[i] - min;
				if ( sellVal > profit )
					profit = sellVal;
			}
		}

		return profit;
	}
}
