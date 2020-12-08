package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfArrays_350
{
	public int[] intersect( int[] nums1, int[] nums2 )
	{
		Arrays.sort( nums1 );
		Arrays.sort( nums2 );

		int firstPtr = 0;
		int secondPtr = 0;
		List<Integer> list = new ArrayList<>();
		while ( firstPtr < nums1.length && secondPtr < nums2.length )
		{
			if ( nums1[firstPtr] == nums2[secondPtr] )
			{
				list.add( nums1[firstPtr] );
				firstPtr++;
				secondPtr++;
			}
			else if ( nums1[firstPtr] < nums2[secondPtr] )
				firstPtr++;
			else
				secondPtr++;
		}

		return list.stream().mapToInt( i -> i ).toArray();
	}
}
