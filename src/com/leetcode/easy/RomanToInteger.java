package com.leetcode.easy;

import java.util.Map;

public class RomanToInteger
{
	public static void main( String[] args )
	{
		System.out.println( romanToInteger( "MCMXCIV" ) );
	}

	private static int romanToInteger( String roman )
	{
		Map<Character, Integer> map = Map.of( 'I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000 );

		int N = roman.length();
		int sum = map.get( roman.charAt( N - 1 ) );
		for ( int i = N - 2; i >= 0; i-- )
		{
			if ( map.get( roman.charAt( i ) ) < map.get( roman.charAt( i + 1 ) ) )
				sum = sum - map.get( roman.charAt( i ) );
			else
				sum = sum + map.get( roman.charAt( i ) );
		}

		return sum;
	}
}
