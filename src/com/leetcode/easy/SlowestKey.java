package com.leetcode.easy;

public class SlowestKey
{
	public static void main( String[] args )
	{
		System.out.println( slowestKey( new int[]
		{ 12, 23, 36, 46, 62 }, "spada" ) );
	}

	public static char slowestKey( int[] releaseTimes, String keysPressed )
	{
		int lastDuration = 0;
		int longestDuration = Integer.MIN_VALUE;
		char temp = ' ';
		for ( int i = 0; i < releaseTimes.length; i++ )
		{
			int duration = releaseTimes[i] - lastDuration;
			if ( duration > longestDuration )
			{
				longestDuration = releaseTimes[i] - lastDuration;
				temp = keysPressed.charAt( i );
			}
			else if ( duration == longestDuration )
			{
				longestDuration = releaseTimes[i] - lastDuration;
				temp = keysPressed.charAt( i ) > temp ? keysPressed.charAt( i ) : temp;
			}

			lastDuration = releaseTimes[i];
		}

		return temp;
	}
}
