package com.basic;

//static block -> main method -> init block -> constructor -> normal method
public class StaticBlock {
	
	//Constructor : special type of method. it should be same as class name and without return type
	StaticBlock() {
		System.out.println("constructor -1");
	}
	
	static {
		System.out.println("static block-1");
	}
	
	static {
		System.out.println("static block-2");
	}
	
	{
		System.out.println("Init block -1");
	}
	
	{
		System.out.println("Init block -2");
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		
		StaticBlock o1=new StaticBlock();
		o1.show();
		
		StaticBlock o2=new StaticBlock();
		o2.show();
		
		StaticBlock o3=new StaticBlock();
		o3.show();
	}
	
	void show() {
		System.out.println("show");
	}

	static {
		System.out.println("static block-3");
	}
	
	{
		System.out.println("Init block -3");
	}
}
