package com.string.programs;

import java.util.Arrays;

public class AnagramStringOrNot {

	public static void main(String[] args) {
		String s1 = "grab";
		String s2 = "brag";
		anagramOrNot(s1, s2);

		
	}

	private static boolean anagramOrNot(String s1, String s2) {
		boolean isAnagram = false;
		if(s1.length() != s2.length()) {
			System.out.println(isAnagram);
			return isAnagram;
		}
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2)) {
			isAnagram = true;
			System.out.println(isAnagram);
			return isAnagram;
		}
		System.out.println(isAnagram);
		return isAnagram;
	}
}
