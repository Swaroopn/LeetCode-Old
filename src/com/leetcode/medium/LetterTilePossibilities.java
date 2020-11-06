package com.leetcode.medium;

import java.util.Arrays;

public class LetterTilePossibilities
{
	int count = 0;

	public static void main( String[] args )
	{
		LetterTilePossibilities obj = new LetterTilePossibilities();
		System.out.println( obj.numTilePossibilities( "AAB" ) );
	}

	public int numTilePossibilities( String tiles )
	{
		char[] charArr = tiles.toCharArray();
		Arrays.parallelSort( charArr );

		iterate( charArr, new boolean[charArr.length] );
		return count - 1;
	}

	private void iterate( char[] arr, boolean[] visited )
	{
		count++;

		for ( int i = 0; i < arr.length; i++ )
		{
			if ( visited[i] || ( i > 0 && arr[i] == arr[i - 1] && !visited[i - 1] ) )
				continue;

			visited[i] = true;
			iterate( arr, visited );
			visited[i] = false;
		}
	}
}
