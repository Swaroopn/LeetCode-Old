package com.leetcode.easy;

public class CountAndSay
{
	public static void main( String[] args )
	{
		int N = 4;
		System.out.println( countAndSay( N ) );
	}

	private static String countAndSay( int N )
	{
		String str = "1";

		while ( N-- > 1 )
			str = countUtil( str );

		return str;
	}

	private static String countUtil( String str )
	{
		int N = str.length();
		StringBuilder sbr = new StringBuilder();
		int count = 1;
		/*for ( int i = 0; i < N; i++ )
		{
			while ( i < N - 1 && str.charAt( i ) == str.charAt( i + 1 ) )
			{
				count++;
				i++;
			}
		
			sbr.append( count );
			sbr.append( str.charAt( i ) );
			count = 1;
		}
		*/

		for ( int i = 1; i <= N; i++ )
		{
			if ( i == N || str.charAt( i ) != str.charAt( i - 1 ) )
			{
				sbr.append( count ).append( str.charAt( i - 1 ) );
				count = 1;
			}
			else
				count++;
		}

		return sbr.toString();
	}
}
