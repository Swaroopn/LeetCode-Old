package com.leetcode.medium;

import java.util.Arrays;

public class ThreeSumClosest_16
{
	public static void main( String[] args )
	{
		System.out.println( threeSumClosest( new int[]
		{ -1, 2, 1, -4 }, 1 ) );
		System.out.println( threeSumClosest( new int[]
		{ 1, 1, 1, 0 }, -100 ) );
		System.out.println( threeSumClosest( new int[]
		{ 1, 1, -1, -1, 3 }, -1 ) );
	}

	public static int threeSumClosest( int[] nums, int target )
	{
		int diff = Integer.MAX_VALUE;
		int N = nums.length;

		Arrays.sort( nums );
		for ( int i = 0; i < N && diff != 0; i++ )
		{
			int low = i + 1;
			int high = N - 1;

			while ( low < high )
			{
				int sum = nums[i] + nums[low] + nums[high];
				if ( Math.abs( target - sum ) < Math.abs( diff ) )
					diff = target - sum;

				if ( sum < target )
					low++;
				else
					high--;
			}
		}

		return target - diff;
	}
}
