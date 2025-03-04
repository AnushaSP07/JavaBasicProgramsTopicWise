package com.java8.integer;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class FindEvenAndOdd {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 4, 11, 12, 16, 77, 76, 85, 99, 100, 124 };
		getEvenAndOddUsingFilter(arr);
		getEvenOddUsingPartition(arr);
		getEvenOddUsingSet(arr);
	}

	public static void getEvenAndOddUsingFilter(int[] arr) {
		List<Integer> list = Arrays.stream(arr).boxed().filter(num -> num % 2 == 0).toList();
		System.out.println("even and odd using filter " + list);
	}

	public static void getEvenOddUsingPartition(int[] arr) {
		Map<Boolean, List<Integer>> list = Arrays.stream(arr).boxed()
				.collect(Collectors.partitioningBy(num -> num % 2 == 0));
		System.out.println("Even and odd using partitioningBy " + list);
	}

	public static void getEvenOddUsingSet(int[] arr) {
		Map<Boolean, List<Integer>> list = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(num -> num % 2 == 0));
		Set<Entry<Boolean, List<Integer>>> set = list.entrySet();
		for (Entry<Boolean, List<Integer>> entry : set) {
			if (entry.getKey()) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}
			List<Integer> listData = entry.getValue();
			for (int num : listData) {
				System.out.println(num);
			}
		}
	}

}
