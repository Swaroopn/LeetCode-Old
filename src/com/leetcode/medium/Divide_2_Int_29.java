package com.leetcode.medium;

public class Divide_2_Int_29
{
	public static void main( String[] args )
	{
		System.out.println( divide( 10, 3 ) );
		System.out.println( divide( -1, -1 ) );
		System.out.println( divide( 0, 10 ) );
	}

	public static int divide( int dividend, int divisor )
	{
		if ( divisor == 1 )
			return dividend;

		if ( dividend == Integer.MIN_VALUE && divisor == -1 )
			return Integer.MAX_VALUE;

		boolean isNeg = false;
		if ( ( divisor < 0 && dividend >= 0 ) || ( divisor >= 0 && dividend < 0 ) )
		{
			isNeg = true;
		}

		divisor = Math.abs( divisor );
		dividend = Math.abs( dividend );

		int count = 0;
		while ( ( dividend - divisor ) >= 0 )
		{
			count++;
			dividend -= divisor;
		}

		return isNeg ? ( count ) * -1 : count;
	}
}
