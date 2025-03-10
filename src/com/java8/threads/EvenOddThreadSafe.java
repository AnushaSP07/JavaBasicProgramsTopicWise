package com.java8.threads;

public class EvenOddThreadSafe {
	public static void main(String[] args) {
		EvenThread even = new EvenThread();
		OddThread odd = new OddThread();
		even.start();
		odd.start();

		try {
			even.join();
			odd.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}

class EvenThreadSafe extends Thread {
	private static final Object lock = new Object(); // Lock object to synchronize

	public void run() {
		for (int i = 2; i <= 100; i += 2) {
			synchronized (lock) {
				System.out.println("Even : " + i);
			}
		}
	}
}

class OddThreadSafe extends Thread {
	private static final Object lock = new Object(); // Lock object to synchronize

	public void run() {
		for (int i = 1; i < 100; i += 2) {
			synchronized (lock) {
				System.out.println(("Odd : " + i));
			}

		}
	}
}
