package com.leetcode.easy;

public class ConsistentStrings_1684
{
	public static void main( String[] args )
	{
		System.out.println( countConsistentStrings( "ab", new String[]
		{ "ad", "bd", "aaab", "baa", "badab" } ) );

		System.out.println( countConsistentStrings( "abc", new String[]
		{ "a", "b", "c", "ab", "ac", "bc", "abc" } ) );
	}

	public static int countConsistentStrings( String allowed, String[] words )
	{
		int count = 0;
		int[] allowedAlpha = new int[26];
		for ( char ch : allowed.toCharArray() )
		{
			allowedAlpha[ch - 'a']++;
		}

		for ( String word : words )
		{
			for ( char ch : word.toCharArray() )
			{
				if ( allowedAlpha[ch - 'a'] == 0 )
				{
					count++;
					break;
				}
			}
		}

		return words.length - count;
	}
}
