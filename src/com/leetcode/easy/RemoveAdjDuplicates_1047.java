package com.leetcode.easy;

import java.util.Stack;

public class RemoveAdjDuplicates_1047
{
	public static void main( String[] args )
	{
		System.out.println( removeDuplicates( "abbaca" ) );
	}

	public static String removeDuplicates( String S )
	{
		Stack<Character> stack = new Stack<>();
		for ( char ch : S.toCharArray() )
		{
			if ( !stack.isEmpty() && stack.peek() == ch )
				stack.pop();
			else
				stack.push( ch );
		}

		StringBuilder result = new StringBuilder();
		while ( !stack.isEmpty() )
			result.append( stack.pop() );

		return result.reverse().toString();
	}
}
