package com.leetcode.medium;

class ListNode
{
	int val;
	ListNode next;

	ListNode()
	{
	}

	ListNode( int val )
	{
		this.val = val;
	}

	ListNode( int val, ListNode next )
	{
		this.val = val;
		this.next = next;
	}
}

public class RemoveNthNodeFromEndOfLL_19
{
	public ListNode removeNthFromEnd( ListNode head, int n )
	{
		ListNode dummy = new ListNode( 0 );
		dummy.next = head;
		ListNode first = dummy;
		ListNode second = dummy;
		// Advances first pointer so that the gap between first and second is n nodes apart
		for ( int i = 0; i <= n; i++ )
		{
			first = first.next;
		}
		
		// Move first to the end, maintaining the gap
		while ( first != null )
		{
			first = first.next;
			second = second.next;
		}
		
		second.next = second.next.next;
		return dummy.next;
	}
}