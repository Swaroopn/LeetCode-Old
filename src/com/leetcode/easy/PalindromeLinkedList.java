package com.leetcode.easy;

import java.util.Stack;

public class PalindromeLinkedList
{
<<<<<<< HEAD
	// TODO: can't we iterate till half of LL ?
	public static boolean isPalindrome( Node head )
	{
		Stack<Integer> stack = new Stack<>();
		Node ptr = head;
=======
	public static boolean isPalindrome( ListNode head )
	{
		Stack<Integer> stack = new Stack<>();
		ListNode ptr = head;
>>>>>>> 92b4f99a37690f59e5bc5d2fa42b104e3318f4bd
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
<<<<<<< HEAD

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
=======
>>>>>>> 92b4f99a37690f59e5bc5d2fa42b104e3318f4bd
}
