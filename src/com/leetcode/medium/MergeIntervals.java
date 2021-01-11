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
<<<<<<< HEAD
				{ 1, 3 },
				{ 2, 6 },
				{ 8, 10 },
				{ 15, 18 } };

=======
			{ 1, 3 },
			{ 2, 6 },
			{ 8, 10 },
			{ 15, 18 }
		};
		
>>>>>>> 92b4f99a37690f59e5bc5d2fa42b104e3318f4bd
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
<<<<<<< HEAD
			if ( merged.isEmpty() || interval[0] > merged.getLast()[1] )
=======
			if ( merged.isEmpty() || merged.getLast()[1] < interval[0] )
>>>>>>> 92b4f99a37690f59e5bc5d2fa42b104e3318f4bd
				merged.add( interval );
			else
			{
				merged.getLast()[1] = Math.max( merged.getLast()[1], interval[1] );
			}
		}

		return merged.toArray( new int[merged.size()][] );
	}
}
