package com.oops;

/*
 * 1. Method name should be same
 * 2. with different data types in parameter 
 * 3. with different number of parameters
 * 4. return type doesn't matter
 */
public class OverloadingDemo {

	public static void main(String[] args) {
		OverloadingDemo o=new OverloadingDemo();
		o.show();
		o.show(100);
		o.show("hi");
		o.show(400L);
		o.show(100L, 200);
		o.show(100, 200);
		o.show(100, 200L);
	}
	void show() {
		System.out.println("show");
	}
	int show(int a) {
		System.out.println("show 2");
		return 0;
	}
	
	void show(String a) {
		System.out.println("show 3");
	}
	
	void show(long a) {
		System.out.println("show 4");
	}
	
	void show(long a, int b) {
		System.out.println("show 5");
	}
	void show(int a, int b) {
		System.out.println("show 6");
	}
	void show(int a, long b) {
		System.out.println("show 7");
	}
	
}
