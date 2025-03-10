package com.java8.threads;

public class ThreadSafeCounter {
	private int count = 0;

	public synchronized void increment() {
		count++;
	}
	public synchronized int getCount() {
		return count;
	}
	
	public static void main(String[] args) {
		var counter = new ThreadSafeCounter();
		System.out.println(counter.getCount());
	}
}

class Counter{
	
}