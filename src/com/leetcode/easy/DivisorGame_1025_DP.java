package com.leetcode.easy;

/*
 * Dynamic Programming
 */
public class DivisorGame_1025_DP
{
	public static void main( String[] args )
	{
		System.out.println( divisorGame( 7 ) );
	}

	public static boolean divisorGame( int N )
	{
		return ( N % 2 == 1 ) ? false : true;
	}
}
