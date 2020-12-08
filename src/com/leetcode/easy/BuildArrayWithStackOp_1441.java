package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class BuildArrayWithStackOp_1441
{
	public List<String> buildArray( int[] target, int n )
	{
		List<String> list = new ArrayList<>();
		int count = 1;
		for ( int i = 0; i < target.length; i++ )
		{
			if ( target[i] == i + count )
			{
				list.add( "Push" );
			}
			else
			{
				list.add( "Push" );
				list.add( "Pop" );
				count++;
				i--;
			}
		}

		return list;
	}
}
