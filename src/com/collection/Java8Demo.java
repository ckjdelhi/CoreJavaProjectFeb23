package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8Demo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("India");
		list.add("Us");
		list.add("Uk");
		list.add("Nepal");
		list.add("Bhutan");
		
		for(String s: list) {
			if(s.startsWith("U")) {
				System.out.println(s);
			}
		}
		
		list.stream()
			//.filter(p-> p.startsWith("U"))
			.map(p -> p.toUpperCase())
			.sorted()
			.forEach(p -> System.out.println(p));
		
		
		//sorted(), Comparable, comparator
		
		int arr[] = {};
		int output =Arrays.stream(arr).reduce((x, y) -> x+y).orElse(0);
		System.out.println(output);
//		int sum =0;
//		for(int a: arr) {
//			sum +=a;
//		}
//		System.out.println(sum);
		
		
	}

}
