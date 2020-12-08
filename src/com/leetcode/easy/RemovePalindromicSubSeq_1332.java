package com.leetcode.easy;

public class RemovePalindromicSubSeq_1332
{
	public int removePalindromeSub( String s )
	{
		if ( s.isEmpty() )
			return 0;
		if ( isPalindrome( s ) )
			return 1;
		return 2;
	}

	public boolean isPalindrome( String s )
	{
		int N = s.length();
		for ( int i = 0; i < N / 2; i++ )
		{
			if ( s.charAt( i ) != s.charAt( N - i - 1 ) )
				return false;
		}

		return true;
	}
}
