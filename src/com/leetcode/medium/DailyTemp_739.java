package com.leetcode.medium;

import java.util.Arrays;
import java.util.Stack;

/*
 * https://leetcode.com/problems/daily-temperatures/
 */
public class DailyTemp_739
{
	public static void main( String[] args )
	{
		int[] arr = new int[]
		{ 73, 74, 75, 71, 69, 72, 76, 73 };
		System.out.println( Arrays.toString( dailyTemperatures( arr ) ) );
	}

	public static int[] dailyTemperatures( int[] T )
	{
		int[] output = new int[T.length];
		Stack<Integer> indexStack = new Stack<>();
		for ( int i = 0; i < T.length; i++ )
		{
			int item = T[i];
			while ( !indexStack.isEmpty() && item > T[indexStack.peek()] )
			{
				output[indexStack.peek()] = i - indexStack.peek();
				indexStack.pop();
			}

			indexStack.push( i );
		}

		return output;
	}
}
