package com.leetcode.easy;

public class UglyNumber
{
	public static void main( String[] args )
	{
		System.out.println( isUgly( -2147483648 ) );
		System.out.println( isUgly( 1 ) );
		System.out.println( isUgly( 0 ) );
		System.out.println( isUgly( 18 ) );
	}

	public static boolean isUgly( int num )
	{
		if ( num == 0 )
			return false;

		while ( num != 1 )
		{
			if ( num % 5 == 0 )
				num = num / 5;
			else if ( num % 3 == 0 )
				num = num / 3;
			else if ( num % 2 == 0 )
				num = num / 2;

			if ( num == 1 || num % 2 == 0 || num % 3 == 0 || num % 5 == 0 )
				continue;
			else
				return false;
		}

		return true;
	}
}
