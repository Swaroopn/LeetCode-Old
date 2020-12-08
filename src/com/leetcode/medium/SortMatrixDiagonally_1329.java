package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortMatrixDiagonally_1329
{
	public int[][] diagonalSort( int[][] mat )
	{
		Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();

		int ROW_SIZE = mat.length;
		int COL_SIZE = mat[0].length;

		for ( int i = 0; i < ROW_SIZE; i++ )
		{
			for ( int j = 0; j < COL_SIZE; j++ )
			{
				map.putIfAbsent( i - j, new PriorityQueue<>() );
				map.get( i - j ).add( mat[i][j] );
			}
		}

		for ( int i = 0; i < ROW_SIZE; i++ )
			for ( int j = 0; j < COL_SIZE; j++ )
				mat[i][j] = map.get( i - j ).poll();
		
		return mat;
	}
}
