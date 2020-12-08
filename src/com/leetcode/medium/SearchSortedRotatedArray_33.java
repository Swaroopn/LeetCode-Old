package com.leetcode.medium;

/*
 * Important
 */
public class SearchSortedRotatedArray_33
{
	public static void main( String[] args )
	{
		System.out.println( searchUsingBinarySearch( new int[]
		{ 4, 5, 6, 7, 0, 1, 2 }, 2 ) );
		System.out.println( search( new int[]
		{ 4, 5, 6, 7, 0, 1, 2 }, 2 ) );
	}

	private static int searchUsingBinarySearch( int[] nums, int key )
	{
		return binarySearchRotated( nums, 0, nums.length - 1, key );
	}

	private static int binarySearchRotated( int[] nums, int low, int high, int key )
	{
		if ( low > high )
			return -1;

		int mid = low + ( high - low ) / 2;
		if ( nums[mid] == key )
			return mid;

		if ( nums[low] <= nums[mid] && key >= nums[low] && key <= nums[mid] )
			return binarySearchRotated( nums, low, mid - 1, key );
		else if ( nums[mid] <= nums[high] && key >= nums[mid] && key <= nums[high] )
			return binarySearchRotated( nums, mid + 1, high, key );
		else if ( nums[low] >= nums[mid] )
			return binarySearchRotated( nums, low, mid - 1, key );
		else if ( nums[high] <= nums[mid] )
			return binarySearchRotated( nums, mid + 1, high, key );

		return -1;
	}

	/*
	 * Linear Search is not Acceptable
	 */
	public static int search( int[] nums, int target )
	{
		int left = 0;
		int right = nums.length - 1;
		while ( left <= right )
		{
			if ( nums[left] == target )
				return left;
			else if ( nums[right] == target )
				return right;
			else
			{
				left++;
				right--;
			}
		}

		return -1;
	}
}
