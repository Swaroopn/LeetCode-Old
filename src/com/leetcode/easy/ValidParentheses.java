package com.leetcode.easy;

import java.util.Stack;

public class ValidParentheses
{
	public static void main( String[] args )
	{
		System.out.println( isValid( "({[]})()[]" ) );
	}

	public static boolean isValid( String expr )
	{
		char inChar;
		Stack<Character> stack = new Stack<>();

		for ( int i = 0; i < expr.length(); i++ )
		{
			inChar = expr.charAt( i );

			if ( Character.isLetter( inChar ) )
				continue;

			if ( ( inChar == '(' ) || ( inChar == '[' ) || ( inChar == '{' ) )
			{
				stack.push( inChar );
			}
			else
			{
				if ( stack.isEmpty() )
					return false;

				char outChar = stack.pop();
				if ( ( inChar == ')' && outChar != '(' ) || ( inChar == ']' && outChar != '[' ) || ( inChar == '}' && outChar != '{' ) )
					return false;
			}
		}

		if ( !stack.isEmpty() )
			return false;

		return true;
	}
}
