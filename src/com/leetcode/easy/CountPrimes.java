package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountPrimes
{
	public static void main( String[] args )
	{
		System.out.println( countPrimes( 10 ) );
	}

	public static int countPrimes( int n )
	{
		List<Integer> primes = new ArrayList<>();
		List<Boolean> isPrime = new ArrayList<>( Collections.nCopies( n + 1, true ) );
		isPrime.set( 0, false ); // 0 is non-prime
		isPrime.set( 1, false ); // 1 is non-prime

		for ( int p = 2; p < n; p++ )
		{
			if ( isPrime.get( p ) )
			{
				primes.add( p );
				// Sieve p's multiples
				for ( int j = p; j <= n; j += p )
					isPrime.set( j, false );
			}
		}

		return primes.size();
	}
}
