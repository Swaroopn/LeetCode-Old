package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement
{
	public static void main( String[] args )
	{
		System.out.println( majorityElement( new int[]
		{ 6, 5, 5 } ) );
		System.out.println( majorityElementEff( new int[]
		{ 6, 5, 5 } ) );
	}

	public static int majorityElement( int[] nums )
	{
		int resultNum = -1;
		int max = Integer.MIN_VALUE;
		Map<Integer, Integer> map = new HashMap<>();
		for ( int item : nums )
		{
			map.put( item, map.getOrDefault( item, 0 ) + 1 );
			if ( map.get( item ) > max )
			{
				max = map.get( item );
				resultNum = item;
			}
		}

		return resultNum;
	}

	/*
	 * Since it is given in question that an element will
	 * always present with given criteria, just sort the
	 * array and return middle element
	 */
	public static int majorityElementEff( int[] nums )
	{
		Arrays.sort( nums );
		return nums[nums.length / 2];
	}
}
