package com.leetcode.easy;

public class MaxNestingDepth_1614
{
	public static void main( String[] args )
	{
		System.out.println( maxDepth( "(1+(2*3)+((8)/4))+1" ) );
		System.out.println( maxDepth( "2" ) );
	}

	public static int maxDepth( String s )
	{
		int max = 0;
		int openB = 0;
		for ( char ch : s.toCharArray() )
		{
			if ( ch == '(' )
				openB++;
			else if ( ch == ')' )
			{
				max = Math.max( max, openB );
				openB--;
			}
		}

		return max;
	}
}
