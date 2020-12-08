package com.leetcode.easy;

import java.util.Stack;

public class PalindromeLinkedList
{
	public static boolean isPalindrome( ListNode head )
	{
		Stack<Integer> stack = new Stack<>();
		ListNode ptr = head;
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
}
