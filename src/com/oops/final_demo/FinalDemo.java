package com.oops.final_demo;

/*
 * 'final' is non access modifier
 *		class: can't be extended
 *		method: can't be overridden
 *		variable: can't change the value
 */

class Test {
	int a =5;
	void show() {
		System.out.println("show");
	}
}

public class FinalDemo extends Test {

	public static void main(String[] args) {
		FinalDemo obj=new FinalDemo();
		obj.a = 10;
		System.out.println(obj.a);
		obj.show();
		
		
		String str="as";
	
		
		Integer i=10;
		int j=10;
		//int -> Integer, long - Long, float- Float, double-> Double
	}
//	
	void show() {
		System.out.println("display");
	}

}
