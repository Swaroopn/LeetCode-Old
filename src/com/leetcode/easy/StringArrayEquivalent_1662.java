package com.leetcode.easy;

public class StringArrayEquivalent_1662
{
	public boolean arrayStringsAreEqual( String[] word1, String[] word2 )
	{
		StringBuilder sbr1 = new StringBuilder();
		StringBuilder sbr2 = new StringBuilder();

		for ( String word : word1 )
			sbr1.append( word );
		for ( String word : word2 )
			sbr2.append( word );

		return sbr1.toString().equals( sbr2.toString() );
	}
}
