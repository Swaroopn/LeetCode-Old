package com.leetcode.easy;

public class PowerOfTwo
{
	public static void main( String[] args )
	{
		System.out.println( isPowerOfTwo( -16 ) );
	}

	public static boolean isPowerOfTwo( int n )
	{
		if ( n <= 0 )
			return false;

		if ( n == 1 )
			return true;

		do
		{
			if ( n % 2 != 0 )
				return false;

			n = n / 2;
		}
		while ( n > 1 );

		return true;
	}
}
