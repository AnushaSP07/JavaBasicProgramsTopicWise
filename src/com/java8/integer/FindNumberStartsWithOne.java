package com.java8.integer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumberStartsWithOne {

	public static void main(String[] args) {
		int[] arr = { 1, 21, 12, 41, 14, 51, 15, 78, 81, 18, 1, 12, 14, 1111, 151 };
		getNumberStartsWithOne(arr);
	}

	public static void getNumberStartsWithOne(int[] arr) {
		List<String> list = Arrays.stream(arr).boxed().map(num -> num + "").filter(num -> num.startsWith("1"))
				.distinct().collect(Collectors.toList());
		System.out.println("number starts with one " + list);
		List<Integer> listData = Arrays.stream(arr).boxed().filter(num -> num / 10 == 1).collect(Collectors.toList());
		System.out.println("number starts with one without using startWith will not work for 3 digits " + listData);
	}

}
