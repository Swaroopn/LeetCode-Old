package com.leetcode.easy;

public class SortedArrayToBST_108
{
	public TreeNode sortedArrayToBST( int[] nums )
	{
		if ( nums.length == 0 )
			return null;

		return constructBSTRecursively( nums, 0, nums.length - 1 );
	}

	private TreeNode constructBSTRecursively( int[] nums, int left, int right )
	{
		if ( left > right )
			return null;

		int mid = left + ( right - left ) / 2;
		TreeNode curr = new TreeNode( nums[mid] );
		curr.left = constructBSTRecursively( nums, left, mid - 1 );
		curr.right = constructBSTRecursively( nums, mid + 1, right );
		return curr;
	}
}
