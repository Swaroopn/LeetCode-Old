package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class MinCostTreeFromLeaves_1130
{
	public static void main( String[] args )
	{
		int[] arr = new int[]
		{ 8, 4, 1, 2, 5 };
		System.out.println( mctFromLeafValues( arr ) );
	}

	public static int mctFromLeafValues( int[] arr )
	{
		List<Integer> list = new ArrayList<>( arr.length );
		for ( int num : arr )
			list.add( num );

		int prodSum = 0;
		int size = list.size();
		while ( --size > 0 )
		{
			int minIndex = getMinProdPairs( list );
			int tempSum = list.get( minIndex ) * list.get( minIndex + 1 );
			prodSum += tempSum;
			list.set( minIndex + 1, Math.max( list.get( minIndex ), list.get( minIndex + 1 ) ) );
			list.remove( minIndex );
		}

		return prodSum;
	}

	private static int getMinProdPairs( List<Integer> list )
	{
		int prod = Integer.MAX_VALUE;
		int minIndex = 0;
		for ( int i = 0; i < list.size() - 1; i++ )
		{
			int tempProd = list.get( i ) * list.get( i + 1 );
			if ( tempProd < prod )
			{
				prod = tempProd;
				minIndex = i;
			}
		}

		return minIndex;
	}
}
