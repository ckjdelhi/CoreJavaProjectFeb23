package com.exception;

import java.util.Scanner;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		//String name =null;
//		int a = 5;
//		int b = 1;
//		
//		System.out.println(a+b);
//		System.out.println(a/b);//ArithmeticException
//		System.out.println(a*b);
//		System.out.println(a-b);
		
		//ExceptionDemo obj = new ExceptionDemo();
		//System.out.println(name.length()); //NullPointerException
		
		//String str ="Hello";
		//System.out.println(str.charAt(100));//StringIndexOutOfBoundsException
		
//		String s1="10";
//		String s2="abc";
//		System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2)); //NumberFormatException
//		
//		File f =new File("abc.txt");
//		try {
//			FileInputStream fs=new FileInputStream(f);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Scanner sc=new Scanner(System.in);
		int input =sc.nextInt();
		String str ="Hello";
//		if(input>=str.length()) {
//			System.out.println("wrong input");
//		}else {
//			System.out.println(str.charAt(input));
//		}
		
		int arr[] = new int[5];
		
		try {
			System.out.println(str.charAt(input));
			System.out.println(str.length());
			System.out.println(arr[2]);
		}catch (NullPointerException e) {
			System.out.println("string is null");
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("string index is not valid");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("wrong  arry index");
		} catch (Exception e) {
			System.out.println("wrong input");
		}finally {
			System.out.println("Finally block");
			sc.close();
		}
		
		
		
	}

}
