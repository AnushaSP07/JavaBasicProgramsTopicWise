package com.string.programs;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String s = "add ing word s wi th sp a ce";
		removeWhiteSpace(s);
	}
	
	public static void removeWhiteSpace(String s) {
		s = s.replaceAll("\\s", "");
		System.out.println(s);
	}
}
