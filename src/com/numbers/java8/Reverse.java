package com.numbers.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse {

	public static void main(String[] args) {
		int[] arr = { 12, 44, 12, 3, 6, 7, 88, 22, 0, 99 };
		System.out.println(reverseNum(arr));
	}

	public static List<Integer> reverseNum(int[] arr) {
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

		return list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	}
}
