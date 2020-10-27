package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern
{
	public static void main( String[] args )
	{
		System.out.println( wordPattern( "abc", "abc" ) );
	}

	public static boolean wordPattern( String pattern, String s )
	{
		String[] words = s.split( " " );

		if ( pattern.length() != words.length )
			return false;

		Map<Character, String> map = new HashMap<>();
		for ( int i = 0; i < pattern.length(); i++ )
		{
			char ch = pattern.charAt( i );

			if ( !map.containsKey( ch ) )
			{
				if ( map.containsValue( words[i] ) )
					return false;

				map.put( ch, words[i] );
			}
			else
			{
				if ( !map.get( ch ).equals( words[i] ) )
					return false;
			}
		}

		return true;
	}
}
