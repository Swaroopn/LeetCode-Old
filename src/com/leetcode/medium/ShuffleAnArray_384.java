package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShuffleAnArray_384
{
	public static void main( String[] args )
	{
		int[] in = new int[]
		{ 1, 2, 3 };
		ShuffleAnArray_384 obj = new ShuffleAnArray_384( in );
		obj.reset();
		obj.shuffle();
	}

	private int[] array;
	private int[] original;
	private Random rand = new Random();

	public ShuffleAnArray_384( int[] nums )
	{
		array = nums;
		original = nums.clone();
	}

	/** Resets the array to its original configuration and return it. */
	public int[] reset()
	{
		array = original;
		original = original.clone();
		return array;
	}

	/** Returns a random shuffling of the array. */
	public int[] shuffle()
	{
		List<Integer> aux = getArrayCopy();
		for ( int i = 0; i < array.length; i++ )
		{
			int removeIdx = rand.nextInt( aux.size() );
			array[i] = aux.remove( removeIdx );
		}

		return array;
	}

	private List<Integer> getArrayCopy()
	{
		List<Integer> asList = new ArrayList<>();
		for ( int item : array )
			asList.add( item );

		return asList;
	}
}
