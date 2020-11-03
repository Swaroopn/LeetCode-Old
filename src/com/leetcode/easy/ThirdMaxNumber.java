package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThirdMaxNumber
{
	public static void main( String[] args )
	{
		System.out.println( thirdMax( new int[]
		{ 3, 2, 1 } ) );
	}

	public static int thirdMax( int[] nums )
	{
		Arrays.sort( nums );

		List<Integer> list = new ArrayList<>();
		for ( int num : nums )
		{
			if ( !list.contains( num ) )
				list.add( num );
		}

		int N = list.size();

		if ( N < 3 )
			return list.get( N - 1 );

		return list.get( N - 3 );
	}
}
