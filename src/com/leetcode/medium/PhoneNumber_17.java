package com.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneNumber_17
{
	Map<String, String> phoneMap = getPhoneNumMap();
	List<String> output = new ArrayList<>();

	public static void main( String[] args )
	{
		PhoneNumber_17 obj = new PhoneNumber_17();
		System.out.println( obj.letterCombinations( "23" ) );
	}

	public List<String> letterCombinations( String digits )
	{
		if ( !digits.isEmpty() )
			backtrack( "", digits );

		return output;
	}

	public void backtrack( String combination, String nextDigits )
	{
		if ( nextDigits.isEmpty() )
			output.add( combination );
		else
		{
			String digit = nextDigits.substring( 0, 1 );
			String letters = phoneMap.get( digit );
			for ( int i = 0; i < letters.length(); i++ )
			{
				String letter = phoneMap.get( digit ).substring( i, i + 1 );
				backtrack( combination + letter, nextDigits.substring( 1 ) );
			}
		}
	}

	public Map<String, String> getPhoneNumMap()
	{
		Map<String, String> map = new HashMap<>();
		map.put( "2", "abc" );
		map.put( "3", "def" );
		map.put( "4", "ghi" );
		map.put( "5", "jkl" );
		map.put( "6", "mno" );
		map.put( "7", "pqrs" );
		map.put( "8", "tuv" );
		map.put( "9", "wxyz" );

		return map;
	}
}
