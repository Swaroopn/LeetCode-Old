package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SearchSuggestionsSystem_1268
{
	public static void main( String[] args )
	{
		System.out.println( suggestedProducts( new String[]
		{ "mobile", "mouse", "moneypot", "monitor", "mousepad" }, "mouse" ) );

		System.out.println( suggestedProducts( new String[]
		{ "havana" }, "havana" ) );

		System.out.println( suggestedProducts( new String[]
		{ "bags", "baggage", "banner", "box", "cloths" }, "bags" ) );

		System.out.println( suggestedProducts( new String[]
		{ "havana" }, "leetcode" ) );
	}

	public static List<List<String>> suggestedProducts( String[] products, String searchWord )
	{
		final int maxSuggestion = 3;
		List<List<String>> suggestionList = new ArrayList<>();

		Arrays.sort( products );
		for ( int i = 1; i <= searchWord.length(); i++ )
		{
			String keyword = searchWord.substring( 0, i );
			List<String> list = new ArrayList<>();
			for ( String product : products )
			{
				if ( product.startsWith( keyword ) )
					list.add( product );
			}

			suggestionList.add( list.stream().limit( maxSuggestion ).collect( Collectors.toList() ) );
		}

		return suggestionList;
	}
}
