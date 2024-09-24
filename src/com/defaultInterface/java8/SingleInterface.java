package com.defaultInterface.java8;

public class SingleInterface {

	public static void main(String[] args) {
		Parent test = new Test();
		test.method1();
		test.method2();
		test.getDefaultMethodData("Data");
	}
}

interface Parent {

	default void getDefaultMethodData(String s) {
		System.out.println("Default Method");
	}

	public void method1();

	public void method2();

}

class Test implements Parent{

	@Override
	public void method1() {
		System.out.println("Overidden method 1");
	}

	@Override
	public void method2() {
		System.out.println("Overidden method 2");
	}
	
}


