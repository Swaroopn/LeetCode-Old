package com.leetcode.easy;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortArrayByFrequency_1636
{
	public static void main( String[] args )
	{
		System.out.println( frequencySort( new int[]
		{ 1, 1, 2, 2, 2, 3 } ) );
	}

	public static int[] frequencySort( int[] nums )
	{
		Map<Integer, Integer> freqMap = new HashMap<>();
		for ( int num : nums )
		{
			freqMap.put( num, freqMap.getOrDefault( num, 0 ) + 1 );
		}

		Comparator<Map.Entry<Integer, Integer>> valueComparator = new Comparator<Map.Entry<Integer, Integer>>()
		{
			@Override
			public int compare( Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2 )
			{
				return e1.getValue() == e2.getValue() ? ( e1.getKey() < e2.getKey() ? 1 : -1 ) : ( e1.getValue() < e2.getValue() ? -1 : 1 );
			}
		};

		LinkedHashMap<Integer, Integer> sortedMap = freqMap.entrySet().stream().sorted( valueComparator ).collect( Collectors.toMap( Map.Entry::getKey, Map.Entry::getValue, ( oldValue, newValue ) -> oldValue, LinkedHashMap::new ) );

		int[] result = new int[nums.length];
		int index = 0;
		for ( Map.Entry<Integer, Integer> e : sortedMap.entrySet() )
		{
			for ( int i = 0; i < e.getValue(); i++ )
				result[index++] = e.getKey();
		}

		return result;
	}

}
