package com.leetcode.medium;

public class SortList_148
{
	public ListNode sortList( ListNode head )
	{
		if ( head == null || head.next == null )
			return head;

		ListNode middleNode = getMiddleNode( head );
		ListNode nextOfMiddleNode = middleNode.next;

		middleNode.next = null;

		ListNode left = sortList( head );
		ListNode right = sortList( nextOfMiddleNode );

		return mergeSortedList( left, right );
	}

	public ListNode mergeSortedList( ListNode l1, ListNode l2 )
	{
		if ( l1 == null )
			return l2;
		if ( l2 == null )
			return l1;

		ListNode dummyHead = new ListNode( -1 );
		ListNode curr = dummyHead;
		while ( l1 != null && l2 != null )
		{
			if ( l1.val <= l2.val )
			{
				curr.next = l1;
				l1 = l1.next;
			}
			else
			{
				curr.next = l2;
				l2 = l2.next;
			}

			curr = curr.next;
		}

		curr.next = l1 != null ? l1 : l2;
		return dummyHead.next;
	}

	public ListNode getMiddleNode( ListNode head )
	{
		ListNode prev = null;
		ListNode slow = head;
		ListNode fast = head;
		while ( fast != null && fast.next != null )
		{
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}

		return prev;
	}
}
