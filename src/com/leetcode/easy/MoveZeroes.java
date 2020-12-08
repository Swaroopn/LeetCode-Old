package com.leetcode.easy;

import java.util.Arrays;

public class MoveZeroes
{
	public static void main( String[] args )
	{
		int[] arr = new int[]
		{ 1, 2, 0, 3, 10, 0 };
		moveZeroes( arr );
		System.out.println( Arrays.toString( arr ) );
	}

	public static void moveZeroes( int[] nums )
	{
		int zeroPtr = 0;
		for ( int nonZeroPtr = 0; nonZeroPtr < nums.length; nonZeroPtr++ )
		{
			if ( nums[nonZeroPtr] != 0 )
			{
				int temp = nums[nonZeroPtr];
				nums[nonZeroPtr] = nums[zeroPtr];
				nums[zeroPtr] = temp;

				zeroPtr++;
			}
		}
	}
}
