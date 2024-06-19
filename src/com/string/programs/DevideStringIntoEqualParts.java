package com.string.programs;

public class DevideStringIntoEqualParts {

	public static void main(String[] args) {
		String s = "aaaabbbbcccc";
		divideStringToEqualParts(s, 3);
	}

	private static void divideStringToEqualParts(String s, int n) {
		int length = s.length();
		int temp = 0;
		int totalChars = length / n;

		String[] str = new String[n];

		if (length % n != 0) {
			System.out.println("cannot divide equally using given n size");
		} else {
			for (int i = 0; i < length; i = i + totalChars) {
				String part = s.substring(i, i + totalChars);
				str[temp] = part;
				temp++;
			}
			System.out.println(n + " equal parts of given strings are");
			for (int i = 0; i < str.length; i++) {
				System.out.println(str[i]);
			}
		}
	}
}
