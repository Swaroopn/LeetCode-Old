package com.leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;

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

		Arrays.sort( strs, new Comparator<String>()
		{
			@Override
			public int compare( String x, String y )
			{
				String xy = x + y;
				String yx = y + x;
				return xy.compareTo( yx ) > 0 ? -1 : 1;
			}
		} );

		if ( "0".equalsIgnoreCase( strs[0] ) )
			return "0";

		StringBuilder result = new StringBuilder();
		for ( String num : strs )
			result.append( num );

		return result.toString();
	}
}
