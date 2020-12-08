package com.leetcode.easy;

public class NumberOf1Bits
{
	public static void main( String[] args )
	{
		System.out.println( hammingWeight( 11 ) );
	}

	public static int hammingWeight( int n )
	{
		int bits = 0;
		
		int mask = 1;
		for ( int i = 0; i < Integer.SIZE; i++ )
		{
			if ( ( n & mask ) != 0 )
				bits++;

			mask <<= 1;
		}
		
		return bits;
	}
}
