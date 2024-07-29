package com.numbers.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeMinMaxNum {

	public static void main(String[] args) {

	}

	public static void findThreeMinAndMax(int[] arr) {
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

		list.stream().sorted().limit(3).forEach(System.out::println);
		list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
	}
}
