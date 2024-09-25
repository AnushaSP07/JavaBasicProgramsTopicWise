package com.integer.java8;

import java.util.Arrays;
import java.util.List;

public class FindSumOfAllDigitInList {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		sumOfAllDigit(arr);
	}

	public static void sumOfAllDigit(int[] arr) {
		List<Integer> list = Arrays.stream(arr).boxed().toList();
		System.out.println(list.stream().mapToInt(Integer::intValue).sum());
	}

}
