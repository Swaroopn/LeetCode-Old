package com.leetcode.medium;

public class MaxNumOfVowels_1456
{
	public int maxVowels( String s, int k )
	{
		int max = 0;
		int count = 0;
		int i = 0, j = 0;
		int N = s.length();
		while ( i < N )
		{
			while ( j < ( k + i ) && j < N )
			{
				if ( isVowel( s.charAt( j ) ) )
					count++;

				j++;
			}

			max = Math.max( max, count );
			if ( isVowel( s.charAt( i ) ) )
				count--;
			i++;
		}

		return max;
	}

	public boolean isVowel( char ch )
	{
		if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
			return true;
		return false;
	}
}
