package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class OrderedStream
{
	public static void main( String[] args )
	{
		OrderedStream obj = new OrderedStream( 5 );
		System.out.println( obj.insert( 3, "ccccc" ) );
		System.out.println( obj.insert( 1, "aaaaa" ) );
		System.out.println( obj.insert( 2, "bbbbb" ) );
		System.out.println( obj.insert( 5, "eeeee" ) );
		System.out.println( obj.insert( 4, "ddddd" ) );
	}

	MyObj[] values;
	int ptr = 0;

	public OrderedStream( int n )
	{
		values = new MyObj[n];
	}

	public List<String> insert( int id, String value )
	{
		MyObj obj = new MyObj( id, value );
		values[id - 1] = obj;

		List<String> res = fetchArrVals();
		setPointer();

		return res;
	}

	private void setPointer()
	{
		int i = 0;
		for ( ; i < values.length; i++ )
			if ( values[i] == null )
				break;

		ptr = i;
	}

	public List<String> fetchArrVals()
	{
		List<String> list = new ArrayList<>();
		for ( int i = ptr; i < values.length; i++ )
		{
			if ( values[i] == null )
				break;
			else
				list.add( values[i].getValue() );
		}

		return list;
	}
}

class MyObj
{
	int id;
	String value;

	public MyObj( int id, String value )
	{
		this.id = id;
		this.value = value;
	}

	public String getValue()
	{
		return this.value;
	}
}