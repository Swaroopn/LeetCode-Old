package com.leetcode.medium;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LargestNumber_179
{
	public static void main( String[] args )
	{
		System.out.println( largestNumber( new int[]
		{ 1, 2, 0, 0 } ) );
	}

	public static String largestNumber( int[] nums )
	{
		String[] strs = new String[nums.length];
		for ( int i = 0; i < nums.length; i++ )
			strs[i] = String.valueOf( nums[i] );

		Arrays.sort( strs, ( x, y ) -> {
			String xy = x + y;
			String yx = y + x;

			return xy.compareTo( yx ) > 0 ? -1 : 1;
		} );

		return Stream.of( strs ).collect( Collectors.joining() );
	}
}