package com.leetcode.easy;

public class CrawlerLogFolder_1598
{
	public static void main( String[] args )
	{
		System.out.println( minOperations( new String[]
		{ "./", "../", "./" } ) );
	}

	public static int minOperations( String[] logs )
	{
		int steps = 0;
		for ( String cmd : logs )
		{
			if ( "../".equals( cmd ) )
			{
				if ( steps != 0 )
					steps--;
			}
			else if ( "./".equals( cmd ) )
				continue;
			else
				steps++;
		}

		return steps;
	}
}
