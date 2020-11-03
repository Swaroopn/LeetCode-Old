package com.leetcode.easy;

public class RunningSumOf1dArray
{
	public static void main( String[] args )
	{
		int[] temp = runningSum( new int[]
		{ 1, 2, 3, 4 } );
		for ( int i = 0; i < temp.length; i++ )
			System.out.println( temp[i] );
	}

	public static int[] runningSum( int[] nums )
	{
		for ( int i = 1; i < nums.length; i++ )
		{
			nums[i] += nums[i - 1];
		}

		return nums;
	}
}
