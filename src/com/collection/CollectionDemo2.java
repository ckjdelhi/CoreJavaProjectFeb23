package com.collection;

import java.util.*;

public class CollectionDemo2 {

	public static void main(String[] args) {
		List<String> list2=new ArrayList<>();
		list2.add("India");
		list2.add("US");
		list2.add("UK");
				
		List<String> list=new ArrayList<>();
		list.add("India");
		list.add("US");
		list.add("UK");
		list.add("Nepal");
		list.add("Bhutan");
		System.out.println(list);
		list.add(0, "Pak");
		System.out.println(list);
		System.out.println(list.size());
		list.addAll(list2);
		
		System.out.println(list);
		
		System.out.println(list.contains("US"));
		System.out.println(list.get(1));
		System.out.println(list.indexOf("UK"));
		list.remove("Pak");
		System.out.println(list);
		
	}

}
