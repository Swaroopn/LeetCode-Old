package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum
{
	public static void main( String[] args )
	{
		int[] nums = new int[]
		{ 2, 3, 4 };
		int target = 6;

		int[] indices = twoSum( nums, target );
		System.out.println( indices[0] + "," + indices[1] );
	}

	public static int[] twoSum( int[] nums, int target )
	{
		Map<Integer, Integer> map = new HashMap<>();

		for ( int i = 0; i < nums.length; i++ )
		{
			int diff = target - nums[i];
			if ( map.containsKey( diff ) )
				return new int[]
				{ map.get( diff ), i };

			map.put( nums[i], i );
		}

		throw new IllegalArgumentException( "No Such pair exists!!!" );
	}
}
