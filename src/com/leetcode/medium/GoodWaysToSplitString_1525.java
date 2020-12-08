package com.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class GoodWaysToSplitString_1525
{
	public static void main( String[] args )
	{
		System.out.println( numSplits( "aacaba" ) );
	}

	private static int numSplits( String s )
	{
		int N = s.length();
		
		int[] prefix = new int[N];
		int[] suffix = new int[N];
		
		Set<Character> prefixSet = new HashSet<>();
		Set<Character> suffixSet = new HashSet<>();
		
		for ( int i = 0; i < N; i++ )
		{
			char firstChar = s.charAt( i );
			char lastChar = s.charAt( N - i - 1 );

			prefixSet.add( firstChar );
			suffixSet.add( lastChar );

			prefix[i] = prefixSet.size();
			suffix[N - i - 1] = suffixSet.size();
		}

		int goodWays = 0;
		for ( int i = 1; i < N; i++ )
		{
			if ( prefix[i - 1] == suffix[i] )
				goodWays++;
		}

		return goodWays;
	}
}
