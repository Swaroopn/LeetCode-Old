package com.leetcode.easy;

public class ImplementStrStr
{
	public static void main( String[] args )
	{
		System.out.println( strStr( "hello", "sw" ) );
	}

	public static int strStr( String haystack, String needle )
	{
		if ( needle.isEmpty() || haystack.equals( needle ) )
			return 0;

		for ( int i = 0; i <= haystack.length() - needle.length(); i++ )
		{
			String evalString = haystack.substring( i, i + needle.length() );
			if ( evalString.equals( needle ) )
				return i;
		}

		return -1;
	}
}
