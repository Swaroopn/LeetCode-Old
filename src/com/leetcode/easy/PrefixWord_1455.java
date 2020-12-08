package com.leetcode.easy;

public class PrefixWord_1455
{
	public static void main( String[] args )
	{
		System.out.println( isPrefixOfWord( "corona dream", "d" ) );
		System.out.println( isPrefixOfWord( "this problem is an easy problem", "pro" ) );
	}

	public static int isPrefixOfWord( String sentence, String searchWord )
	{
		// TODO: need to replace this built-in function
		String[] words = sentence.split( " " );
		for ( int w = 0; w < words.length; w++ )
		{
			String word = words[w];
			if ( word.length() < searchWord.length() )
				continue;

			int start = 0;
			for ( ; start < searchWord.length(); start++ )
			{
				if ( word.charAt( start ) != searchWord.charAt( start ) )
					break;
			}

			if ( start == searchWord.length() )
				return w + 1;
		}

		return -1;
	}
}
