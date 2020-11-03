package com.leetcode.easy;

public class RearrangeSpaces_1592
{
	public static void main( String[] args )
	{
		System.out.println( reorderSpaces( "a b c " ) );
	}

	public static String reorderSpaces( String text )
	{
		int totalSpaces = 0;
		for ( char ch : text.toCharArray() )
		{
			if ( Character.isWhitespace( ch ) )
			{
				totalSpaces++;
			}
		}

		StringBuilder result = new StringBuilder();
		String[] words = text.trim().split( "[\\s]+" );
		if ( words.length == 1 )
		{
			result.append( words[0] );
			for ( int i = 0; i < totalSpaces; i++ )
				result.append( " " );

			return result.toString();
		}

		int equalSpace = totalSpaces / ( words.length - 1 );
		int spacesToAppend = totalSpaces % ( words.length - 1 );
		for ( int word = 0; word < words.length - 1; word++ )
		{
			result.append( words[word] );
			for ( int i = 0; i < equalSpace; i++ )
				result.append( " " );
		}
		result.append( words[words.length - 1] );
		for ( int i = 0; i < spacesToAppend; i++ )
			result.append( " " );

		return result.toString();
	}
}
