package com.leetcode.easy;

import java.util.function.Predicate;

public class DetectCapital
{
	public static void main( String[] args )
	{
		System.out.println( detectCapitalUse( "USA" ) );
		System.out.println( detectCapitalUseEff( "USA" ) );
		System.out.println( detectCapitalUseEff2( "USA" ) );
	}

	public static boolean detectCapitalUse( String word )
	{
		int totalCapitals = 0;
		for ( char letter : word.toCharArray() )
		{
			if ( Character.isUpperCase( letter ) )
				totalCapitals++;
		}

		if ( totalCapitals == 0 || totalCapitals == word.length() )
			return true;
		else if ( totalCapitals == 1 && Character.isUpperCase( word.charAt( 0 ) ) )
			return true;
		return false;
	}

	public static boolean detectCapitalUseEff( String word )
	{
		int N = word.length();

		if ( N <= 1 )
			return true;

		// case 1. All UpperCase
		if ( Character.isUpperCase( word.charAt( 0 ) ) && Character.isUpperCase( word.charAt( 1 ) ) )
		{
			for ( int i = 2; i < N; i++ )
			{
				if ( Character.isLowerCase( word.charAt( i ) ) )
					return false;
			}
		}
		// case 2 and 3
		else
		{
			for ( int i = 1; i < N; i++ )
			{
				if ( Character.isUpperCase( word.charAt( i ) ) )
					return false;
			}
		}

		return true;
	}

	public static boolean detectCapitalUseEff2( String word )
	{
		if ( word.length() <= 1 )
			return true;

		Predicate<Character> correctCase = Character::isLowerCase;
		if ( Character.isUpperCase( word.charAt( 0 ) ) && Character.isUpperCase( word.charAt( 1 ) ) )
			correctCase = Character::isUpperCase;

		for ( int i = 1; i < word.length(); i++ )
		{
			if ( !correctCase.test( word.charAt( i ) ) )
				return false;
		}

		return true;
	}
}