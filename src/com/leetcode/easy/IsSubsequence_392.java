package com.leetcode.easy;

public class IsSubsequence_392
{
	public static void main( String[] args )
	{
		String s = "abc";
		String t = "ahbgcd";
		System.out.println( isSubsequence( s, t ) );
	}

	public static boolean isSubsequence( String s, String t )
	{
		int ptrA = 0;
		int ptrB = 0;

		while ( ptrA < s.length() && ptrB < t.length() )
		{
			if ( s.charAt( ptrA ) == s.charAt( ptrB ) )
				ptrA++;
			ptrB++;
		}

		return ptrA == s.length();
	}
}
