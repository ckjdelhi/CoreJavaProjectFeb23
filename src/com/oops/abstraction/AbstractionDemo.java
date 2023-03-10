package com.oops.abstraction;

/*
 * Abstraction:means hiding the implementation
 * 1. abstract class(0 to 100% abstraction)
 * 2. interface(100% abstraction)
 */
/*
 * Abstract class:
 * 1. use 'abstract' non access modifiers to class name
 * 2. we can have abstract method and non abstract method(concrete method)
 * 3. abstract method doen't have body
 * 4. we can't create object of abstract class
 * 5. using inheritance we can access class methods and variables
 * 6. child class must give the implementation of abstract method
 */

/*
 * Interface:
 * 1. use 'interface' keyword instead of 'class'
 * 2. interface is 100% abstraction
 * 3. all methods are by default abstract and public
 * 4. all variables are by default 'final' or constant type
 * 5. you can't create object of interface
 * 6. you have to always 'implements' interface
 */



public class AbstractionDemo extends AbstractDemo implements InterfaceDemo, InterfaceDemo2{

	public static void main(String[] args) {
		
		//AbstractDemo obj1=new AbstractDemo();
		
		AbstractionDemo obj= new AbstractionDemo();
		obj.show();
		obj.display();
		//System.out.println(obj.add(10, 20));
		obj.display();
		InterfaceDemo.show();

	}


	
	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void display1s() {
		// TODO Auto-generated method stub
		
	}

}
