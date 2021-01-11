package com.leetcode.medium;

public class DecodedString_880
{
	public static void main( String[] args )
	{
		System.out.println( decodeAtIndex( "leet2code3", 10 ) );
		System.out.println( decodeAtIndexEff( "leet2code3", 10 ) );
	}

	private static String decodeAtIndexEff( String S, int K )
	{
		long size = 0;
		int N = S.length();

		for ( int i = 0; i < N; i++ )
		{
			char ch = S.charAt( i );
			if ( Character.isDigit( ch ) )
				size *= ch - '0';
			else
				size++;
		}

		for ( int i = N - 1; i >= 0; i-- )
		{
			char ch = S.charAt( i );
			K %= size;
			if ( K == 0 && Character.isLetter( ch ) )
				return String.valueOf( ch );

			if ( Character.isDigit( ch ) )
				size /= ch - '0';
			else
				size--;
		}

		return null;
	}

	public static String decodeAtIndex( String S, int K )
	{
		StringBuilder result = new StringBuilder();
		for ( char ch : S.toCharArray() )
		{
			if ( Character.isAlphabetic( ch ) )
			{
				result.append( ch );
			}
			else
			{
				String temp = result.toString();
				int count = Character.getNumericValue( ch ) - 1;
				for ( int i = 0; i < count; i++ )
				{
					result.append( temp );
				}
<<<<<<< HEAD
=======
				;
>>>>>>> 92b4f99a37690f59e5bc5d2fa42b104e3318f4bd
			}

			if ( result.length() > K - 1 )
				return String.valueOf( result.charAt( K - 1 ) );
		}

		return String.valueOf( result.charAt( K - 1 ) );
	}
}
