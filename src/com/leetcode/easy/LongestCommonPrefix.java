package com.leetcode.easy;

public class LongestCommonPrefix
{
	public static void main( String[] args )
	{
		String[] strs =
		{ "flow", "flight", "flower" };
		System.out.println( findLCP( strs ) );
	}

	private static String findLCP( String[] strs )
	{
		if ( strs.length == 0 )
			return "";

		String prefix = strs[0];
		for ( int i = 1; i < strs.length; i++ )
		{
			while ( strs[i].indexOf( prefix ) != 0 )
			{
				prefix = prefix.substring( 0, prefix.length() - 1 );
				if ( prefix.isEmpty() )
					return "";
			}
		}

		return prefix;
	}
}
