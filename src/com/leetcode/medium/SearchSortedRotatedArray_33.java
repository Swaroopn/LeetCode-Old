package com.leetcode.medium;

public class SearchSortedRotatedArray_33
{
	public static void main( String[] args )
	{
		System.out.println( search( new int[]
		{ 4, 5, 6, 7, 0, 1, 2 }, 10 ) );
	}

	public static int search( int[] nums, int target )
	{
		int left = 0;
		int right = nums.length - 1;
		while ( left <= right )
		{
			if ( nums[left] == target )
				return left;
			else if ( nums[right] == target )
				return right;
			else
			{
				left++;
				right--;
			}
		}

		return -1;
	}
}
