package com.basic;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		
		System.out.println("*****Welcome to booking.com******");
		System.out.println("1. New Booking");
		System.out.println("2. Update booking");
		System.out.println("3. Delete booking");
		System.out.println("4. Search booking");
		System.out.println("5. Exit");
		System.out.println("Choose any option:");
		
		Scanner sc=new Scanner(System.in);
		int option = sc.nextInt();
		
		switch(option) {
			case 1:
				System.out.println("You have selected option to book new ticket");
				break;
			case 2:
				System.out.println("You have selected option to update exising ticket");
				break;
			case 3:
				System.out.println("You have selected option to delete ticket");
				break;
			case 4:
				System.out.println("You have selected option to Search ticket");
				break;
			case 5:
				System.out.println("Exit...");
				break;
			default:
				System.out.println("Wrong option");
				break;
				
		}

	}

}
