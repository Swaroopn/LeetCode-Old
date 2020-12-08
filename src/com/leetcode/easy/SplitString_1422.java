package com.leetcode.easy;

public class SplitString_1422
{
	public static void main( String[] args )
	{
		System.out.println( maxScore( "011101" ) );
		System.out.println( maxScoreEff( "011101" ) );
	}

	public static int maxScore( String s )
	{
		int N = s.length();
		int[] zeroArr = new int[N];
		fillZeroArr( s, zeroArr );

		int max = Integer.MIN_VALUE;
		int oneCount = 0;
		for ( int i = s.length() - 1; i > 0; i-- )
		{
			if ( s.charAt( i ) == '1' )
				oneCount++;
			max = Math.max( max, oneCount + zeroArr[i - 1] );
		}

		return max;
	}

	public static void fillZeroArr( String str, int[] arr )
	{
		int zeroCount = 0;
		for ( int i = 0; i < str.length(); i++ )
		{
			if ( str.charAt( i ) == '0' )
				zeroCount++;

			arr[i] = zeroCount;
		}
	}

	/*
	 * Single pass
	 */
	public static int maxScoreEff( String s )
	{
		int max = Integer.MIN_VALUE;
		int zeroCount = 0;
		int oneCount = 0;
		for ( int i = 0; i < s.length(); i++ )
		{
			if ( s.charAt( i ) == '0' )
				zeroCount++;
			else
				oneCount++;

			if ( i != s.length() - 1 )
				max = Math.max( max, zeroCount - oneCount );
		}
		return max + oneCount;
	}
}
