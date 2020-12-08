package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams_438
{
	public static void main( String[] args )
	{
		System.out.println( findAnagrams( "cbaebabacd", "abc" ) );
	}

	public static List<Integer> findAnagrams( String s, String p )
	{
		List<Integer> result = new ArrayList<>();

		if ( s == null || s.isEmpty() )
			return result;

		int[] alpha = new int[26];
		for ( char ch : p.toCharArray() )
			alpha[ch - 'a']++;

		int left = 0;
		int right = 0;
		int count = p.length();
		while ( right < s.length() )
		{
			if ( alpha[s.charAt( right++ ) - 'a']-- >= 1 )
				count--;

			if ( count == 0 )
				result.add( left );

			if ( right - left == p.length() && alpha[s.charAt( left++ ) - 'a']++ >= 0 )
				count++;
		}

		return result;
	}
}
