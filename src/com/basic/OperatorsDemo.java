package com.basic;

public class OperatorsDemo {

	public static void main(String[] args) {
		//int a = 20;
		//int b = 6;
		
		//Arithmetic Operator(+, -, *, /, %(modules))
		
		//System.out.println(a + b+"hi"+2+3);//2+2+hi+2+3=>5hi23
//		System.out.println(a-b); //-1
//		System.out.println(a / b); //3
//		System.out.println(a % b); //2
//		System.out.println(a % 2);// if output is 0 = even, else = odd
		
		//Unary Operator(+(positive), -(negative), ++(pre/post increment), --(pre/post decrement), !(negation))
		//boolean b= true;
		//System.out.println(!b);
		
//		int a = 3;
//		a--; // a = a-1
//		a--;
//		a--;
//		System.out.println(a);
		
//		int a=3;
//		++a;
//		++a;
//		++a;
//		System.out.println(a);
		
//		int a = 3;//5
//		System.out.println(a++ + ++a);//3 + 5 = 8
		
//		int num = 2;      
//		System.out.println(++num + ++num + --num);//3 + 4 + 4
		
		
		//Assignment Operator (=)
		
		//Relational Operator(<,>,<=,>=,==, !=): output of relational operator is in boolean(true/false)
//		System.out.println(5>6);//false
//		System.out.println(4==3);//false
//		System.out.println(4!=3);//true
		
		//Logical Operator(&&, ||): output of logical operator is in boolean 
		//System.out.println(5>3 || 5>6);//false
		/*
		 &&(AND)
		 true && true = true
		 true && false = false
		 false && true = false
		 false && false = false
		 
		 ||(OR)
		 true || true = true
		 true || false = true
		 false || true = true
		 false || false = false
		 */
		
		//Ternary Operator(condition ? true part : false part)
//		int a = 5;//true= even, false=odd
//		System.out.println(a % 2 == 0 ? "Even number" : "Odd number");
//		
//		if(a%2==0) {
//			System.out.println("Even number");
//		}else {
//			System.out.println("Odd number");
//		}

		
		//Bitwise operator(&, |)
		int a =50;
		int b =6;
		System.out.println(a | b);//4
		System.out.println(a & 1);//even or odd
		
		
		//Shift operator(<<, >>)
		int a1 = 10;
		int b1 = 3;
		System.out.println(a1 >> b1);
		
		System.out.println(Integer.toBinaryString(80));
		
	}

}

