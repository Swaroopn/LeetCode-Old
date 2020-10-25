package com.leetcode.easy;

import java.util.Arrays;

public class ValidAnagram
{
	public static void main( String[] args )
	{
		System.out.println( isAnagram( "anagram", "nagrama" ) );
	}

	public static boolean isAnagram( String s, String t )
	{
		if ( s.length() == t.length() )
		{
			char[] sAsChar = s.toCharArray();
			char[] tAsChar = t.toCharArray();
			Arrays.sort( sAsChar );
			Arrays.sort( tAsChar );
			return Arrays.equals( sAsChar, tAsChar );
		}

		return false;
	}
}
