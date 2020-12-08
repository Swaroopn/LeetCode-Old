package com.leetcode.easy;

import java.util.Arrays;

public class RemoveVowelFromString_1119
{
	public static void main( String[] args )
	{
		System.out.println( removeVowels( "leetcodea" ) );
		System.out.println( removeVowels( "aeiou" ) );
	}

	/*
	 * Without using extra Space
	 */
	private static String removeVowels( String S )
	{
		char[] cArr = S.toCharArray();
		int i = 0, j = 0;

		while ( j < S.length() )
		{
			if ( !isVowel( cArr[j] ) )
				cArr[i++] = cArr[j];
			j++;
		}

		return String.valueOf( Arrays.copyOfRange( cArr, 0, i ) );
	}

	private static boolean isVowel( char ch )
	{
		if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
			return true;
		return false;
	}
}
