package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCode_804
{
	public int uniqueMorseRepresentations( String[] words )
	{
		String[] morseAlpha = new String[]
		{ ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

		Set<String> set = new HashSet<>();
		for ( String word : words )
		{
			StringBuilder sbr = new StringBuilder();
			for ( char ch : word.toCharArray() )
			{
				sbr.append( morseAlpha[ch - 'a'] );
			}

			set.add( sbr.toString() );
		}

		return set.size();
	}
}
