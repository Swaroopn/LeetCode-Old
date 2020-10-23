package com.leetcode.easy;

public class PalindromeNumber
{
	public static void main( String[] args )
	{
		System.out.println( isPalindrome( 12121 ) );
	}

	public static boolean isPalindrome( int x )
	{
		int tempNum = x;
		int reversed = 0;
		while ( tempNum > 0 )
		{
			reversed = ( reversed * 10 ) + tempNum % 10;
			tempNum /= 10;
		}

		return x == reversed;
	}
}
