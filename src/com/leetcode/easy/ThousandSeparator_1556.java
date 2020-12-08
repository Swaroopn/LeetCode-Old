package com.leetcode.easy;

public class ThousandSeparator_1556
{
	public static void main( String[] args )
	{
		System.out.println( thousandSeparator( 987 ) );
		System.out.println( thousandSeparator( 1234 ) );
		System.out.println( thousandSeparator( 123456789 ) );
	}

	public static String thousandSeparator( int n )
	{
		String temp = String.valueOf( n );
		StringBuilder res = new StringBuilder();
		int N = temp.length();

		for ( int i = N - 1; i >= 0; i-- )
		{
			res.append( temp.charAt( i ) );

			if ( i != 0 && ( N - i ) % 3 == 0 )
				res.append( "." );
		}

		return res.reverse().toString();
	}
}
