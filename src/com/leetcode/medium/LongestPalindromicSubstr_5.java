package com.leetcode.medium;

public class LongestPalindromicSubstr_5
{
	public String longestPalindrome( String word )
	{
		int N = word.length();
		boolean palindrome[][] = new boolean[N][N];

		// For single letter palindrome
		for ( int i = 0; i < N; i++ )
			palindrome[i][i] = true;

		String str = "";

		// For 2 letter palindrome
		for ( int i = 0; i < N - 1; i++ )
		{
			if ( word.charAt( i ) == word.charAt( i + 1 ) )
			{
				palindrome[i][i + 1] = true;
				String temp = word.substring( i, i + 2 );
				if ( temp.length() > str.length() )
					str = temp;
			}
		}

		// Finding Palindrome for string length > 3 to n
		for ( int curLen = 3; curLen <= N; curLen++ )
		{
			for ( int start = 0; start <= N - curLen; start++ )
			{
				int end = start + curLen - 1;
				if ( word.charAt( start ) == word.charAt( end ) && palindrome[start + 1][end - 1] )
				{
					palindrome[start][end] = true;
					String temp = word.substring( start, end + 1 );
					if ( temp.length() > str.length() )
						str = temp;
				}
			}
		}

		if ( str.isEmpty() )
			return word.charAt( 0 ) + "";

		return str;
	}
}
