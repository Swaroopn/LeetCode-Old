package com.leetcode.easy;

/*
 * Input array is sorted
 */
public class TwoSum2_167
{
	public static void main( String[] args )
	{
		int[] nums = new int[]
		{ 1, 2, 3, 4, 4, 9, 56, 90 };
		int target = 8;

		int[] indices = twoSum( nums, target );
		System.out.println( indices[0] + "," + indices[1] );
	}

	public static int[] twoSum( int[] numbers, int target )
	{
		int start = 0;
		int end = numbers.length - 1;

		while ( start < end )
		{
			int tempSum = numbers[start] + numbers[end];
			if ( tempSum == target )
				return new int[]
				{ start + 1, end + 1 };

			if ( tempSum < target )
				start++;
			else
				end--;
		}

		return new int[]
		{ -1, -1 };
	}
}
