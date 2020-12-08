package com.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/*
 * Important
 */
public class LongestSubstrWithoutRepeatingChars
{
	public static void main( String[] args )
	{
		System.out.println( lengthOfLongestSubstring( "abcddefhijkk" ) );
	}

	public static int lengthOfLongestSubstring( String s )
	{
		int i = 0;
		int j = 0;
		Set<Character> set = new HashSet<>();
		int maxUniqueLen = 0;
		int N = s.length();

		while ( i < N && j < N )
		{
			char ch = s.charAt( j );
			if ( !set.contains( ch ) )
			{
				set.add( ch );
				j++;
				maxUniqueLen = Math.max( maxUniqueLen, j - i );
			}
			else
			{
				set.remove( s.charAt( i ) );
				i++;
			}
		}

		return maxUniqueLen;
	}
}