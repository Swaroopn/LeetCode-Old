package com.leetcode.medium;

import java.util.Arrays;

/*
 * Important
 */
public class NextPermutation_31
{
	public static void main( String[] args )
	{
		int[] arr = new int[]
		{ 2, 3, 1 };
		nextPermutation( arr );
		for ( int item : arr )
			System.out.print( item );
	}

	public static void nextPermutation( int[] nums )
	{
		int N = nums.length;
		int i;
		int min = Integer.MAX_VALUE;
		for ( i = N - 1; i > 0; i-- )
		{
			if ( nums[i] > nums[i - 1] )
				break;
		}

		// if next highest number is not available
		if ( i == 0 )
		{
			Arrays.sort( nums );
			return;
		}
		else
		{
			int x = nums[i - 1];
			min = i;

			// II) Find the smallest digit on right side of (i-1)'th digit that is greater than number[i-1] 
			for ( int j = i + 1; j < nums.length; j++ )
			{
				if ( nums[j] > x && nums[j] < nums[min] )
				{
					min = j;
				}
			}

			int temp = nums[i - 1];
			nums[i - 1] = nums[min];
			nums[min] = temp;

			Arrays.sort( nums, i, N );
		}
	}
}
