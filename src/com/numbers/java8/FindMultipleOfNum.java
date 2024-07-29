package com.numbers.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindMultipleOfNum {

	public static void main(String[] args) {
		int[] arr = {45, 12, 56, 15, 24, 75, 31, 89};
		multipleOfNum(arr);
	}
	
	public static void multipleOfNum(int[] arr) {
		List<Integer> integerList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> list = integerList.stream().filter(multipleData -> multipleData % 5 == 0).collect(Collectors.toList());
		System.out.println(list);
	}
}
