package com.java8.polymorphism;

public class CompileTimePolymor {

	public static void main(String[] args) {
		CompilePolyParent parent1 = new CompilePolyParent();
		parent1.method1();
		parent1.method2("data1", "data2");
		parent1.method1(9);
		parent1.method2("data1");
		CompilePolyParent parent2 = new CompilePolyChild();
		parent2.method1();
		parent2.method2("data1", "data2");
		parent2.method1(9);
		parent2.method2("data1");
	}
}

class CompilePolyParent {
	void method1() {
		System.out.println("Method with No Param in parent");
	}

	void method2(String s1, String s2) {
		System.out.println("Method with two Param in parent");
	}

	/* cannot override the method without changing the number of args */
	void method1(int n) {
		System.out.println("overridden method from parent");
	}

	void method2(String s1) {
		System.out.println("overridden method of String from parent");
	}
}

class CompilePolyChild extends CompilePolyParent {
	void method1() {
		System.out.println("Method with No Param in parent");
	}

	void method2(String s1, String s2) {
		System.out.println("Method with two Param in parent");
	}

	/* cannot override the method without changing the number of args */
	void method1(int n) {
		System.out.println("overridden method from child");
	}

	void method2(String s1) {
		System.out.println("overridden method of String from child");
	}
}