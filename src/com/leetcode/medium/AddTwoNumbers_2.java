package com.leetcode.medium;

/*
 * Important
 */
class ListNodeLeetCode
{
	int val;
	ListNodeLeetCode next;

	ListNodeLeetCode()
	{
	}

	ListNodeLeetCode( int val )
	{
		this.val = val;
	}

	ListNodeLeetCode( int val, ListNodeLeetCode next )
	{
		this.val = val;
		this.next = next;
	}
}

public class AddTwoNumbers_2
{
	public ListNodeLeetCode addTwoNumbers( ListNodeLeetCode l1, ListNodeLeetCode l2 )
	{
		ListNodeLeetCode dummyHead = new ListNodeLeetCode( 0 );
		ListNodeLeetCode third = dummyHead;
		ListNodeLeetCode first = l1;
		ListNodeLeetCode second = l2;
		int carry = 0;
		while ( first != null || second != null )
		{
			int sum = 0;

			if ( first != null )
				sum += first.val;
			if ( second != null )
				sum += second.val;

			sum += carry;
			carry = sum / 10;

			third.next = new ListNodeLeetCode( sum % 10 );
			third = third.next;

			if ( first != null )
				first = first.next;
			if ( second != null )
				second = second.next;
		}

		if ( carry > 0 )
			third.next = new ListNodeLeetCode( carry );

		return dummyHead.next;
	}
}
