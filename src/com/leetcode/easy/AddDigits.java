package com.leetcode.easy;

public class AddDigits
{
	public static void main( String[] args )
	{
		System.out.println( addDigits( 38 ) );
		System.out.println( addDigitsEff( 38 ) );
	}

	private static int addDigitsEff( int num )
	{
		int oneDigitSum = 0;
		while ( num > 0 )
		{
			oneDigitSum += num % 10;
			num = num / 10;

			if ( num == 0 && oneDigitSum > 9 )
			{
				num = oneDigitSum;
				oneDigitSum = 0;
			}
		}

		return oneDigitSum;
	}

	public static int addDigits( int num )
	{
		while ( num >= 10 )
		{
			num = splitDigits( num + "" );
		}

		return num;
	}

	public static int splitDigits( String num )
	{
		int sum = 0;
		for ( char digit : num.toCharArray() )
			sum += Character.getNumericValue( digit );

		return sum;
	}
}
