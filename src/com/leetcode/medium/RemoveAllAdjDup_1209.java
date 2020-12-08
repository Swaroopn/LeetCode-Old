package com.leetcode.medium;

import java.util.Stack;

public class RemoveAllAdjDup_1209
{
	public static void main( String[] args )
	{
		System.out.println( removeDuplicates( "deeedbbcccbdaa", 3 ) );
	}

	public static String removeDuplicates( String s, int k )
	{
		Stack<Character> charStack = new Stack<>();
		Stack<Integer> countStack = new Stack<>();

		for ( char ch : s.toCharArray() )
		{
			if ( !charStack.isEmpty() && ch == charStack.peek() )
				countStack.push( countStack.peek() + 1 );
			else
				countStack.push( 1 );

			charStack.push( ch );

			if ( countStack.peek() == k )
			{
				for ( int i = 0; i < k; i++ )
				{
					charStack.pop();
					countStack.pop();
				}
			}
		}

		StringBuilder result = new StringBuilder();
		while ( !charStack.isEmpty() )
			result.append( charStack.pop() );

		return result.reverse().toString();
	}
}