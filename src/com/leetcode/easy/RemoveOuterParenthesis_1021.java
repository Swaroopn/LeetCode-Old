package com.leetcode.easy;

import java.util.Stack;

public class RemoveOuterParenthesis_1021
{
	public static void main( String[] args )
	{
		System.out.println( removeOuterParentheses( "(()())(())" ) );
		System.out.println( removeOuterParentheses( "()()" ) );
	}

	public static String removeOuterParentheses( String S )
	{
		StringBuilder result = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		int startIndex = 0;
		for ( int i = 0; i < S.length(); i++ )
		{
			char ch = S.charAt( i );

			if ( ch == '(' )
				stack.push( ch );
			else if ( ch == ')' )
				stack.pop();

			if ( stack.isEmpty() )
			{
				result.append( S.substring( startIndex + 1, i ) );
				startIndex = i + 1;
			}
		}

		return result.toString();
	}
}
