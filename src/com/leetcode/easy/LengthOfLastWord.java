package com.leetcode.easy;

public class LengthOfLastWord
{
	public static void main( String[] args )
	{
		String sentence = "a";
		System.out.println( findLenOfLastWord( sentence ) );
	}

	private static int findLenOfLastWord( String sentence )
	{
		if ( sentence.isBlank() )
			return 0;

		int count = 0;
		sentence = sentence.trim();
		for ( int i = sentence.length() - 1; i >= 0; i-- )
		{
			char ch = sentence.charAt( i );
			if ( Character.isWhitespace( ch ) )
				return count;

			count++;
		}

		return count;
	}
}
