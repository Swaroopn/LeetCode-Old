package com.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
<<<<<<< HEAD
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
=======
import java.util.List;
import java.util.Map;
>>>>>>> 92b4f99a37690f59e5bc5d2fa42b104e3318f4bd

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
<<<<<<< HEAD
		if ( word.length() != pattern.length() )
			return false;

=======
>>>>>>> 92b4f99a37690f59e5bc5d2fa42b104e3318f4bd
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

<<<<<<< HEAD
		// values should be unique
		Set<Character> seen = new HashSet<>();
		for ( char ch : map.values() )
		{
			if ( !seen.add( ch ) )
				return false;

=======
		boolean[] seen = new boolean[26];
		for ( char ch : map.values() )
		{
			if ( seen[ch - 'a'] )
				return false;
			seen[ch - 'a'] = true;
>>>>>>> 92b4f99a37690f59e5bc5d2fa42b104e3318f4bd
		}

		return true;
	}
}
