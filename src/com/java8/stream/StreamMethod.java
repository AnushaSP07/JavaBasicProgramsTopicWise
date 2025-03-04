package com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamMethod {

	public static void main(String[] args) {
		/*
		 * 1. Stream.ofNullable() 
		 * 2. Stream.iterate(); 
		 * 3. Collectors.collectingAndThen(null, null) 
		 * 4. Stream.takeWhile and Stream.dropWhile 
		 * 5. Collectors.teeing(); 
		 * 6. Stream.concat(null, null); 
		 * 7. Collectors.partitioningBy(null); 
		 * 8. IntStream of Range
		 */
		
		List<String> names = Arrays.asList("Joy","Ross", null, "raj", null, "rock");
	}
}
