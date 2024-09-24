package com.abstractTypes.java8;

/*when you are creating default Constructor of a parent class and then no need to create 
 * a default constructor in child class
 * 
 * but if you create a parameterized constructor in parent class then you have to provide a default constructor in parent
 * if you are providing default constructor in child class*/
public class AbstractClassExamples {

	public static void main(String[] args) {
		AbstractParent abstractParent = new ChildForAbstract();
		abstractParent.abstractMethodInParent();
		abstractParent.getDataFromParent();
	}
}

abstract class AbstractParent {

	private int n;
	private int m;

	AbstractParent() {
		System.out.println("Abstract class no param constructor");
	}

	AbstractParent(int n, int m) {
		this.n = n;
		this.m = m;
		System.out.println("from abstract m = " + m + " n " + n);
	}

	abstract void abstractMethodInParent();

	void getDataFromParent() {
		System.out.println("Parent method non abstract method n = " + n + " m = " + m);
	}

}

class ChildForAbstract extends AbstractParent {

//	ChildForAbstract() {
//		System.out.println("child no param constructor");
//	}

	@Override
	void abstractMethodInParent() {
		System.out.println("Calling overriden from Child class");
	}

}