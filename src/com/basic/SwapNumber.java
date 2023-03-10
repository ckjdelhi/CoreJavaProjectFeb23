package com.basic;

public class SwapNumber {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		System.out.println("Before swap: a="+a+" b="+b);
		//option-1: using 3rd variable
//		int temp= a;
//		a = b;
//		b = temp;
		
		//option-2: without 3rd variable
		
		a = a+b;// a =11,b=6
		b = a-b;// 11-6 = 5=>   a =11, b=5
		a = a-b;//11-5=6
		
		System.out.println("After swap: a="+a+" b="+b);
		
	}

}
