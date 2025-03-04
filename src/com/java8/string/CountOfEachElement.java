package com.java8.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfEachElement {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Pen");
		list.add("Pencil");
		list.add("Data");
		list.add("Pen");
		list.add("User");
		list.add("Data");
		countEachElement(list);
		
	}
	
	public static void countEachElement(List<String> str) {
		Map<String, Long> mapObject = str.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(mapObject);
	}
}
