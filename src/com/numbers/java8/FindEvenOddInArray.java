package com.numbers.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class FindEvenOddInArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 4, 5, 1, 2, 4, 7, 6, 9, 0, 3, 1, 0 };
		findDuplicatesInArray(arr);
		seperateEvenAndOdd(arr);
		seperateEvenOdd(arr);
	}

	public static void findDuplicatesInArray(int[] arr) {
		// Arrays.parallelSort(arr);
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		list.stream().distinct().filter(num -> num % 2 == 0).forEach(System.out::print);
	}

	public static void seperateEvenAndOdd(int[] arr) {
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

		Map<Boolean, List<Integer>> oddEvenMap = list.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
		System.out.println(oddEvenMap + "map");
		Set<Entry<Boolean, List<Integer>>> set = oddEvenMap.entrySet();
		System.out.println("set " + set);
		for (Entry<Boolean, List<Integer>> entryList : set) {
			if (entryList.getKey()) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}
			List<Integer> listData = entryList.getValue();
			for (int i : listData) {
				System.out.println(i);
			}
		}
	}

	public static void seperateEvenOdd(int[] arr) {
		List<Integer> integerList = Arrays.stream(arr).boxed().collect(Collectors.toList());

		Map<Boolean, List<Integer>> mapObject = integerList.stream()
				.collect(Collectors.partitioningBy(i -> i % 2 == 0));
		Set<Entry<Boolean, List<Integer>>> setObject = mapObject.entrySet();

		for (Entry<Boolean, List<Integer>> entrySet : setObject) {
			if (entrySet.getKey()) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}
			List<Integer> list = entrySet.getValue();
			for (int i : list) {
				System.out.println(i);
			}
		}

	}
}
