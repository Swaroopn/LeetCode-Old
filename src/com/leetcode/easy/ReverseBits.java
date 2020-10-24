package com.leetcode.easy;

public class ReverseBits
{
	public int reverseBits( int n )
	{
		int result = 0;
		int power = 31;
		while ( power >= 0 )
		{
			int lastBit = n & 1;
			if ( lastBit == 1 )
				result = result | ( lastBit << power );

			n = n >> 1;
			power--;
		}

		return result;
	}
}
