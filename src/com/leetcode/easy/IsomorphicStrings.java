package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings
{
	public static void main( String[] args )
	{
		System.out.println( isIsomorphic( "ab", "aa" ) );
	}

	public static boolean isIsomorphic( String s, String t )
	{
		if ( s.length() != t.length() )
			return false;

		Map<Character, Character> map = new HashMap<>();
		for ( int i = 0; i < s.length(); i++ )
		{
			char ch1 = s.charAt( i );
			char ch2 = t.charAt( i );

			if ( !map.containsKey( ch1 ) )
			{
				if ( map.containsValue( ch2 ) )
					return false;

				map.put( ch1, ch2 );
			}
			else if ( ch2 != map.get( ch1 ) )
			{
				return false;
			}
		}

		return true;
	}

	/*
	public static boolean isIsomorphicIncomplete( String s, String t )
	{
		if ( s.length() != t.length() )
			return false;
	
		Set<Character> processedChars = new HashSet<>();
		for ( int i = 0; i < s.length(); i++ )
		{
			char ch = s.charAt( i );
			if ( !processedChars.contains( ch ) )
			{
				processedChars.add( ch );
				String temp = t.substring( i ).replace( t.charAt( i ), ch );
				t = t.substring( 0, i ) + temp;
				// t = t.replace( t.charAt( i ), ch );
			}
		}
	
		return s.equals( t );
	}
	*/
}
