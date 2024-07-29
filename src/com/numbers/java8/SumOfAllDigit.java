package com.numbers.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfAllDigit {

	public static void main(String[] args) {
		int[] arr = {2,5,7,1,8,0,1};
		sumOfAll(arr);
	}
	
	public static void sumOfAll(int[] arr) {
		List<Integer> integerList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		int tot = integerList.stream().mapToInt(Integer::intValue).sum();
		System.out.println("total "+tot);
	}
}
