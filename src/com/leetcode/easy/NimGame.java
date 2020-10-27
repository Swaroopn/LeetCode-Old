package com.leetcode.easy;

public class NimGame
{
	public static void main( String[] args )
	{
		System.out.println( canWinNim( 3 ) );
		System.out.println( canWinNim( 4 ) );
		System.out.println( canWinNim( 5 ) );
		System.out.println( canWinNim( 6 ) );
		System.out.println( canWinNim( 7 ) );
	}

	public static boolean canWinNim( int n )
	{
		return ( n % 4 ) != 0;
	}
}
