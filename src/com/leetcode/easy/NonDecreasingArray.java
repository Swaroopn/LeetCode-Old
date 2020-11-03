package com.leetcode.easy;

public class NonDecreasingArray
{
	public static void main( String[] args )
	{
		System.out.println( checkPossibility( new int[]
		{ 2, 2, 1, 2, 3, 4, 4, 5 } ) );
	}

	public static boolean checkPossibility( int[] nums )
	{
		int count = 0;
		for ( int i = nums.length - 1; i > 0; i-- )
		{
			if ( nums[i] < nums[i - 1] )
			{
				count++;
			}

			if ( count > 1 )
				return false;
		}

		return true;
	}
}
