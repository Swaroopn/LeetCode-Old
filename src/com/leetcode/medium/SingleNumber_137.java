package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber_137
{
	public static void main( String[] args )
	{
		System.out.println( singleNumber( new int[]
		{ 0, 1, 0, 1, 0, 1, 99 } ) );
	}

	public static int singleNumber( int[] nums )
	{
		Map<Integer, Integer> countMap = new HashMap<>();
		for ( int num : nums )
		{
			countMap.put( num, countMap.getOrDefault( num, 0 ) + 1 );
		}

		for ( int key : countMap.keySet() )
		{
			if ( countMap.get( key ) == 1 )
				return key;
		}

		return -1;
	}
}
