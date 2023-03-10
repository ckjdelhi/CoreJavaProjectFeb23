package com.oops.inheritance;


/*
 * Single Inheritance: A -> B
 * Multilevel Inheritance: A -> B -> C -> D
 * Hierarchy Inheritance: A ->B
 * 						  A ->C
 * 						  A ->D
 * Multiple Inheritance: A, B ->C i.e class C extends A,B (Java doesn't support this using class)
 * Hybrid Inheritance: mix of Hierarchy and Multiple
 */

class A {
	void show() {
		System.out.println("show A");
	}
}

class B extends A{
	void display() {
		System.out.println("display B");
	}	
}

class C extends B {
	
}

class D extends A{
	
}


public class InheritanceDemo {

	public static void main(String[] args) {
		A obj = new A();
		obj.show();
		
		
		B obj2=new B();
		obj2.display();
		obj2.show();
		
		C obj3=new C();
		obj3.show();
		obj3.display();
		
		D obj4=new D();
		obj4.show();
		
	}

}
