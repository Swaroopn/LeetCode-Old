package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber
{
	public static void main( String[] args )
	{
		System.out.println( isHappy( 7 ) );
	}

	public static boolean isHappy( int n )
	{
		Set<Integer> encounteredNumbers = new HashSet<>();
		while ( !encounteredNumbers.contains( n ) )
		{
			encounteredNumbers.add( n );

			int sum = 0;
			while ( n > 0 )
			{
				sum += Math.pow( n % 10, 2 );
				n = n / 10;
			}

			if ( sum == 1 )
				return true;

			n = sum;
		}

		return false;
	}
}
