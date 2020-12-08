package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArrayInOrder_1389
{
	public static void main( String[] args )
	{
		int[] nums = new int[]	{ 0, 1, 2, 3, 4 };
		int[] index = new int[]	{ 0, 1, 2, 2, 1 };
		createTargetArray( nums, index );
	}

	public static int[] createTargetArray( int[] nums, int[] index )
	{
		List<Integer> list = new ArrayList<>();
		for ( int i = 0; i < nums.length; i++ )
			list.add( index[i], nums[i] );

		return list.stream().mapToInt( i -> i ).toArray();
	}
}
