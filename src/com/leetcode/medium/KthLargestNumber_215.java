package com.leetcode.medium;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestNumber_215
{
	public static void main( String[] args )
	{
		int[] nums = new int[]
		{ 3, 2, 1, 5, 6, 4 };
		System.out.println( findKthLargest( nums, 2 ) );

		int[] nums2 = new int[]
		{ 3, 2, 1, 5, 6, 4 };
		System.out.println( findKthSmallest( nums2, 2 ) );
	}

	public static int findKthLargest( int[] nums, int k )
	{
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for ( int num : nums )
		{
			queue.add( num );

			if ( queue.size() > k )
				queue.poll();
		}

		return queue.poll();
	}

	public static int findKthSmallest( int[] nums, int k )
	{
		PriorityQueue<Integer> queue = new PriorityQueue<>( Comparator.reverseOrder() );
		for ( int num : nums )
		{
			queue.add( num );

			if ( queue.size() > k )
				queue.poll();
		}

		return queue.poll();
	}
}
