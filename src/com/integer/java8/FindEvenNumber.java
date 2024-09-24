package com.integer.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindEvenNumber {

	public static void main(String[] args) {
		int[] arr = { 9, 8, 1, 2, 4, 5, 0, 4, 2, 6, 8 };
		findEvenNumber(arr);
	}

	public static void findEvenNumber(int[] arr) {
		Map<Boolean, List<Integer>> map = Arrays.stream(arr).boxed()
				.collect(Collectors.partitioningBy(num -> num % 2 == 0));
		System.out.println("map " + map);
	}
}
