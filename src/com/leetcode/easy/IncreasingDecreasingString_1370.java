package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IncreasingDecreasingString_1370
{
	public static void main( String[] args )
	{
		System.out.println( sortString( "ggggggg" ) );
	}

	public static String sortString( String s )
	{
		Map<Character, Integer> map = new HashMap<>();
		String unique = "";
		for ( char ch : s.toCharArray() )
		{
			if ( map.get( ch ) == null )
			{
				unique += ch;
				map.put( ch, 0 );
			}

			map.put( ch, map.get( ch ) + 1 );
		}

		char[] cArr = unique.toCharArray();
		Arrays.parallelSort( cArr );
		unique = String.valueOf( cArr );
		StringBuilder result = new StringBuilder();
		boolean increasingFl = true;
		int index = 0;
		while ( !map.isEmpty() )
		{
			char ch = unique.charAt( index );
			if ( increasingFl )
				index++;
			else
				index--;

			if ( index == unique.length() )
			{
				increasingFl = false;
				index--;
			}
			else if ( index == -1 )
			{
				increasingFl = true;
				index++;
			}

			if ( map.containsKey( ch ) && map.get( ch ) > 0 )
			{
				result.append( ch );
				map.put( ch, map.get( ch ) - 1 );
			}
			else
				map.remove( ch );
		}

		return result.toString();
	}
}
