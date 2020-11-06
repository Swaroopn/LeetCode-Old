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
		int count = 0;
		int closeCount = 0;
		for ( char ch : S.toCharArray() )
		{
			if ( ch == '(' )
				count++;
			else if ( ch == ')' && count == 0 )
				closeCount++;
			else
				count--;
		}

		return Math.abs( count + closeCount );
	}
}
