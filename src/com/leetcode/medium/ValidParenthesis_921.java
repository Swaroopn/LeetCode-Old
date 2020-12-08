package com.leetcode.medium;

public class ValidParenthesis_921
{
	public static void main( String[] args )
	{
		System.out.println( minAddToMakeValid( "())" ) );
		System.out.println( minAddToMakeValid( "(((" ) );
		System.out.println( minAddToMakeValid( "()" ) );
		System.out.println( minAddToMakeValid( "()))((" ) );
	}

	public static int minAddToMakeValid( String S )
	{
		int openCount = 0;
		int closeCount = 0;
		for ( char ch : S.toCharArray() )
		{
			if ( ch == '(' )
				openCount++;
			else if ( ch == ')' && openCount == 0 )
				closeCount++;
			else
				openCount--;
		}

		return Math.abs( openCount + closeCount );
	}
}
