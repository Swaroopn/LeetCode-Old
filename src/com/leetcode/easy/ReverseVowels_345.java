package com.leetcode.easy;

public class ReverseVowels_345
{
	public String reverseVowels( String s )
	{
		int left = 0;
		int right = s.length() - 1;
		char[] cArr = s.toCharArray();
		while ( left < right )
		{
			while ( left < right && !isVowel( cArr[left] ) )
				left++;

			while ( left < right && !isVowel( cArr[right] ) )
				right--;

			if ( left < right )
			{
				char temp = cArr[left];
				cArr[left] = cArr[right];
				cArr[right] = temp;

				left++;
				right--;
			}
		}

		return String.valueOf( cArr );
	}

	public boolean isVowel( char ch )
	{
		ch = Character.toLowerCase( ch );
		return ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' );
	}
}
