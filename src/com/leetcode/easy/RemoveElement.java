package com.leetcode.easy;

public class RemoveElement
{
	public static void main( String[] args )
	{
		System.out.println( removeElement( new int[]
		{ 0, 1, 2, 2, 3, 0, 4, 2 }, 2 ) );

		System.out.println( removeElementEff( new int[]
		{ 4, 1, 2, 3, 5 }, 4 ) );
	}

	public static int removeElement( int[] nums, int val )
	{
		int i = 0;
		for ( int j = 0; j < nums.length; j++ )
		{
			if ( nums[j] != val )
			{
				nums[i] = nums[j];
				i++;
			}
		}

		return i;
	}

	public static int removeElementEff( int[] nums, int val )
	{
		int i = 0;
		int N = nums.length;
		while ( i < N )
		{
			if ( nums[i] == val )
			{
				nums[i] = nums[N - 1];
				N--;
			}
			else
				i++;
		}

		return N;
	}
}
