package com.leetcode.easy;

public class FindTheDifference
{
	public static void main( String[] args )
	{
		System.out.println( findTheDifference( "ac", "bb" ) );
	}

	public static char findTheDifference( String s, String t )
	{
		int[] alpha = new int[26];
		s = s.toLowerCase();
		t = t.toLowerCase();

		for ( char ch : s.toCharArray() )
		{
			alpha[ch - 'a']++;
		}

		for ( char ch : t.toCharArray() )
		{
			alpha[ch - 'a']--;

			if ( alpha[ch - 'a'] < 0 )
				return ch;
		}

		return ' ';
	}
}
