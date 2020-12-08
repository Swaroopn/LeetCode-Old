package com.leetcode.easy;

public class RobotOrigin_657
{
	public boolean judgeCircle( String moves )
	{
		int leftRightCount = 0;
		int upDownCount = 0;

		for ( char ch : moves.toCharArray() )
		{
			if ( ch == 'L' )
				leftRightCount++;
			else if ( ch == 'R' )
				leftRightCount--;
			else if ( ch == 'U' )
				upDownCount++;
			else if ( ch == 'D' )
				upDownCount--;
		}

		return ( leftRightCount == 0 && upDownCount == 0 );
	}
}
