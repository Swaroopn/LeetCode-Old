package com.leetcode.easy;

public class ExcelSheetColumnTitle
{
	public static void main( String[] args )
	{
		System.out.println( convertToTitle( 30 ) );
		System.out.println( titleToNumber( "AAA" ) );
	}

	public static String convertToTitle( int columnNumber )
	{
		StringBuilder sbr = new StringBuilder();
		while ( columnNumber > 0 )
		{
			int rem = columnNumber % 26;
			if ( rem == 0 )
			{
				sbr.append( "Z" );
				columnNumber = ( columnNumber / 26 ) - 1;
			}
			else
			{
				sbr.append( ( char ) ( rem - 1 + 'A' ) );
				columnNumber = columnNumber / 26;
			}
		}

		// Reverse the string and print result 
		return sbr.reverse().toString();
	}

	public static int titleToNumber( String str )
	{
		int result = 0;
		for ( int i = 0; i < str.length(); i++ )
		{
			char ch = str.charAt( i );
			result = result * 26 + ch - 'A' + 1;
		}

		return result;
	}
}
