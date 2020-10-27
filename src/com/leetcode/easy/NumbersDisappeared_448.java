package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class NumbersDisappeared_448
{
	public static void main( String[] args )
	{
		System.out.println( findDisappearedNumbers( new int[]
		{ 4, 3, 2, 7, 8, 2, 3, 1 } ) );
	}

	public static List<Integer> findDisappearedNumbers( int[] nums )
	{
		for ( int num : nums )
		{
			int index = Math.abs( num );
			if ( nums[index - 1] > 0 )
				nums[index - 1] *= -1;
		}

		List<Integer> disappearedNums = new ArrayList<>();
		for ( int i = 0; i < nums.length; i++ )
		{
			if ( nums[i] > 0 )
				disappearedNums.add( i + 1 );
		}

		return disappearedNums;
	}
}