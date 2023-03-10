package com.basic;

public class VariableDemo2 {

	int mobile=5;//instance or object variable
	
	static int AC=6;//static or class variable
	
	public static void main(String[] args) {
		VariableDemo2 obj1=new VariableDemo2();
		obj1.mobile = 10;
		obj1.AC = 10;
		
		
		VariableDemo2 obj2=new VariableDemo2();
		obj2.mobile = 20;
		obj2.AC = 20;
		
		AC=40;
		
		System.out.println(obj1.mobile +" "+ obj1.AC); //10 20
		System.out.println(obj2.mobile +" "+ obj2.AC); //20 20
		
		show();
		
	}
	
	static void show() {
		System.out.println("show");
	}

}
