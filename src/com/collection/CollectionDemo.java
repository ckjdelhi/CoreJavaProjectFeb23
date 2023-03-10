package com.collection;

import java.util.*;


public class CollectionDemo {
	
	public static void main(String[] args) {
		CollectionDemo d = new CollectionDemo();

		
		String []str=new String[3]; //fixed
		str[0]="A";
		str[1]="A";
		str[2]="B";
		System.out.println(str);
		
		
		ArrayList<String> obj=new ArrayList<>();//dynamic
		obj.add("B");
		obj.add("A");
		obj.add("C");
		obj.add("C");
		obj.add("B");
		Collections.sort(obj);
		System.out.println(obj);
		
		HashSet<String> obj4=new HashSet<>();//unordered
		obj4.add("D");
		obj4.add("A");
		obj4.add("B");
		obj4.add("C");
		obj4.add("C");
		
		System.out.println(obj4);
		
		LinkedHashSet<String> obj2=new LinkedHashSet<>();//ordered
		obj2.add("B");
		obj2.add("A");
		obj2.add("C");
		obj2.add("C");
		
		System.out.println(obj2);
		
		
		TreeSet<String> obj3=new TreeSet<>();//sorted set
		obj3.add("D");
		obj3.add("A");
		obj3.add("B");
		obj3.add("C");
		obj3.add("C");
		
		System.out.println(obj3);
		
		HashMap<String,String> m=new HashMap<>();
		m.put("name", "chandan");
		m.put("age", "20");
		m.put("salary", "5000");
		m.put("name", "kumar");
		System.out.println(m);
		
	}

}
