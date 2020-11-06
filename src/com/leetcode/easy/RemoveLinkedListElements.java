package com.leetcode.easy;

public class RemoveLinkedListElements
{
	public ListNode removeElements( ListNode head, int val )
	{
		// used to skip starting nodes if they are equal to 'val'
		while ( head != null && head.val == val )
			head = head.next;

		ListNode node = head;
		while ( node != null && node.next != null )
		{
			if ( node.next.val == val )
			{
				node.next = node.next.next;
			}
			else
			{
				node = node.next;
			}
		}

		return head;
	}
}
