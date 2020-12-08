package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class RemoveZeroSumNodes_1171
{
	public ListNode removeZeroSumSublists( ListNode head )
	{
		ListNode dummyHead = new ListNode( 0 );
		dummyHead.next = head;

		Map<Integer, ListNode> map = new HashMap<>();
		map.put( 0, dummyHead );

		int sum = 0;
		ListNode curr = head;
		while ( curr != null )
		{
			sum += curr.val;

			if ( map.containsKey( sum ) )
			{
				ListNode temp = map.get( sum );
				ListNode nodeToBeRemoved = temp.next; // remove in-between zero sum nodes
				int tempSum = sum;
				while ( nodeToBeRemoved != curr )
				{
					tempSum += nodeToBeRemoved.val;
					map.remove( tempSum );

					nodeToBeRemoved = nodeToBeRemoved.next;
				}

				temp.next = curr.next;
			}
			else
			{
				map.put( sum, curr );
			}

			curr = curr.next;
		}

		return dummyHead.next;
	}
}
