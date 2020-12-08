package com.leetcode.easy;

public class ReverseOnlyLetters_917
{
	public static void main( String[] args )
	{
		System.out.println( reverseOnlyLetters( "Test1ng-Leet=code-Q!" ) );
	}

	public static String reverseOnlyLetters( String S )
	{
		int start = 0;
		int end = S.length() - 1;
		char[] temp = S.toCharArray();
		while ( start < end )
		{
			if ( !Character.isAlphabetic( temp[start] ) )
			{
				start++;
				continue;
			}
			else if ( !Character.isAlphabetic( temp[end] ) )
			{
				end--;
				continue;
			}

			char t = temp[start];
			temp[start] = temp[end];
			temp[end] = t;

			start++;
			end--;
		}

		return String.valueOf( temp );
	}
}
