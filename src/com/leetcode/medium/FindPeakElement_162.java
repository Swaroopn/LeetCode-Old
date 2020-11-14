package com.leetcode.medium;

public class FindPeakElement_162
{
	public static void main( String[] args )
	{
		System.out.println( findPeakElement( new int[]
		{ 4, 2, 3, 1 } ) );
		System.out.println( findPeakElementEff( new int[]
		{ 4, 2, 3, 1 } ) );
	}

	public static int findPeakElement( int[] nums )
	{
		for ( int i = 0; i < nums.length - 1; i++ )
		{
			if ( nums[i] > nums[i + 1] )
				return i;
		}
		
		return nums.length - 1;
	}

	public static int findPeakElementEff( int[] nums )
	{
		int left = 0;
		int right = nums.length - 1;
		while ( left < right )
		{
			int mid = left + ( right - left ) / 2;
			if ( nums[mid] < nums[mid + 1] )
				left = mid + 1;
			else
				right = mid;
		}

		return left;
	}
}
