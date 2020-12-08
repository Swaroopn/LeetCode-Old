package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWords_151
{
	public static void main( String[] args )
	{
		System.out.println( reverseWords( "a good   example" ) );
	}

	public static String reverseWords( String s )
	{
		s = s.trim();
		int N = s.length();
		List<String> words = new ArrayList<>();
		String temp = "";
		for ( int start = 0; start < N; start++ )
		{
			char ch = s.charAt( start );
			if ( Character.isWhitespace( ch ) )
			{
				if ( !temp.isBlank() )
					words.add( temp );
				temp = "";
			}
			else
				temp += ch;
		}

		words.add( temp );

		Collections.reverse( words );
		return words.parallelStream().collect( Collectors.joining( " " ) );
	}
}
