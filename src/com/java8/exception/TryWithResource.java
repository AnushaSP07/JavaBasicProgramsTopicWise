package com.java8.exception;

import java.io.FileReader;

public class TryWithResource {

	public static void main(String[] args) {
		try(FileReader stream = new FileReader("C://Reader");){
			//statemet
		}catch(Exception e) {
			System.out.println();
		}
	}
}
