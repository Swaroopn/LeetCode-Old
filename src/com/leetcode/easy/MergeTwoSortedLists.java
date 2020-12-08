package com.leetcode.easy;

class Node
{
	int val;
	Node next;

	Node()
	{
	}

	Node( int val )
	{
		this.val = val;
	}

	Node( int val, Node next )
	{
		this.val = val;
		this.next = next;
	}
}

public class MergeTwoSortedLists
{
	public Node mergeTwoLists( Node l1, Node l2 )
	{
		if ( l1 == null )
			return l2;
		else if ( l2 == null )
			return l1;

		Node dummyNode = new Node( -1 );
		Node curr = dummyNode;

		while ( l1 != null && l2 != null )
		{
			if ( l1.val < l2.val )
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

		// used for left-over nodes
		curr.next = l1 != null ? l1 : l2;
		return dummyNode.next;
	}
}
