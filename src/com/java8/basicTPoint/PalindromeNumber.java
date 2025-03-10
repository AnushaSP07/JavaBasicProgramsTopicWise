package com.java8.basicTPoint;

public class PalindromeNumber {

	public static void main(String[] args) {

	}

	public static boolean isPalindromeBruteForce(int num) {
		if (num < 0) {
			return false;
		}
		int original = num, reversed = 0;
		while (num > 0) {
			reversed = reversed * 10 + num % 10;
			num /= 10;
		}
		return original == reversed;
	}

	public static boolean isPalindromeRecursive(int num) {
		if (num < 0) {
			return false;
		}
		return num == reverseNum(num, 0);
	}

	public static int reverseNum(int num, int rev) {
		if (num == 0)
			return rev;
		return reverseNum(num / 10, rev * 10 + num % 10);
	}
}
