package com.integer.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindMergeTwoArrays {

	public static void main(String[] args) {
		int[] a = new int[] { 4, 2, 7, 1 };
		int[] b = new int[] { 8, 3, 9, 5 };
		mergeTwoArrays(a, b);
		mergeTwoArraysInJava8(a, b);
	}

	public static void mergeTwoArrays(int[] a, int[] b) {
		int a1 = a.length;
		int b1 = b.length;
		int c1 = a1 + b1;
		int[] c = new int[c1];
		System.arraycopy(a, 0, c, 0, a1);
		System.arraycopy(b, 0, c, a1, b1);
		System.out.println(Arrays.toString(c));
	}

	public static void mergeTwoArraysInJava8(int[] a, int[] b) {
		int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
		System.out.println(Arrays.toString(c));
	}

}
