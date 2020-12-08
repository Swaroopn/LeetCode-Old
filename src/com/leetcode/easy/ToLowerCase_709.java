package com.leetcode.easy;

public class ToLowerCase_709
{
	public static void main( String[] args )
	{
		System.out.println( toLowerCase( "Hello" ) );
	}

	public static String toLowerCase( String str )
	{
		StringBuilder sbr = new StringBuilder();
		for ( char ch : str.toCharArray() )
		{
			if ( ch >= 'A' && ch <= 'Z' )
				ch = ( char ) ( ch + 32 );

			sbr.append( ch );
		}

		return sbr.toString();
	}
}
