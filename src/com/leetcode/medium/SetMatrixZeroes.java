package com.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes
{
	public static void main( String[] args )
	{
		setZeros( new int[][]
		{
			{ 0, 1 }
		} );
	}

	public static void setZeros( int[][] matrix )
	{
		Set<Integer> rows = new HashSet<>();
		Set<Integer> cols = new HashSet<>();

		for ( int row = 0; row < matrix.length; row++ )
		{
			for ( int col = 0; col < matrix[row].length; col++ )
			{
				if ( matrix[row][col] == 0 )
				{
					rows.add( row );
					cols.add( col );
				}
			}
		}

		for ( int i = 0; i < matrix.length; i++ )
		{
			for ( int j = 0; j < matrix[i].length; j++ )
			{
				if ( rows.contains( i ) || cols.contains( j ) )
					matrix[i][j] = 0;
			}
		}
	}
}
