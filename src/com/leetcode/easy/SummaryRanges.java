package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges
{
	public static void main( String[] args )
	{
		System.out.println( summaryRanges( new int[]
		{ 0, 1, 2, 4, 5, 7 } ) );
	}

	public static List<String> summaryRanges( int[] nums )
	{
		List<String> ranges = new ArrayList<>();

		if ( nums.length == 0 )
			return ranges;

		int start = nums[0];
		int end = nums[0];

		for ( int i = 0; i < nums.length - 1; i++ )
		{
			int curr = nums[i];
			int next = nums[i + 1];

			if ( next - curr == 1 )
				end++;
			else
			{
				ranges.add( format( start, end ) );
				start = next;
				end = next;
			}
		}

		ranges.add( format( start, end ) );
		return ranges;
	}

	private static String format( int start, int end )
	{
		if ( start == end )
			return start + "";
		return start + "->" + end;
	}
}
