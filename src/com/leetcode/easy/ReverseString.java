package com.leetcode.easy;

public class ReverseString
{
	public static void main( String[] args )
	{
		reverseString( new char[]
		{ 'H', 'a', 'n', ',', 'n', 'a', 'h' } );
	}

	public static void reverseString( char[] s )
	{
		int start = 0;
		int end = s.length - 1;

		while ( start < end )
		{
			if ( start < end )
			{
				char temp = s[start];
				s[start] = s[end];
				s[end] = temp;

				start++;
				end--;
			}
		}

		for ( char ch : s )
			System.out.print( ch + "" );
	}
}
