package com.leetcode.easy;

public class DefuseBomb
{
	public static void main( String[] args )
	{
		decrypt( new int[]
		{ 5, 7, 1, 4 }, 3 );
		decrypt( new int[]
		{ 2, 4, 9, 3 }, -2 );
	}

	public static int[] decrypt( int[] code, int k )
	{
		if ( k == 0 )
			return new int[code.length];

		int prevSum = 0;
		int[] prefix = new int[code.length * 2];
		for ( int i = 0; i < code.length * 2; i++ )
		{
			prefix[i] = prevSum + code[i % code.length];
			prevSum = prefix[i];
		}

		int[] result = new int[code.length];
		for ( int i = 0; i < code.length; i++ )
		{
			int end = i + k;
			if ( k < 0 )
			{
				result[i] = prefix[i + code.length - 1] - prefix[end + code.length - 1];
			}
			else
			{
				result[i] = prefix[end] - prefix[i];
			}
		}

		return result;
	}
}
