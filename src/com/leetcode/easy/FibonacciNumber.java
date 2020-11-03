package com.leetcode.easy;

public class FibonacciNumber
{
	public static void main( String[] args )
	{
		System.out.println( fib( 5 ) );
	}

	public static int fib( int N )
	{
		if ( N == 0 || N == 1 )
			return N;
		return fib( N - 2 ) + fib( N - 1 );
	}
}
