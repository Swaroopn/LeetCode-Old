package com.leetcode.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class MergeIntervals
{
	public static void main( String[] args )
	{
		int[][] intervals =
		{
				{ 1, 3 },
				{ 2, 6 },
				{ 8, 10 },
				{ 15, 18 } };

		merge( intervals );
	}

	public static int[][] merge( int[][] intervals )
	{
		Collections.sort( Arrays.asList( intervals ), ( int[] a, int[] b ) -> {
			return a[0] < b[0] ? -1 : a[0] == b[0] ? 0 : 1;
		} );

		LinkedList<int[]> merged = new LinkedList<>();
		for ( int[] interval : intervals )
		{
			if ( merged.isEmpty() || interval[0] > merged.getLast()[1] )
				merged.add( interval );
			else
			{
				merged.getLast()[1] = Math.max( merged.getLast()[1], interval[1] );
			}
		}

		return merged.toArray( new int[merged.size()][] );
	}
}
