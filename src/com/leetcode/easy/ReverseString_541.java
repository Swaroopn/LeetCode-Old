package com.leetcode.easy;

public class ReverseString_541
{
	public static void main( String[] args )
	{
		System.out.println( reverseStr( "abcdefgh", 2 ) );
	}

	public static String reverseStr( String s, int k )
	{
		char[] a = s.toCharArray();
		for ( int start = 0; start < a.length; start += 2 * k )
		{
			int i = start, j = Math.min( start + k - 1, a.length - 1 );
			while ( i < j )
			{
				char tmp = a[i];
				a[i++] = a[j];
				a[j--] = tmp;
			}
		}
		
		return new String( a );
	}
}
