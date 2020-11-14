package com.leetcode.easy;

import java.util.Stack;

public class BackspaceStringCompare_844
{
	public static void main( String[] args )
	{
		System.out.println( backspaceCompare( "y#fo##f", "y#f#o##f" ) );
	}

	public static boolean backspaceCompare( String S, String T )
	{
		return parse( S ).equals( parse( T ) );
	}

	public static String parse( String str )
	{
		Stack<Character> stack = new Stack<>();
		for ( char ch : str.toCharArray() )
		{
			if ( ch != '#' )
				stack.push( ch );
			else if ( !stack.isEmpty() )
				stack.pop();
		}

		return String.valueOf( stack );
	}
}
