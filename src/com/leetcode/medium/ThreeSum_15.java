package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum_15
{
	public static List<List<Integer>> threeSum( int[] nums )
	{
		if ( nums.length < 3 )
			return new ArrayList<>();

		Arrays.parallelSort( nums );
		Set<List<Integer>> set = new HashSet<>();
		for ( int i = 0; i < nums.length - 2; i++ )
		{
			int j = i + 1;
			int k = nums.length - 1;
			while ( j < k )
			{
				int sum = nums[i] + nums[j] + nums[k];
<<<<<<< HEAD
				
=======
>>>>>>> 92b4f99a37690f59e5bc5d2fa42b104e3318f4bd
				if ( sum == 0 )
					set.add( Arrays.asList( nums[i], nums[j++], nums[k--] ) );
				else if ( sum > 0 )
					k--;
				else if ( sum < 0 )
					j++;
			}
		}

		return new ArrayList<List<Integer>>( set );
	}
}
