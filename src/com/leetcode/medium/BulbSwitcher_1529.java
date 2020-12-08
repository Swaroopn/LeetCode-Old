package com.leetcode.medium;

public class BulbSwitcher_1529
{
	public static void main( String[] args )
	{
		System.out.println( minFlips( "10111" ) );
	}

	public static int minFlips( String target )
	{
		int totalFlips = 0;
		char currStatus = '0';
		for ( int i = 0; i < target.length(); i++ )
		{
			if ( currStatus != target.charAt( i ) )
			{
				totalFlips++;
				currStatus = flip( currStatus );
			}
		}

		return totalFlips;
	}

	private static char flip( char status )
	{
		return status == '0' ? '1' : '0';
	}
}
