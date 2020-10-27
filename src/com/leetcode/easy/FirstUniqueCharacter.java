package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter
{
	public static void main( String[] args )
	{
		System.out.println( firstUniqChar( "leetcode" ) );
	}

	public static int firstUniqChar( String s )
	{
		Map<Character, Integer> count = new HashMap<Character, Integer>();
		int n = s.length();
		for ( int i = 0; i < n; i++ )
		{
			char c = s.charAt( i );
			count.put( c, count.getOrDefault( c, 0 ) + 1 );
		}

		for ( int i = 0; i < n; i++ )
		{
			if ( count.get( s.charAt( i ) ) == 1 )
				return i;
		}

		return -1;
	}
}
