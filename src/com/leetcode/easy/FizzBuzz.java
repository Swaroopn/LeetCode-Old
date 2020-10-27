package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz
{
	public static void main( String[] args )
	{
		System.out.println( fizzBuzz( 15 ) );
		System.out.println( fizzBuzz( 0 ) );
	}

	public static List<String> fizzBuzz( int n )
	{
		final int THREE = 3;
		final int FIVE = 5;
		final String FIZZ = "Fizz";
		final String BUZZ = "Buzz";
		final String FIZZ_BUZZ = "FizzBuzz";

		List<String> list = new ArrayList<>();
		for ( int i = 1; i <= n; i++ )
		{
			if ( i % ( THREE * FIVE ) == 0 )
				list.add( FIZZ_BUZZ );
			else if ( i % FIVE == 0 )
				list.add( BUZZ );
			else if ( i % THREE == 0 )
				list.add( FIZZ );
			else
				list.add( i + "" );
		}

		return list;
	}
}
