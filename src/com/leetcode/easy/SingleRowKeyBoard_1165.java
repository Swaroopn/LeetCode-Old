package com.leetcode.easy;

// TODO: incomplete
public class SingleRowKeyBoard_1165
{
	public static void main( String[] args )
	{
		System.out.println( calculateTime( "abcdefghijklmnopqrstuvwxyz", "cba" ) );
		System.out.println( calculateTime( "pqrstuvwxyzabcdefghijklmno", "hello" ) );
	}

	private static int calculateTime( String keyboard, String word )
	{
		int[] actualPos = new int[keyboard.length()];
		for ( int i = 0; i < keyboard.length(); i++ )
			actualPos[keyboard.charAt( i ) - 'a'] = i;

		return 0;
	}
}
