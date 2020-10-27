package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome
{
	public static void main( String[] args )
	{
		System.out.println( longestPalindrome( "abccccdd" ) );
		System.out.println( longestPalindrome( "a" ) );
		System.out.println( longestPalindrome( "bb" ) );
	}

	public static int longestPalindrome( String s )
	{
		Set<Character> set = new HashSet<>();
		for ( char ch : s.toCharArray() )
		{
			if ( set.contains( ch ) )
			{
				set.remove( ch );
			}
			else
				set.add( ch );
		}

		return set.isEmpty() ? s.length() : s.length() - set.size() + 1;
	}
}
