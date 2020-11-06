package com.leetcode.medium;

public class Anagrams_1347
{
	public static void main( String[] args )
	{
		System.out.println( minSteps( "anagram", "mangaar" ) );
	}

	public static int minSteps( String s, String t )
	{
		int count = 0;
		int[] alpha = new int[26];
		for ( char ch : s.toCharArray() )
		{
			alpha[ch - 'a']++;
		}
		for ( char ch : t.toCharArray() )
		{
			--alpha[ch - 'a'];

			if ( alpha[ch - 'a'] < 0 )
				count++;
		}

		return count;
	}
}
