package com.oops;

/*
 * Same method name with same parameters
 * return type should be same as parent class for Primitive data types
 */
class Parent {
	void show() {
		System.out.println("P show");
	}
	
	Object getName() {
		return "hi";
	}
}


class Child extends Parent {
	void show(int a) { //overloading
		System.out.println("C show int");
	}
	
//	void show() { //overriding 
//		System.out.println("C show");
//	}
	void display() { //inheritance
		System.out.println("C display");
	}
	
	String getName() {//overriding 
		return "";
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		
		
		Child c=new Child();
		c.show();
		c.show(10);
		c.display();

	}

}
