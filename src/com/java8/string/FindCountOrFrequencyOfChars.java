package com.java8.string;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindCountOrFrequencyOfChars {

	public static void main(String[] args) {
		String s = "I will achive evervthing I want";
		findCountOfChars(s);
	}

	public static void findCountOfChars(String s) {
		Map<Character, Long> mapObject = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(mapObject);
	}
}
