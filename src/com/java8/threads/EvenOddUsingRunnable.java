package com.java8.threads;

public class EvenOddUsingRunnable {
	public static void main(String[] args) {
		Runnable evenRunnable = new EvenNumber();
		Runnable oddRunnable = new OddNumber();

		Thread evenThread = new Thread(evenRunnable);
		Thread oddThread = new Thread(oddRunnable);

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

class EvenNumber implements Runnable {
	@Override
	public void run() {
		for (int i = 2; i <= 100; i += 2) {
			System.out.println("Even :" + i);
		}
	}
}

class OddNumber implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i < 100; i += 2) {
			System.out.println("Odd :" + i);
		}
	}

}