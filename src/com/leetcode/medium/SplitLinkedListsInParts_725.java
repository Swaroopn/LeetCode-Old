package com.leetcode.medium;

public class SplitLinkedListsInParts_725
{
	public ListNode[] splitListToParts( ListNode root, int k )
	{
		ListNode curr = root;
		int N = getListSize( curr );
		int width = N / k;
		int rem = N % k;

		ListNode[] ans = new ListNode[k];
		curr = root;
		for ( int i = 0; i < k; i++ )
		{
			ListNode head = curr;
			for ( int j = 0; j < width + ( i < rem ? 1 : 0 ) - 1; j++ )
			{
				if ( curr != null )
					curr = curr.next;
			}

			if ( curr != null )
			{
				ListNode prev = curr;
				curr = curr.next;
				prev.next = null;
			}

			ans[i] = head;
		}

		return ans;
	}

	private int getListSize( ListNode head )
	{
		int count = 0;

		while ( head != null )
		{
			count++;
			head = head.next;
		}

		return count;
	}
}
