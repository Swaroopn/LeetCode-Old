package com.leetcode.medium;

public class MinPathSum_64
{
	public static void main( String[] args )
	{
		int[][] mat =
		{
				{ 1, 3, 1 },
				{ 1, 5, 1 },
				{ 4, 2, 1 } };
		System.out.println( minPathSum( mat ) );
	}

	public static int minPathSum( int[][] grid )
	{
		int rows = grid.length;
		int cols = grid[0].length;

		// First row
		for ( int i = 1; i < cols; i++ )
			grid[0][i] += grid[0][i - 1];

		for ( int j = 1; j < rows; j++ )
			grid[j][0] += grid[j - 1][0];

		for ( int i = 1; i < rows; i++ )
		{
			for ( int j = 1; j < cols; j++ )
			{
				grid[i][j] += Math.min( grid[i - 1][j], grid[i][j - 1] );
			}
		}

		return grid[rows - 1][cols - 1];
	}
}
