package com.leetcode.medium;

import java.util.Stack;

public class AddTwoNumbers_445
{
	public ListNode addTwoNumbers( ListNode l1, ListNode l2 )
	{
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();

		ListNode first = l1;
		while ( first != null )
		{
			stack1.push( first.val );
			first = first.next;
		}

		ListNode second = l2;
		while ( second != null )
		{
			stack2.push( second.val );
			second = second.next;
		}

		ListNode result = null;
		int carry = 0;
		while ( !stack1.isEmpty() || !stack2.isEmpty() )
		{
			int sum = 0;

			if ( !stack1.isEmpty() )
				sum += stack1.pop();
			if ( !stack2.isEmpty() )
				sum += stack2.pop();

			sum += carry;
			ListNode temp = new ListNode( sum % 10 );
			temp.next = result;
			result = temp;

			carry = sum / 10;
		}

		if ( carry > 0 )
		{
			ListNode temp = new ListNode( carry );
			temp.next = result;
			result = temp;
		}

		return result;
	}
}
