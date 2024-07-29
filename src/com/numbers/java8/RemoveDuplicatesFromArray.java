package com.numbers.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int[] arr = {2,4,3,5,6,7,1,4,6};
		removeDuplicates(arr);
	}
	
	public static void removeDuplicates(int[] arr) {
		List<Integer> integerList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		List<Integer> nonDuplicates = integerList.stream().distinct().collect(Collectors.toList());
		System.out.println(nonDuplicates);
	}
}
