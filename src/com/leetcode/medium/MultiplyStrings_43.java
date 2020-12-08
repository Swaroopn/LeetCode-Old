package com.leetcode.medium;

public class MultiplyStrings_43
{
	public static void main( String[] args )
	{
		System.out.println( multiply( "12", "99" ) );
	}

	public static String multiply( String num1, String num2 )
	{
		if ( "0".equals( num1 ) || "0".equals( num2 ) )
			return "0";

		String str1 = new StringBuilder( num1 ).reverse().toString();
		String str2 = new StringBuilder( num2 ).reverse().toString();
		int[] d = new int[num1.length() + num2.length()];
		for ( int i = 0; i < str1.length(); i++ )
		{
			for ( int j = 0; j < str2.length(); j++ )
			{
				int tempProd = ( str1.charAt( i ) - '0' ) * ( str2.charAt( j ) - '0' );
				d[i + j] += tempProd;
			}
		}

		StringBuilder product = new StringBuilder();
		for ( int i = 0; i < d.length; i++ )
		{
			int mod = d[i] % 10;
			int carry = d[i] / 10;
			if ( ( i + 1 ) < d.length )
				d[i + 1] += carry;

			product.insert( 0, mod );
		}

		// remove front 0's
		while ( product.charAt( 0 ) == '0' && product.length() > 1 )
			product.deleteCharAt( 0 );

		return product.toString();
	}
}
