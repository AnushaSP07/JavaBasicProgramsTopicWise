package com.java8.basicTPoint;

public class PalindromeString {
	public static void main(String[] args) {

	}

	public static boolean palindrome(String s) {
		int left = 0, right = s.length() - 1;
		while (left < right) {
			if (s.charAt(left) != s.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}

	public static boolean isPalindromeRecursive(String s, int left, int right) {
		if (left >= right)
			return true;
		if (s.charAt(left) != s.charAt(right))
			return false;
		return isPalindromeRecursive(s, left + 1, right - 1);
	}
}
