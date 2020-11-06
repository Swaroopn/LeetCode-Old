package com.leetcode.easy;

public class ArrangingCoins
{
	public static void main( String[] args )
	{
		System.out.println( arrangeCoins( 1 ) );
		System.out.println( arrangeCoins( 8 ) );
		System.out.println( arrangeCoins( 5 ) );
	}

	public static int arrangeCoins( int n )
	{
		int low = 0;
		int high = n;
		int mid;
		int steps = 0;
		while ( low <= high )
		{
			mid = low + ( high - low ) / 2;
			steps = mid * ( mid + 1 ) / 2;

			if ( steps == n )
				return ( int ) mid;

			if ( n < steps )
				high = mid - 1;
			else
				low = mid + 1;
		}

		return ( int ) high;
	}
}
