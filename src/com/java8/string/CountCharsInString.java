package com.java8.string;

public class CountCharsInString {

	public static void main(String[] args) {
		String s = "Testing number of chars in a String";
		countCharsInString(s);
		countPunctuationInString("He said, 'The mailman loves you.' I heard it with my own ears.");
	}

	private static void countCharsInString(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("total Number of chars in string = "+count);
	}
	
	private static void countPunctuationInString(String s) {
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '!' || s.charAt(i) == ',' || s.charAt(i) == ';' || s.charAt(i) == '.' ||  s.charAt(i) == '?' || s.charAt(i) == '-' ||    
					s.charAt(i) == '\'' || s.charAt(i) == '\"' || s.charAt(i) == ':') {
				count++;
			}
		}
		System.out.println("Punctuations in a string = "+count);
	}
}
