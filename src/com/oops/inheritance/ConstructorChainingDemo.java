package com.oops.inheritance;

class Parent {
	static{
		System.out.println("parent static block");
	}
	{
		System.out.println("parent init block");
	}
	
	public Parent() {
		System.out.println("default const parent ");
	}
	
	public Parent(int a) {
		System.out.println("const parent with parameter");
	}
	
	void show() {
		System.out.println("show");
	}
}

class Child extends Parent {
	
	static {
		System.out.println("child static block");
	}
	
	{
		System.out.println("child init block");
	}
	
	public Child() {
		//this("abc");
		super();
		System.out.println("default const child");
	}
	
	public Child(String str) {
		//this();
		System.out.println("const child with parameter");
	}
	
	void display() {
		System.out.println("display");
	}
}

public class ConstructorChainingDemo {

	public static void main(String[] args) {
		Child c=new Child();
		c.show();
		c.display();
	}

}
