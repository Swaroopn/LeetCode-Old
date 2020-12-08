package com.leetcode.medium;

import java.util.Stack;

public class RevStrBetwenParen_1190
{
	public static void main( String[] args )
	{
		System.out.println( reverseParentheses( "u(love)i" ) );
	}

	public static String reverseParentheses( String s )
	{
		Stack<StringBuilder> levels = new Stack<>();
		levels.push( new StringBuilder() );
		for ( char ch : s.toCharArray() )
		{
			if ( ch == '(' )
				levels.push( new StringBuilder() );
			else if ( ch == ')' )
			{
				StringBuilder nestedLevel = levels.pop().reverse();
				levels.peek().append( nestedLevel );
			}
			else
				levels.peek().append( ch );
		}

		return levels.pop().toString();
	}
}
