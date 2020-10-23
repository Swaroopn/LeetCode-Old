package com.leetcode.easy;

public class Sqrt
{
	public static void main( String[] args )
	{
		int num = Integer.MAX_VALUE;
		System.out.println( getSqrt( num ) );
		System.out.println( getSqrtUsingBinarySearch( num ) );
	}

	/*
	 * if n * n <= x < (n + 1) * (n + 1) then we return n
	 */
	private static int getSqrtUsingBinarySearch( int num )
	{
		if ( num == 0 )
			return 0;

		int low = 1, high = num;
		while ( low <= high )
		{
			int mid = low + ( high - low ) / 2;
			if ( mid <= num / mid && mid + 1 > num / ( mid + 1 ) )
			{
				return mid;
			}

			if ( mid > num / mid )
			{
				high = mid - 1;
			}
			else
			{
				low = mid + 1;
			}
		}

		return low;
	}

	private static int getSqrt( int num )
	{
		if ( num <= 1 )
			return 1;

		long i = 1;
		for ( ; i <= num / 2; i++ )
		{
			if ( i * i > num )
				return ( int ) i - 1;
		}

		return ( int ) i - 1;
	}
}
