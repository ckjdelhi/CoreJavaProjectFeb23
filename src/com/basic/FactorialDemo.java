package com.basic;

public class FactorialDemo {

	public static void main(String[] args) {
		int num = 7;
		
		//fact = 5 x 4 x 3 x 2 x 1 = 120 x 6 = ? x7 = 5040
		int fact =1;
		for(int i=1; i<=num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial = "+fact);
	}

}
