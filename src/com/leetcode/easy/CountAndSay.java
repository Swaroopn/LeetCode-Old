package com.leetcode.easy;

public class CountAndSay
{
	public static void main( String[] args )
	{
		int N = 4;
		System.out.println( countAndSay( N ) );
	}

	private static String countAndSay( int n )
	{
		String str = "1";

		while ( n > 1 )
		{
			str = countUtil( str );
			n--;
		}

		return str;
	}

	private static String countUtil( String str )
	{
		int n = str.length();
		StringBuilder sbr = new StringBuilder();
		int count = 1;
		for ( int i = 0; i < n; i++ )
		{
			while ( i < n - 1 && str.charAt( i ) == str.charAt( i + 1 ) )
			{
				count++;
				i++;
			}

			sbr.append( count );
			sbr.append( str.charAt( i ) );
			count = 1;
		}

		return sbr.toString();
	}
}
