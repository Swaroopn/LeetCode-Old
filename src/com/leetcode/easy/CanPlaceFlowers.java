package com.leetcode.easy;

public class CanPlaceFlowers
{
	public static void main( String[] args )
	{

	}

	public static boolean canPlaceFlowersEff( int[] flowerbed, int n )
	{
		int count = 0;
		int N = flowerbed.length;
		for ( int i = 0; i < N; i++ )
		{
			if ( flowerbed[i] == 0 && ( i == 0 || flowerbed[i - 1] == 0 ) && ( i == N - 1 || flowerbed[i + 1] == 0 ) )
			{
				flowerbed[i] = 1;
				count++;
			}

			if ( count >= n )
				return true;
		}

		return count >= n;
	}

	public static boolean canPlaceFlowers( int[] flowerbed, int n )
	{
		if ( n == 0 )
			return true;

		int N = flowerbed.length;
		for ( int i = 0; i < N; i++ )
		{
			if ( flowerbed[i] == 0 )
			{
				if ( ( ( i - 1 ) >= 0 ) && ( flowerbed[i - 1] != 0 ) )
					continue;

				if ( ( ( i + 1 ) < N ) && ( flowerbed[i + 1] != 0 ) )
					continue;

				flowerbed[i] = 1;
				n--;
			}

			if ( n == 0 )
				return true;
		}

		return false;
	}
}
