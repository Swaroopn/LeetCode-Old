package com.leetcode.easy;

import java.util.PriorityQueue;

public class KthLargestElementInStream_703
{
	PriorityQueue<Integer> queue;
	int k;

	public KthLargestElementInStream_703( int k, int[] nums )
	{
		queue = new PriorityQueue<>();
		this.k = k;
		init( nums );
	}

	public void init( int[] nums )
	{
		for ( int num : nums )
		{
			queue.add( num );
			if ( queue.size() > k )
				queue.poll();
		}
	}

	public int add( int val )
	{
		queue.add( val );
		if ( queue.size() > k )
			queue.poll();

		return queue.peek();
	}
}
