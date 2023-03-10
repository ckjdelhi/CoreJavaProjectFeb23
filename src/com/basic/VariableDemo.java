package com.basic;

public class VariableDemo {

	//Global Variable
	int c=5; //instance variable
	static int d=5; //static variable
	
	public static void main(String[] args) {
		
		int a = 5;//local variable, declared within the method
		System.out.println(a);
		
		System.out.println(d);
		
		VariableDemo obj=new VariableDemo();
		System.out.println(obj.c);
		
		VariableDemo obj2=new VariableDemo();
		System.out.println(obj2.c);
	}
	
	void show() {
		int b = 5;
		System.out.println(b);
		
		System.out.println(c);
		System.out.println(d);
	}

}
