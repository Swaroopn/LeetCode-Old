package com.leetcode.easy;

import java.util.List;

public class ReverseVowelsOfAString
{
	private static List<Character> vowelList = List.of( 'a', 'e', 'i', 'o', 'u' );

	public static void main( String[] args )
	{
		System.out.println( reverseVowels( "aebcdiz" ) );
	}

	public static String reverseVowels( String s )
	{
		int left = 0;
		int right = s.length() - 1;
		char[] chArr = s.toCharArray();
		while ( left < right )
		{
			if ( isVowel( Character.toLowerCase( chArr[left] ) ) )
			{
				while ( left < right )
				{
					if ( isVowel( Character.toLowerCase( chArr[right] ) ) )
					{
						char temp = chArr[left];
						chArr[left] = chArr[right];
						chArr[right] = temp;

						right--;
						break;
					}
					else
						right--;
				}
			}

			left++;
		}

		return String.copyValueOf( chArr );
	}

	private static boolean isVowel( char ch )
	{
		return vowelList.contains( ch );
	}
}
