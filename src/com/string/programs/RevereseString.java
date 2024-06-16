package com.string.programs;

/**
 * Reverse String using 3 ways
 */
public class RevereseString {

	public static void main(String[] args) {
		String s = "revering string";
		revereseStringUsingForLoop(s);
	}

	/**
	 * @param Reversing String using for loop Reverse iteration
	 */
	public static void revereseStringUsingForLoop(String s) {
		char[] c = s.toCharArray();

		for (int i = c.length - 1; i >= 0; i--) {
			System.out.print(c[i]);
		}
	}

	/**
	 * Reverse string using string builder/buffer
	 * 
	 * @param s
	 */
	public static void reverseUsingStringReverseMethod(String s) {
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());
	}

	/**
	 * Reverse String using recursive method
	 * 
	 * @param s
	 */
	public static void reverseStringUsingRecurssiveMethod(String s) {
		if (s.length() <= 0) {
			System.out.println("empty");
		} else {
			reverseStringUsingRecurssiveMethod(s.substring(1) + s.charAt(0));
			reverseStringUsingRecurssiveMethod(s.substring(0, s.length() - 1));
		}
	}
}
