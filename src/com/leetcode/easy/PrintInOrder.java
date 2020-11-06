package com.leetcode.easy;

public class PrintInOrder
{
	int currentThread;

	public PrintInOrder()
	{
		currentThread = 1;
	}

	public synchronized void first( Runnable printFirst ) throws InterruptedException
	{
		while ( currentThread != 1 )
			wait();

		printFirst.run();
		currentThread = 2;
		notifyAll();

	}

	public synchronized void second( Runnable printSecond ) throws InterruptedException
	{

		while ( currentThread != 2 )
			wait();

		printSecond.run();
		currentThread = 3;
		notifyAll();
	}

	public synchronized void third( Runnable printThird ) throws InterruptedException
	{
		while ( currentThread != 3 )
			wait();

		printThird.run();
		currentThread = 0;
		notifyAll();
	}
}