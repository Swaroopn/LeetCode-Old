package com.leetcode.easy;

public class SearchInsertPosition
{
	public static void main( String[] args )
	{
		System.out.println( searchInsert( new int[]
		{ 1, 3, 5, 6 }, 0 ) );
	}

	public static int searchInsert( int[] nums, int target )
	{
		int i = 0;
		for ( ; i < nums.length; i++ )
		{
			if ( nums[i] == target )
				return i;

			if ( target < nums[i] )
				return i;
		}

		return i;
	}
}
