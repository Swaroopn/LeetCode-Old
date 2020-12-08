package com.leetcode.medium;

import java.util.Stack;

public class DecodeString_394
{
	public static void main( String[] args )
	{
		System.out.println( decodeString( "100[leetcode]" ) );
	}

	public static String decodeString( String s )
	{
		int N = s.length();
		Stack<Integer> countStack = new Stack<>();
		Stack<String> strStack = new Stack<>();

		String str = "";
		for ( int i = 0; i < N; i++ )
		{
			char ch = s.charAt( i );

			if ( Character.isDigit( ch ) )
			{
				int num = ch - '0';
				// It can be 3 or 300                
				while ( i + 1 < N && Character.isDigit( s.charAt( i + 1 ) ) )
				{
					num = num * 10 + ( s.charAt( i + 1 ) - '0' );
					i++;
				}

				countStack.push( num );
			}
			else if ( ch == '[' )
			{
				strStack.push( str );
				str = "";
			}
			else if ( ch == ']' )
			{
				StringBuilder temp = new StringBuilder( strStack.pop() );
				int times = countStack.pop();
				while ( times-- > 0 )
					temp.append( str );

				str = temp.toString();
			}
			else
				str += ch;
		}

		return str;
	}
}
