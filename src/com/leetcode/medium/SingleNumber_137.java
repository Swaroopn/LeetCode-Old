package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber_137
{
	public static void main( String[] args )
	{
		System.out.println( singleNumber( new int[]
		{ 0, 1, 0, 1, 0, 1, 99 } ) );
	}

	// XOR operation
	public static int singleNumber( int[] nums )
	{
		int uniqueNum = 0;
		for (int num: nums)
			uniqueNum = uniqueNum ^ num;
		
		return uniqueNum;
	}
}
