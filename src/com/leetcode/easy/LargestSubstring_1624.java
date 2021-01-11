package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class LargestSubstring_1624
{
	public static void main( String[] args )
	{
		System.out.println( maxLengthBetweenEqualCharacters( "aa" ) );
<<<<<<< HEAD
		System.out.println( maxLengthBetweenEqualCharacters( "abcacded" ) );
=======
		System.out.println( maxLengthBetweenEqualCharacters( "abca" ) );
>>>>>>> 92b4f99a37690f59e5bc5d2fa42b104e3318f4bd
		System.out.println( maxLengthBetweenEqualCharacters( "abcd" ) );
	}

	public static int maxLengthBetweenEqualCharacters( String s )
	{
<<<<<<< HEAD
		Map<Character, Integer> indexMap = new HashMap<>();
=======
		Map<Character, Integer> map = new HashMap<>();
>>>>>>> 92b4f99a37690f59e5bc5d2fa42b104e3318f4bd
		int maxLen = -1;
		for ( int i = 0; i < s.length(); i++ )
		{
			char ch = s.charAt( i );
<<<<<<< HEAD
			if ( indexMap.containsKey( ch ) )
				maxLen = Math.max( maxLen, i - indexMap.get( ch ) - 1 );

			indexMap.put( ch, i );
=======
			if ( map.containsKey( ch ) )
				maxLen = Math.max( maxLen, i - map.get( ch ) - 1 );
			else
				map.put( ch, i );
>>>>>>> 92b4f99a37690f59e5bc5d2fa42b104e3318f4bd
		}

		return maxLen;
	}
}
