package com.polymorphism.java8;

/*In runtime polymorphism,
when we create an object of child class keeping parent as refernece 
the call will happen from child method

when we create an object of parent class keeping parent itself as reference
the call will happen from parent method */

public class RunTimePolyMor {

	public static void main(String[] args) {
		/* Keeping Parent as reference and creating object of Parent*/
		Parent parent1 = new Parent();
		parent1.parentMethod1();
		/* Keeping Parent as reference and creating object of Child*/
		Parent parent2 = new Child();
		parent2.parentMethod1();
		/* Keeping Child as reference and creating object of Child*/
		Child child1 = new Child();
		child1.childMethod();
		child1.parentMethod1();
	}
}

class Parent {
	void parentMethod1() {
		System.out.println("Hi this is parent method");
	}
}

class Child extends Parent {
	void parentMethod1() {
		System.out.println("Hi this is from child method");
	}

	void childMethod() {
		System.out.println("Hi This is Child method");
	}
}