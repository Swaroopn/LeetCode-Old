package com.leetcode.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight
{
	public static void main( String[] args )
	{
		System.out.println( lastStoneWeight( new int[]
		{ 2, 7, 4, 1, 8, 1 } ) );
		System.out.println( lastStoneWeightEff( new int[]
		{ 2, 7, 4, 1, 8, 1 } ) );
	}

	public static int lastStoneWeightEff( int[] stones )
	{
		if ( stones.length == 1 )
			return stones[0];

		PriorityQueue<Integer> queue = new PriorityQueue<Integer>( Collections.reverseOrder() );
		for ( int stone : stones )
			queue.add( stone );

		while ( queue.size() > 1 )
		{
			int x = queue.poll();
			int y = queue.poll();
			int diff = Math.abs( x - y );
			if ( diff != 0 )
				queue.add( diff );
		}

		return queue.size() == 0 ? 0 : queue.poll();
	}

	public static int lastStoneWeight( int[] stones )
	{
		if ( stones.length == 1 )
			return stones[0];

		int N = stones.length;
		for ( int i = 0; i < N - 1; i++ )
		{
			Arrays.parallelSort( stones );
			int max1 = stones[N - 1];
			int max2 = stones[N - 2];
			if ( max1 == max2 )
			{
				stones[N - 1] = 0;
				stones[N - 2] = 0;
			}
			else
			{
				stones[N - 1] = max1 - max2;
				stones[N - 2] = 0;
			}
		}

		Arrays.parallelSort( stones );
		return stones[N - 1];
	}
}
