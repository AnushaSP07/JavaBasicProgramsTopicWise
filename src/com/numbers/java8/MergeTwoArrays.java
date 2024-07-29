package com.numbers.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int[] a = new int[] {4, 2, 7, 1};
        int[] b = new int[] {8, 3, 9, 5};
        mergeTwoArray(a,b);
	}
	
	public static void mergeTwoArray(int[] arr1, int[] arr2) {
		int[] c = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
		System.out.println(Arrays.toString(c));
	}
}
