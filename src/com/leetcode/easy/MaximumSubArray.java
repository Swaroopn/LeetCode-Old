package com.leetcode.easy;

public class MaximumSubArray
{
	public static void main( String[] args )
	{
		int[] arr =
		{ -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println( maxSubArray( arr ) );
		System.out.println( findMaxSubArray( arr ) );
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

	/*
	 * Kadane's Algo
	 */
	private static int findMaxSubArray( int[] nums )
	{
		int localMax = 0;
		int globalMax = Integer.MIN_VALUE;
		for ( int i = 0; i < nums.length; i++ )
		{
			localMax = Math.max( nums[i], nums[i] + localMax );
			if ( localMax > globalMax )
				globalMax = localMax;
		}

		return globalMax;
	}
}
