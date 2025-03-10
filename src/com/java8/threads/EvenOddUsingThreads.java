package com.java8.threads;

public class EvenOddUsingThreads {
	public static void main(String[] args) {
		EvenThread evenThread = new EvenThread();
		OddThread oddThread = new OddThread();
		evenThread.start();
		oddThread.start();

		try {
			evenThread.join();
			oddThread.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

}

class EvenThread extends Thread {
	public void run() {
		for (int i = 2; i <= 100; i += 2) {
			System.out.println("Even : " + i);
		}
	}
}

class OddThread extends Thread {
	public void run() {
		for (int i = 1; i < 100; i += 2) {
			System.out.println(("Odd : " + i));
		}
	}
}
