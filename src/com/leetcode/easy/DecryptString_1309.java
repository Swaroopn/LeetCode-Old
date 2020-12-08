package com.leetcode.easy;

public class DecryptString_1309
{
	public static void main( String[] args )
	{
		System.out.println( freqAlphabets( "1226#" ) );
	}

	public static String freqAlphabets( String s )
	{
		String alpha = "abcdefghijklmnopqrstuvwxyz";

		StringBuilder sb = new StringBuilder();
		char[] arr = s.toCharArray();
		for ( int i = arr.length - 1; i >= 0; i-- )
		{
			if ( arr[i] != '#' )
			{
				int index = Integer.parseInt( arr[i] + "" ) - 1;
				sb.insert( 0, ( char ) ( alpha.charAt( index ) ) );
			}
			else
			{
				int index = Integer.parseInt( arr[i - 2] + "" + arr[i - 1] ) - 1;
				sb.insert( 0, ( char ) ( alpha.charAt( index ) ) );
				i -= 2;
			}
		}

		return sb.toString();
	}
}
