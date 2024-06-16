package com.string.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsInString {

	public static void main(String[] args) {
		String s = "Testing user data to find duplicate characters";
		findDuplicateChars(s);
	}

	public static void findDuplicateChars(String s) {
		char[] c = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();

		for (char ch : c) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		Set<Character> set = map.keySet();
		System.out.println("set "+set);
		for (Character count : set) {
			if (map.get(count) > 1) {
				System.out.println(count + " : " + map.get(count));
			}
		}
	}
}
