package com.leetcode.easy;

public class OddCountString_1374
{
	public static void main( String[] args )
	{
		System.out.println( generateTheString( 7 ) );
		System.out.println( generateTheString( 1 ) );
		System.out.println( generateTheString( 6 ) );
	}

	public static String generateTheString( int n )
	{
		StringBuilder sbr = new StringBuilder();
		for ( int i = 0; i < n - 1; i++ )
			sbr.append( "a" );

		if ( n % 2 == 0 )
			sbr.append( "b" );
		else
			sbr.append( "a" );

		return sbr.toString();
	}
}
