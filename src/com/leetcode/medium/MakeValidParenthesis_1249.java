package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MakeValidParenthesis_1249
{
	public static void main( String[] args )
	{
		System.out.println( minRemoveToMakeValid( "lee(t(c)o)de)" ) );
		System.out.println( minRemoveToMakeValid( "a)b(c)d" ) );
		System.out.println( minRemoveToMakeValid( "))((" ) );
		System.out.println( minRemoveToMakeValid( "(a(b(c)d)" ) );
	}

	public static String minRemoveToMakeValid( String s )
	{
		List<Integer> invalidBracketIndices = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		char[] cArr = s.toCharArray();
		for ( int i = 0; i < cArr.length; i++ )
		{
			char ch = cArr[i];

			if ( ch == '(' )
				stack.push( i );
			else if ( ch == ')' )
			{
				if ( stack.isEmpty() )
					invalidBracketIndices.add( i );
				else
					stack.pop();
			}
		}

		while ( !stack.isEmpty() )
			invalidBracketIndices.add( stack.pop() );

		StringBuilder result = new StringBuilder();
		for ( int i = 0; i < cArr.length; i++ )
		{
			if ( !invalidBracketIndices.contains( i ) )
				result.append( cArr[i] );
		}

		return result.toString();
	}
}
