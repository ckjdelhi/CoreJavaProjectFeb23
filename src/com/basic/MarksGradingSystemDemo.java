package com.basic;

import java.util.Scanner;

public class MarksGradingSystemDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks:");
		
		int marks = sc.nextInt();
		System.out.println("Your marks: "+marks);
		
		if(marks<0 || marks>100) {
			System.out.println("Invalid marks");
		}else if(marks<=30) {
			System.out.println("Failed");
		}else if(marks>30 && marks<=40) {
			System.out.println("Passed");
		}else if(marks>40 && marks<=50) {
			System.out.println("Good");
		}else {
			System.out.println("Excellent");
		}
		
	}

}
