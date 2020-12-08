package com.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFreqWords_692
{
	public static void main( String[] args )
	{
		System.out.println( topKFrequent( new String[]
		{ "i", "love", "leetcode", "i", "love", "coding" }, 2 ) );
	}

	public static List<String> topKFrequent( String[] words, int k )
	{
		Map<String, Integer> map = new HashMap<>();
		for ( String word : words )
			map.put( word, map.getOrDefault( word, 0 ) + 1 );

		List<String> list = new ArrayList<>( map.keySet() );
		list.sort( ( word1, word2 ) -> {
			return map.get( word1 ) == map.get( word2 ) ? word1.compareTo( word2 ) : map.get( word2 ) - map.get( word1 );
		} );

		return list.subList( 0, k );
	}
}
