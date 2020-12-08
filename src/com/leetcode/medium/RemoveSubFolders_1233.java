package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSubFolders_1233
{
	public static void main( String[] args )
	{
		System.out.println( removeSubfolders( new String[]
		{ "/a", "/a/b", "/c/d", "/c/d/e", "/c/f" } ) );
	}

	public static List<String> removeSubfolders( String[] folder )
	{
		Arrays.sort( folder );

		String prev = folder[0];

		List<String> parentFolderList = new ArrayList<>();
		parentFolderList.add( prev );
		for ( int i = 1; i < folder.length; i++ )
		{
			String curr = folder[i];

			if ( curr.startsWith( prev ) && curr.charAt( prev.length() ) == '/' )
				continue;
			else
			{
				parentFolderList.add( curr );
				prev = curr;
			}

		}

		return parentFolderList;
	}
}
