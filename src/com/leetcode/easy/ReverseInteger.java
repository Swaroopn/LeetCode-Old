package com.leetcode.easy;

public class ReverseInteger
{
	public static void main( String[] args )
	{
		int num = 1534236469;
		System.out.println( reverse( num ) );
	}

	private static int reverse( int num )
	{
		StringBuilder sbr = new StringBuilder();
		if ( num < 0 )
		{
			sbr.append( "-" );
			num = Math.abs( num );
		}

		while ( num > 0 )
		{
			sbr.append( num % 10 );
			num = num / 10;
		}

		int result = 0;
		try
		{
			result = Integer.parseInt( sbr.toString() );
		}
		catch ( NumberFormatException e )
		{
			result = 0;
		}

		return result;
	}
}
