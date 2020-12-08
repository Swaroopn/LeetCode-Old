package com.leetcode.easy;

public class GoalParser_1678
{
	public String interpret( String command )
	{
		int N = command.length();
		StringBuilder sbr = new StringBuilder();
		for ( int i = 0; i < N; i++ )
		{
			char c = command.charAt( i );

			if ( c == 'G' )
				sbr.append( "G" );
			else if ( c == '(' )
			{
				if ( ')' == command.charAt( i + 1 ) )
					sbr.append( "o" );
				else
					sbr.append( "al" );
			}
		}

		return sbr.toString();
	}
}
