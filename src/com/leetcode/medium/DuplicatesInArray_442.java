package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesInArray_442
{
	public static void main( String[] args )
	{
		System.out.println( findDuplicates( new int[]
		{ 4, 3, 2, 7, 8, 2, 3, 1 } ) );
	}

	public static List<Integer> findDuplicates( int[] nums )
	{
		List<Integer> list = new ArrayList<>();

		for ( int num : nums )
		{
			int temp = Math.abs( num );
			if ( nums[temp - 1] > 0 )
				nums[temp - 1] = -nums[temp - 1];
			else
				list.add( temp );
		}

		return list;
	}
}
