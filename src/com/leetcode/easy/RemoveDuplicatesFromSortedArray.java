package com.leetcode.easy;

public class RemoveDuplicatesFromSortedArray
{
	public static void main( String[] args )
	{
		System.out.println( removeDuplicates( new int[]
		{ 1, 1, 2, 3, 4, 4, 5 } ) );
	}

	public static int removeDuplicates( int[] nums )
	{
		/*
		int uniqueNumCount = 1;
		int prevNum = nums[0];
		for ( int i = 1; i < nums.length; i++ )
		{
			if ( prevNum != nums[i] )
			{
				uniqueNumCount++;
				prevNum = nums[i];
			}
		}
		*/

		int i = 0;
		for ( int j = 1; j < nums.length; j++ )
		{
			if ( nums[i] != nums[j] )
				nums[++i] = nums[j];
		}

		for ( int j = 0; j <= i; j++ )
			System.out.print( nums[j] );
		System.out.println();
		return i + 1;
	}
}