package com.java8.basicTPoint;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(fibonacciNoRecurssion(10));
		System.out.println(fibonacciRecurssion(10));
	}

	public static int fibonacciNoRecurssion(int n) {
		if (n <= 0)
			return -1;
		if (n == 1)
			return 1;
		if (n == 2)
			return 1;
		int n1 = 0, n2 = 1, n3 = 0;
		for (int i = 2; i < n;) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			return n3;
		}
		return n3;
	}

	public static int fibonacciRecurssion(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * fibonacciRecurssion(n - 1);
	}

}
