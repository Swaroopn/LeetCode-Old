package com.leetcode.easy;

public class SquaresOfSortedArray_977
{
	public static void main( String[] args )
	{
		sortedSquares( new int[]
		{ -4, -1, 0, 3, 10 } );
	}

	// -4,-1,0,3,10
	public static int[] sortedSquares( int[] nums )
	{
		int N = nums.length;
		int positivePointer = 0, negativePoiner;

		while ( positivePointer < N && nums[positivePointer] < 0 )
			positivePointer++;

		negativePoiner = positivePointer - 1;

		int[] sortedSquares = new int[N];
		int counter = 0;
		while ( negativePoiner >= 0 && positivePointer < N )
		{
			if ( nums[negativePoiner] * nums[negativePoiner] < nums[positivePointer] * nums[positivePointer] )
			{
				sortedSquares[counter] = nums[negativePoiner] * nums[negativePoiner];
				negativePoiner--;
			}
			else
			{
				sortedSquares[counter] = nums[positivePointer] * nums[positivePointer];
				positivePointer++;
			}

			counter++;
		}

		while ( negativePoiner >= 0 )
		{
			sortedSquares[counter] = nums[negativePoiner] * nums[negativePoiner];
			counter++;
			negativePoiner--;
		}

		while ( positivePointer < N )
		{
			sortedSquares[counter] = nums[positivePointer] * nums[positivePointer];
			counter++;
			positivePointer++;
		}

		return sortedSquares;
	}
}
