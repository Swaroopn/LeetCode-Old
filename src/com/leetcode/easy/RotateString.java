package com.leetcode.easy;

public class RotateString
{
	public static void main( String[] args )
	{
		System.out.println( rotateString( "abcde", "cdeab" ) );
	}

	public static boolean rotateString( String A, String B )
	{
		return A.length() == B.length() && ( A + A ).contains( B );
	}
}
