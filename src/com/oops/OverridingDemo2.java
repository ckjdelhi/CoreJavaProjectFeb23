package com.oops;

class A {
	void show(int a) {
		System.out.println("show int");
	}
}

class B extends A {

	void show(long a) {
		System.out.println("show long");
	}
}


public class OverridingDemo2 {

	public static void main(String[] args) {
		B obj =new B();
		obj.show(100);
		obj.show(100L);
	}

}
