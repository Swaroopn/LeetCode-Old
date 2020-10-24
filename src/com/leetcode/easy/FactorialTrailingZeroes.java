package com.leetcode.easy;

public class FactorialTrailingZeroes
{
	public static void main( String[] args )
	{
		System.out.println( trailingZeroes( 30 ) );
		System.out.println( trailingZeroesAlternate( 30 ) );
	}

	public static int trailingZeroes( int n )
	{
		return n == 0 ? 0 : n / 5 + trailingZeroes( n / 5 );
	}

	public static int trailingZeroesAlternate( int n )
	{
		int sum = 0;
		long i = 5;
		while ( i <= n )
		{
			sum += ( n / i );
			i *= 5;
		}
		return sum;
	}
}
