package com.leetcode.medium;

public class CapacityToShipPackages_1011
{
	public static void main( String[] args )
	{
		System.out.println( shipWithinDays( new int[]
		{ 3, 2, 2, 4, 1, 4 }, 3 ) );
	}

	public static int shipWithinDays( int[] weights, int D )
	{
		int min = 0, max = 0;
		int finalDays = 0;
		for ( int weight : weights )
		{
			max += weight;
			min = Math.max( min, weight );
		}

		while ( min <= max )
		{
			int mid = min + ( max - min ) / 2;
			int daysRequired = numberOfDaysRequiredWithCapacity( weights, mid );
			if ( daysRequired > D )
				min = mid + 1;
			else
			{
				finalDays = mid;
				max = mid - 1;
			}
		}

		return finalDays;
	}

	private static int numberOfDaysRequiredWithCapacity( int[] weights, int capacity )
	{
		int daysRequired = 1;
		int current = 0;
		for ( int weight : weights )
		{
			current += weight;
			if ( current > capacity )
			{
				daysRequired++;
				current = weight;
			}
		}

		return daysRequired;
	}
}