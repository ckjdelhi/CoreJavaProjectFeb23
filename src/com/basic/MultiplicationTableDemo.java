package com.basic;

import java.util.Scanner;

public class MultiplicationTableDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);//auto import: ctrl + shift+ o
		System.out.println("Enter start number: ");
		int start=sc.nextInt();
		
		System.out.println("Enter end number: ");
		int end=sc.nextInt();
		
		for(int j=start;j<=end; j++) {
			for(int i=1; i<=10;i++) {
				System.out.println(j +" x "+i +" = "+(j*i));
			}
			System.out.println();
		}
		
		
		
	}

}
