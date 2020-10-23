package com.leetcode.easy;

public class RemoveDuplicatesFromLinkedList_83
{
	public ListNode deleteDuplicates( ListNode head )
	{
		if ( head == null )
			return null;

		int prevVal = head.val;
		ListNode prev = head;
		ListNode curr = head.next;
		while ( curr != null )
		{
			if ( curr.val == prevVal )
				prev.next = curr.next;
			else
			{
				prev = curr;
				prevVal = curr.val;
			}

			curr = curr.next;
		}

		return head;
	}
}
