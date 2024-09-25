package com.integer.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindThreeMinAndMaxNum {

	public static void main(String[] args) {
		int[] arr = { 12, 99, 00, 999, 11 };
		getThreeMinAndMax(arr);
	}

	public static void getThreeMinAndMax(int[] arr) {
		List<Integer> maxList = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).limit(3).toList();
		System.out.println("Max number limit of 3 = " + maxList);
		List<Integer> minList = Arrays.stream(arr).boxed().sorted(Comparator.naturalOrder()).limit(3).toList();
		System.out.println("Min number limit of 3 = " + minList);
	}

}
