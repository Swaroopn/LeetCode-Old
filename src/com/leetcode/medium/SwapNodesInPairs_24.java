package com.leetcode.medium;

/*
 * Same as reverseInKSize( k )
 */
public class SwapNodesInPairs_24
{
	public ListNode swapPairs( ListNode head )
	{
		return swapPairs( head, 2 );
	}

	public ListNode swapPairs( ListNode head, int k )
	{
		ListNode prev = null;
		ListNode curr = head;
		ListNode next = null;

		int count = 0;
		while ( count < k && curr != null )
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;

			count++;
		}

		if ( next != null )
			head.next = swapPairs( next, k );

		return prev;
	}
}
