package com.integer.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindMinAndMaxNumber {

	public static void main(String[] args) {
		int[] nums = { 99, 27, 87, 22, 0, 1, -1, -5, 98, 999 };
		getMinAndMaxNumber(nums);
	}

	public static void getMinAndMaxNumber(int[] arr) {
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		int min = list.stream().min(Comparator.naturalOrder()).get();
		int max = list.stream().max(Comparator.naturalOrder()).get();
		System.out.println("min and max using comparator " + min + " max " + max);
		int minn = list.stream().min(Integer::compare).get();
		int maxx = list.stream().max(Integer::compare).get();
		System.out.println("min and max using Integer.compare " + minn + " max " + maxx);
	}

}
