package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks
{
	public static void main( String[] args )
	{
		findRelativeRanks( new int[]
		{ 10, 3, 8, 9, 4 } );
	}

	public static String[] findRelativeRanks( int[] nums )
	{
		int N = nums.length;

		int[] temp = new int[N];
		for ( int i = 0; i < N; i++ )
			temp[i] = nums[i];

		Arrays.parallelSort( temp );

		Map<Integer, String> rankMap = new HashMap<>();
		for ( int i = 0; i < N; i++ )
		{
			if ( i == N - 1 )
				rankMap.put( temp[i], "Gold Medal" );
			else if ( i == N - 2 )
				rankMap.put( temp[i], "Silver Medal" );
			else if ( i == N - 3 )
				rankMap.put( temp[i], "Bronze Medal" );
			else
				rankMap.put( temp[i], String.valueOf( N - i ) );
		}

		String[] ranks = new String[N];
		for ( int i = 0; i < N; i++ )
		{
			ranks[i] = rankMap.get( nums[i] );
		}

		return ranks;
	}

}
