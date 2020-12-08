package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/*
 * Important
 */
public class GenerateParenthesis_22
{
	public static void main( String[] args )
	{
		System.out.println( generateParenthesis( 3 ) );
	}

	public static List<String> generateParenthesis( int n )
	{
		List<String> ans = new ArrayList<>();
		backtrack( ans, "", 0, 0, n );
		return ans;
	}

	public static void backtrack( List<String> ans, String expr, int open, int close, int max )
	{
		if ( expr.length() == max * 2 )
		{
			ans.add( expr );
			return;
		}

		if ( open < max )
			backtrack( ans, expr + "(", open + 1, close, max );
		if ( close < open )
			backtrack( ans, expr + ")", open, close + 1, max );
	}
}
