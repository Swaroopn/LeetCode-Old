package com.leetcode.medium;

public class DecodeWays_91
{
	public static void main( String[] args )
	{
		System.out.println( numDecodings( "103" ) );
		System.out.println( decodeIter( "103" ) );
	}

	public static int numDecodings( String str )
	{
		char[] digits = str.toCharArray();
		int n = str.length();

		int count[] = new int[n + 1];
		count[0] = 1;
		count[1] = 1;

		if ( digits[0] == '0' ) // "01123"
			return 0;

		for ( int i = 2; i <= n; i++ )
		{
			count[i] = 0;

			if ( digits[i - 1] > '0' )
				count[i] = count[i - 1];

			if ( digits[i - 2] == '1' || ( digits[i - 2] == '2' && digits[i - 1] < '7' ) )
				count[i] += count[i - 2];
		}

		return count[n];
	}

	private static int decodeIter( String s )
	{
		if ( s.isEmpty() || s.startsWith( "0" ) )
			return 0;

		if ( s.length() == 1 )
			return 1;

		int val1 = 1;
		int val2 = 1;
		for ( int i = 1; i < s.length(); i++ )
		{
			int temp = 0;

			int currentDigit = s.charAt( i ) - '0';
			int prevCurrentDigit = ( s.charAt( i - 1 ) - '0' ) * 10 + currentDigit;

			if ( currentDigit >= 1 )
				temp += val2;

			if ( prevCurrentDigit >= 10 && prevCurrentDigit <= 26 )
				temp += val1;

			val1 = val2;
			val2 = temp;
		}

		return val2;
	}
}
