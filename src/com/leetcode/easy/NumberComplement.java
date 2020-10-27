package com.leetcode.easy;

public class NumberComplement
{
	public static void main( String[] args )
	{
		System.out.println( findComplement( 5 ) );
	}

	public static int findComplement( int num )
	{
		int result = 0;
		int set = 1;
		while ( num != 0 )
		{
			if ( ( num & 1 ) == 0 )
				result |= set;

			set <<= 1;
			num >>= 1;
		}

		return result;
	}
}
