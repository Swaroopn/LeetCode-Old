package com.leetcode.easy;

public class MoveZeroes
{
	public static void main( String[] args )
	{
		moveZeroes( new int[]
		{ 0, 1, 0, 3, 12 } );
	}

	public static void moveZeroes( int[] nums )
	{
		int ind = 0;
		for ( int i = 0; i < nums.length; i++ )
		{
			if ( nums[i] != 0 )
			{
				nums[ind] = nums[i];
				if ( i != ind )
				{
					nums[i] = 0;
				}
				ind++;
			}
		}
	}
}
