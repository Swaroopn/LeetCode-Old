package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class LargestSubstring_1624
{
	public static void main( String[] args )
	{
		System.out.println( maxLengthBetweenEqualCharacters( "aa" ) );
		System.out.println( maxLengthBetweenEqualCharacters( "abcacded" ) );
		System.out.println( maxLengthBetweenEqualCharacters( "abcd" ) );
	}

	public static int maxLengthBetweenEqualCharacters( String s )
	{
		Map<Character, Integer> indexMap = new HashMap<>();
		int maxLen = -1;
		for ( int i = 0; i < s.length(); i++ )
		{
			char ch = s.charAt( i );
			if ( indexMap.containsKey( ch ) )
				maxLen = Math.max( maxLen, i - indexMap.get( ch ) - 1 );

			indexMap.put( ch, i );
		}

		return maxLen;
	}
}
