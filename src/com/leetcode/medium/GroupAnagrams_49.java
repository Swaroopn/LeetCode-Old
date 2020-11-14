package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams_49
{
	public static void main( String[] args )
	{
		String[] strs =
		{ "are", "bat", "ear", "code", "tab", "era" };
		System.out.println( groupAnagrams( strs ).toString() );
	}

	public static List<List<String>> groupAnagrams( String[] strs )
	{
		Map<String, List<String>> ans = new HashMap<>();

		if ( strs.length == 0 )
			return new ArrayList<>( ans.values() );

		for ( String str : strs )
		{
			char[] ca = str.toCharArray();
			Arrays.parallelSort( ca );
			String key = String.valueOf( ca );

			ans.computeIfAbsent( key, ( k -> new ArrayList<>() ) );
			ans.get( key ).add( str );
		}

		return new ArrayList<>( ans.values() );
	}
}
