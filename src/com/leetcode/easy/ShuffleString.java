package com.leetcode.easy;

public class ShuffleString
{
	public static void main( String[] args )
	{
		System.out.println( restoreString( "codeleet", new int[]
		{ 4, 5, 6, 7, 0, 2, 1, 3 } ) );
	}

	public static String restoreString( String s, int[] indices )
	{
		char[] sortedChars = new char[indices.length];
		for ( int i = 0; i < s.length(); i++ )
		{
			sortedChars[indices[i]] = s.charAt( i );
		}

		return String.valueOf( sortedChars );
	}
}
