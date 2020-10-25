package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber
{
	public static void main( String[] args )
	{
		System.out.println( missingNumber( new int[]
		{ 3, 0, 1 } ) );
		System.out.println( missingNumber( new int[]
		{ 9, 6, 4, 2, 3, 5, 7, 0, 1 } ) );
	}

	public static int missingNumber( int[] nums )
	{
		Set<Integer> set = new HashSet<>();
		for ( int num : nums )
			set.add( num );

		for ( int i = 0; i <= nums.length; i++ )
		{
			if ( !set.contains( i ) )
				return i;
		}

		return -1;
	}
}
