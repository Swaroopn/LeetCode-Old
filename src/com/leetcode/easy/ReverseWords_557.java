package com.leetcode.easy;

public class ReverseWords_557
{
	public static void main( String[] args )
	{
		String word = "Let's take LeetCode contest";
		System.out.println( reverseWord( word ) );
	}

	private static String reverseWord( String word )
	{
		StringBuilder revSentence = new StringBuilder();
		StringBuilder revWord = new StringBuilder();

		for ( int i = 0; i < word.length(); i++ )
		{
			char c = word.charAt( i );
			if ( !Character.isWhitespace( c ) )
				revWord.append( c );
			else
			{
				revSentence.append( revWord.reverse() ).append( " " );
				revWord.setLength( 0 );
			}
		}

		revSentence.append( revWord.reverse() );
		return revSentence.toString();
	}
}
