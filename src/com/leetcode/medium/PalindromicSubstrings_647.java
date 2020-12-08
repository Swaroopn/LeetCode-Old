package com.leetcode.medium;

public class PalindromicSubstrings_647
{
	public static void main( String[] args )
	{
		System.out.println( countSubstrings( "abba" ) );
		System.out.println( countSubstringsEff( "abba" ) );
	}

	/*
	 * 1 - Checking if Substrings are palindrome
	 */
	public static int countSubstrings( String s )
	{
		int count = 0;

		for ( int start = 0; start < s.length(); start++ )
		{
			for ( int end = start; end < s.length(); end++ )
			{
				if ( isPalindrome( s.substring( start, end + 1 ) ) )
					count++;
			}
		}

		return count;
	}

	private static boolean isPalindrome( String str )
	{
		if ( str.length() == 1 )
			return true;

		int start = 0;
		int end = str.length() - 1;

		while ( start < end )
		{
			if ( str.charAt( start ) != str.charAt( end ) )
				return false;

			start++;
			end--;
		}

		return true;
	}

	/*
	 * 2. Dynamic Programming
	 */
	public static int countSubstringsEff( String s )
	{
		int N = s.length();
		int count = 0;

		if ( N <= 0 )
			return 0;

		boolean[][] dp = new boolean[N][N];

		// Single letter
		for ( int i = 0; i < N; i++ )
		{
			dp[i][i] = true;
			count++;
		}

		// double letters
		for ( int i = 0; i < N - 1; i++ )
		{
			if ( s.charAt( i ) == s.charAt( i + 1 ) )
			{
				dp[i][i + 1] = true;
				count++;
			}
		}

		// 3 letters and above
		for ( int len = 3; len <= N; len++ )
		{
			for ( int start = 0, end = len + start - 1; end < N; start++, end++ )
			{
				dp[start][end] = dp[start + 1][end - 1] && s.charAt( start ) == s.charAt( end );
				if ( dp[start][end] )
					count++;
			}
		}

		return count;
	}
}
