package com.java8.basicTPoint;

public class PrimeNumbers {
	public static void main(String[] args) {
		System.out.println(primeOrNot(3));
		System.out.println(isPrimeRecursive(12, 6));
	}

	public static boolean primeOrNot(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrimeRecursive(int n, int i) {
		/* i is n/2 here */
		if (n < 2)
			return false;
		if (n == 1)
			return true;
		if (n % i == 0)
			return false;
		return isPrimeRecursive(n, i - 1);
	}
}
