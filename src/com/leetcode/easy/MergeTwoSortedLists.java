package com.leetcode.easy;

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

public class MergeTwoSortedLists
{
	public ListNode mergeTwoLists( ListNode l1, ListNode l2 )
	{
		ListNode dummyNode = new ListNode( 0 );
		ListNode head = dummyNode;

		while ( l1 != null && l2 != null )
		{
			if ( l1.val < l2.val )
			{
				head.next = l1;
				l1 = l1.next;
			}
			else
			{
				head.next = l2;
				l2 = l2.next;
			}

			head = head.next;
		}

		// used for left-over nodes
		if ( l1 != null )
			head.next = l1;

		if ( l2 != null )
			head.next = l2;

		return dummyNode.next;
	}
}
