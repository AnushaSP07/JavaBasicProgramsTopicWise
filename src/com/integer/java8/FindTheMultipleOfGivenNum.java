package com.integer.java8;

import java.util.Arrays;
import java.util.List;

public class FindTheMultipleOfGivenNum {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 3, 6, 7, 9, 12, 15, 16, 21, 18 };
		getMultipleOfGivenNum(arr, 3);
	}

	public static void getMultipleOfGivenNum(int[] arr, int num) {
		List<Integer> list = Arrays.stream(arr).boxed().filter(val -> val % num == 0).toList();
		System.out.println("multiple of given num " + list);
	}

}
