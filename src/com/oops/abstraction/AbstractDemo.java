package com.oops.abstraction;

/*
 * Abstract class:
 * 1. use 'abstract' non access modifiers to class name
 * 2. we can have abstract method and non abstract method(concrete method)
 * 3. abstract method doen't have body
 * 4. we can't create object of abstract class
 * 5. using inheritance we can access class methods and variables
 * 6. child class must give the implementation of abstract method
 */

//50% abstraction
public abstract class AbstractDemo implements InterfaceDemo{
	
	public AbstractDemo() {
		System.out.println("const 1");
	}

	//concrete method
	void show() {
		System.out.println("show");
	}
	
	//abstract method
	abstract void display1s();
	
	//abstract int add(int a, int b);
	abstract void test();
}
