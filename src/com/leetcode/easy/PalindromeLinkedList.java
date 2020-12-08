package com.leetcode.easy;

import java.util.Stack;

public class PalindromeLinkedList
{
	// TODO: can't we iterate till half of LL ?
	public static boolean isPalindrome( Node head )
	{
		Stack<Integer> stack = new Stack<>();
		Node ptr = head;
		while ( ptr != null )
		{
			stack.push( ptr.val );
			ptr = ptr.next;
		}

		ptr = head;
		while ( ptr != null )
		{
			if ( ptr.val != stack.pop() )
				return false;

			ptr = ptr.next;
		}

		return true;
	}

	public static boolean isPalindromeEff( Node head )
	{
		Node fast = head;
		Node slow = head;
		Stack<Integer> stack = new Stack<>();
		while ( fast != null && fast.next != null )
		{
			stack.push( slow.val );

			fast = fast.next.next;
			slow = slow.next;
		}

		// Odd nodes
		if ( fast != null )
			slow = slow.next;

		while ( slow != null )
		{
			if ( stack.pop() != slow.val )
				return false;

			slow = slow.next;
		}

		return true;
	}
}
