package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class LongestWordInDict
{
	public static void main( String[] args )
	{
		String[] arr =
		{ "w", "a", "wo", "worl", "world", "wor", "swaroop" };
		System.out.println( longestWord( arr ) );
	}

	public static String longestWord( String[] words )
	{
		Set<String> wordset = new HashSet<>();
		for ( String word : words )
			wordset.add( word );

		String ans = "";
		for ( String word : words )
		{
			if ( word.length() > ans.length() || ( word.length() == ans.length() && word.compareTo( ans ) < 0 ) )
			{
				boolean good = true;
				for ( int lastIndex = 1; lastIndex < word.length(); ++lastIndex )
				{
					if ( !wordset.contains( word.substring( 0, lastIndex ) ) )
					{
						good = false;
						break;
					}
				}

				if ( good )
					ans = word;
			}
		}

		return ans;
	}
}
