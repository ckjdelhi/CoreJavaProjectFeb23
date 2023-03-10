package com.array;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String args[]) {
		
		//Array is a collection of similar data types
		
		//int arr[] = {30,20, 30,40, 50};
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter length of Array:");
//		int length = sc.nextInt();
//		
		//int arr[] = new int[5]; //1D array
		//int []arr = new int[5];
		int[] arr = new int[5];
		arr[0] = 30;
		arr[1] = 10;
		arr[2] = 20;
		arr[3] = 30;
		arr[4] = 40;
		 
		
		//arr[5] = 50;//Error
		//System.out.println(arr[5]);//Error
		System.out.println("--------for");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("---------while");
		int index =0;
		while(index<arr.length) {
			System.out.println(arr[index]);
			index++;
		}
		//for each loop or enhanced for loop
		System.out.println("-------for each");
		for(int var:arr) {
			System.out.println(var);
		}
		
		
		String []strArr = {"India", "US", "UK"};
		for(String abc:strArr ) {
			System.out.println(abc);
		}

	}

}
