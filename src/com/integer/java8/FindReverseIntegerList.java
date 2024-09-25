package com.integer.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindReverseIntegerList {

	public static void main(String[] args) {

	}
	
	public static void reverseList(int[] num) {
		List<Integer> list = Arrays.stream(num).boxed().toList();
		list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		}

}
