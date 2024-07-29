package com.numbers.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MinAndMax {

	public static void main(String[] args) {
		int[] arr = {45, 12, 56, 15, 24, 75, 31, 89};
		minAndMax(arr);
	}
	
	public static void minAndMax(int[] arr) {
		List<Integer> integerList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		int max = integerList.stream().max(Comparator.naturalOrder()).get();
		int min = integerList.stream().min(Comparator.naturalOrder()).get();
		System.out.println("min "+min +" max "+max);
	}
}
