package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOf2Arrays
{
	public static void main( String[] args )
	{
		intersection( new int[]
		{ 1, 2, 2, 1 }, new int[]
		{ 2, 2, } );
	}

	public static int[] intersection( int[] nums1, int[] nums2 )
	{
		Set<Integer> set1 = new HashSet<>();
		for ( int num : nums1 )
			set1.add( num );

		Set<Integer> set2 = new HashSet<>();
		for ( int num : nums2 )
			set2.add( num );

		set1.retainAll( set2 );
		int[] output = new int[set1.size()];
		int index = 0;
		for ( int num : set1 )
			output[index++] = num;

		return output;
	}
}
