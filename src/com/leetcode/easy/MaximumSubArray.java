package com.leetcode.easy;

public class MaximumSubArray
{
	public static void main( String[] args )
	{
		int[] arr =
		{ -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println( maxSubArray( arr ) );
	}

	private static int maxSubArray( int[] arr )
	{
		int max = Integer.MIN_VALUE;

		int temp = 0;
		for ( int i = 0; i < arr.length; i++ )
		{
			temp += arr[i];

			if ( temp > max )
				max = temp;

			if ( temp < 0 )
				temp = 0;
		}

		return max;
	}
}
