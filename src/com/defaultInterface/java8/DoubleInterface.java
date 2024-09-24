package com.defaultInterface.java8;

public class DoubleInterface {

	public static void main(String[] args) {
		Test3 test3 = new Parent1();
		test3.getMethod1();
		test3.method1OfTest1();
		test3.method1OfTest2();
		test3.method1OfTest3();
		
		Test2 test2 = new Parent2();
		test2.method1OfTest2();
	}

}

interface Test1 {
	void getMethod1();
	default void method1OfTest1() {
		System.out.println("Method 1 Of Test 1");
	}
}

interface Test2 {
	default void method1OfTest2() {
		System.out.println("Method 1 Of Test 2");
	}
}

interface Test3 extends Test1, Test2 {
	default void method1OfTest3() {
		System.out.println("Method 1 Of Test 3");
	}
}

class Parent1 implements Test3{

	@Override
	public void getMethod1() {
		System.out.println("GetMethod 1");
	}
	
}

class Parent2 implements Test2{
	
}