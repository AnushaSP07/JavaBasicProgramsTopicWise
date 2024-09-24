package com.integer.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumberStartsWithOne {

	public static void main(String[] args) {
		int[] arr = { 1, 21, 12, 41, 14, 51, 15, 78, 81, 18, 1, 12, 14, 1111 };
		getNumberStartsWithOne(arr);
	}

	public static void getNumberStartsWithOne(int[] arr) {
		List<String> list = Arrays.stream(arr).boxed().map(num -> num + "").filter(num -> num.startsWith("1"))
				.distinct().collect(Collectors.toList());
		System.out.println("list " + list);
	}

}
