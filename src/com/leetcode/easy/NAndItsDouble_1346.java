package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class NAndItsDouble_1346
{
	public static void main( String[] args )
	{
		System.out.println( checkIfExist( new int[]
		{ 3, 1, 7, 11 } ) );
	}

	public static boolean checkIfExist( int[] arr )
	{
		Set<Integer> set = new HashSet<>();
		for ( int num : arr )
		{
			if ( set.contains( num * 2 ) || ( ( num % 2 == 0 ) && set.contains( num / 2 ) ) )
				return true;

			set.add( num );
		}

		return false;
	}
}
