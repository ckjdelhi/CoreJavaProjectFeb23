package com.oops.abstraction;

/*
 * Interface:
 * 1. use 'interface' keyword instead of 'class'
 * 2. interface is 100% abstraction
 * 3. all methods are by default abstract and public
 * 4. all variables are by default 'final' or constant type
 * 5. you can't create object of interface
 * 6. you have to always 'implements' interface
 */
public interface InterfaceDemo {
	int a=5;
	void insert(); // public abstract void insert();
	void delete(); // public abstract void delete();
	
	static void show() {
		System.out.println("show");
	}
	
	default void display() {
		System.out.println("display");
	}
}
