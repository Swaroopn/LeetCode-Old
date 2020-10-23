package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber
{
	public static void main( String[] args )
	{
		System.out.println( singleNumber( new int[]
		{ 2, 2, 1 } ) );
	}

	public static int singleNumber( int[] nums )
	{
		int uniqueSum = 0;
		int totalSum = 0;

		Set<Integer> set = new HashSet<>();
		for ( int num : nums )
		{
			if ( set.add( num ) )
				uniqueSum += num;

			totalSum += num;
		}

		return 2 * uniqueSum - totalSum;
	}
}
