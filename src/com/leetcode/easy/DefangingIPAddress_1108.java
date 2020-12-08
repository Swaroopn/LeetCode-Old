package com.leetcode.easy;

public class DefangingIPAddress_1108
{
	public static void main( String[] args )
	{
		System.out.println( defangIPaddr( "1.1.1.1" ) );
	}

	public static String defangIPaddr( String address )
	{
		StringBuilder sbr = new StringBuilder();
		for ( char ch : address.toCharArray() )
		{
			if ( ch == '.' )
				sbr.append( "[" ).append( ch ).append( "]" );
			else
				sbr.append( ch );
		}

		return sbr.toString();
	}
}
