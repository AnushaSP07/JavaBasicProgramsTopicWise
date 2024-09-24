package com.integer.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicate {

	public static void main(String[] args) {
		int[] arr = { 9, 8, 1, 2, 4, 5, 0, 4, 2, 6, 8, 1, 8, 9, 3 };
		findDuplicates(arr);
	}

	public static void findDuplicates(int[] arr) {
		List<Integer> list = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
		System.out.println("list" + list);
	}
}
