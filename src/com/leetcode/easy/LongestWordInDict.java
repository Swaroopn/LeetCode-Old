package com.leetcode.easy;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestWordInDict
{
	public static void main( String[] args )
	{
		String[] arr =
		{ "worl", "w", "a", "wo", "world", "wor", "swaroop" };
		System.out.println( longestWord( arr ) );
	}

	public static String longestWord( String[] words )
	{
		Set<String> wordset = Arrays.stream( words ).collect( Collectors.toSet() );

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
