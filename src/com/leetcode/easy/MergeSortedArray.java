package com.leetcode.easy;

public class MergeSortedArray
{
	public static void main( String[] args )
	{
		int[] arr1 =
		{ 1, 2, 3, 0, 0, 0 };
		int[] arr2 =
		{ 2, 5, 6 };

		merge( arr1, 3, arr2, 3 );
		
		for ( int i = 0; i < arr1.length; i++ )
			System.out.print( arr1[i] + " " );
	}

	public static void merge( int[] arr1, int m, int[] arr2, int n )
	{
		int index = m + n - 1;
		int first = m - 1;
		int second = n - 1;
		while ( first >= 0 || second >= 0 )
		{
			int num1 = first >= 0 ? arr1[first] : Integer.MIN_VALUE;
			int num2 = second >= 0 ? arr2[second] : Integer.MIN_VALUE;
			
			if ( num1 > num2 )
			{
				arr1[index] = num1;
				first--;
			}
			else
			{
				arr1[index] = num2;
				second--;
			}
			
			index--;
		}
	}
}
