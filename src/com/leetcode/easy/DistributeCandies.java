package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies
{
	public static void main( String[] args )
	{
		System.out.println( distributeCandies( new int[]
		{ 1, 2, 3, 1 } ) );
	}

	public static int distributeCandies( int[] candies )
	{
		Set<Integer> uniqueCandies = new HashSet<>();
		for ( int candy : candies )
			uniqueCandies.add( candy );

		int partition = candies.length / 2;
		if ( uniqueCandies.size() < partition )
			return uniqueCandies.size();
		else
			return partition;
	}
}
