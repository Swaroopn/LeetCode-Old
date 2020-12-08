package com.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindAndReplacePattern_890
{
	public static void main( String[] args )
	{
		System.out.println( findAndReplacePattern( new String[]
		{ "abc", "deq", "mee", "aqq", "dkd", "ccc" }, "abb" ) );
	}

	public static List<String> findAndReplacePattern( String[] words, String pattern )
	{
		List<String> matchingWords = new ArrayList<>();
		for ( String word : words )
		{
			if ( match( word, pattern ) )
				matchingWords.add( word );
		}

		return matchingWords;
	}

	private static boolean match( String word, String pattern )
	{
		if ( word.length() != pattern.length() )
			return false;

		Map<Character, Character> map = new HashMap<>();
		for ( int i = 0; i < word.length(); i++ )
		{
			char w = word.charAt( i );
			char p = pattern.charAt( i );
			if ( !map.containsKey( w ) )
				map.put( w, p );
			else if ( map.get( w ) != p )
				return false;
		}

		// values should be unique
		Set<Character> seen = new HashSet<>();
		for ( char ch : map.values() )
		{
			if ( !seen.add( ch ) )
				return false;

		}

		return true;
	}
}
