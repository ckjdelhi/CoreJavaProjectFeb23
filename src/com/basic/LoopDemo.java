package com.basic;

/*
 * Loops:
 * 1. While
 * 2. do-while
 * 3. for 
 */
public class LoopDemo {

	public static void main(String[] args) {
		int x = 5;
		do {
			System.out.println(x); //5 6
			++x;
			System.out.println(x);//6 7
		}while(x==6); 
		x++;

//		int i=10;
//		while(i>0) {
//			System.out.println(i);
//			i--;
//		}
		//ctrl + / : to comment/uncomment
		
		int j=100;
		while(j<=10) {
			System.out.println(j);
			j++;
		}
		
		int k=100;
		do {
			System.out.println(k);
			k++;
		}while(k<=10);
		
		System.out.println("For loop...........");
		int i=1;
		for(;i<=10;) {
			System.out.println(i);
			i++;
		}

	}

}
