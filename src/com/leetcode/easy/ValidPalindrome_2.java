package com.leetcode.easy;

public class ValidPalindrome_2
{
	public boolean validPalindrome( String s )
	{
		for ( int i = 0; i < s.length(); i++ )
		{
			if ( s.charAt( i ) != s.charAt( s.length() - i - 1 ) )
			{
				int j = s.length() - i - 1;
				return ( isPalinRange( s, i + 1, j ) || ( isPalinRange( s, i, j - 1 ) ) );
			}
		}

		return true;
	}

	public boolean isPalinRange( String s, int i, int j )
	{
		for ( int k = i; k <= i + ( j - i ) / 2; k++ )
		{
			if ( s.charAt( k ) != s.charAt( j - k + i ) )
				return false;
		}

		return true;
	}
}
