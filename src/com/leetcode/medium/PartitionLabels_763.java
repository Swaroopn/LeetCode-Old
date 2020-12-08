package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels_763
{
	public static void main( String[] args )
	{
		System.out.println( partitionLabels( "ababcbacadefegdehijhklij" ) );
	}

	public static List<Integer> partitionLabels( String S )
	{
		int[] lastPos = new int[26];
		for ( int i = 0; i < S.length(); i++ )
		{
			char ch = S.charAt( i );
			lastPos[ch - 'a'] = i;
		}

		int anchor = 0;
		int j = 0;
		List<Integer> result = new ArrayList<>();
		for ( int i = 0; i < S.length(); i++ )
		{
			char ch = S.charAt( i );
			j = Math.max( j, lastPos[ch - 'a'] );
			if ( i == j )
			{
				result.add( i - anchor + 1 );
				anchor = i + 1;
			}
		}

		return result;
	}
}
