package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class FractionRecurrence
{
	public static void main( String[] args )
	{
		System.out.println( fractionToDecimal( 1, 2 ) );
	}

	public static String fractionToDecimal( int numerator, int denominator )
	{
		if ( numerator == 0 )
			return "0";
		if ( denominator == 0 )
			return "";

		StringBuilder sb = new StringBuilder();
		boolean flag = ( numerator < 0 ) ^ ( denominator < 0 );

		long num = Math.abs( numerator );
		long den = Math.abs( denominator );

		long n = num / den;
		long remainder = ( num % den ) * 10;

		sb.append( flag ? "-" : "" );
		sb.append( Math.abs( n ) );
		sb.append( remainder != 0 ? "." : "" );

		Map<Long, Integer> hashMap = new HashMap<>();
		while ( remainder != 0 )
		{
			if ( hashMap.containsKey( remainder ) )
			{
				int len = hashMap.get( remainder );
				sb.insert( len, '(' );
				sb.append( ')' );
				break;
			}

			hashMap.put( remainder, sb.length() );
			n = Math.abs( remainder / den );
			sb.append( n );
			remainder = ( remainder % den ) * 10;
		}

		return sb.toString();
	}
}
