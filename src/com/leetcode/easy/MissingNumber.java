package com.leetcode.easy;

import java.util.Arrays;
import java.util.BitSet;
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

		System.out.println( findMissingNumber( new int[]
		{ 9, 6, 4, 2, 3, 5, 7, 0, 1 } ) );

		System.out.println( findMissingNumber( new int[]
		{ 3, 7, 1, 2, 8, 4, 5 }, 8 ) );

		findMissingNumberEff( new int[]
		{ 1, 2, 3, 4, 5 }, 8 );
	}

	/*
	 * Amazon
	 */
	private static int findMissingNumber( int[] nums, int N )
	{
		int totalSum = N * ( N + 1 ) / 2;
		int tempSum = Arrays.stream( nums ).sum();

		return totalSum - tempSum;
	}

	/*
	 * Amazon
	 */
	private static void findMissingNumberEff( int[] nums, int N )
	{
		BitSet bitset = new BitSet( N );
		for ( int num : nums )
			bitset.set( num - 1 );

		int lastMissingIndex = 0;
		for ( int i = 0; i < N - nums.length; i++ )
		{
			lastMissingIndex = bitset.nextClearBit( lastMissingIndex );
			System.out.print( ++lastMissingIndex );
		}
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

	/*
	 * Will work only for 1 duplicate item
	 * and all other numbers are non-repeated
	 */
	public static int findMissingNumber( int[] nums )
	{
		int N = nums.length;
		int totalSum = N * ( N + 1 ) / 2;
		int tempSum = Arrays.stream( nums ).sum();

		return totalSum - tempSum;
	}
}
