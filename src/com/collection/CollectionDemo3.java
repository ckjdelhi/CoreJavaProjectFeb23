package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemo3 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("India");
		list.add("US");
		list.add("UK");
		list.add("Nepal");
		list.add("Bhutan");
		
		System.out.println(list);
		//for, while, do-while, for each, forEach(), iterator, listIterator
		System.out.println("-----using for loop--------");
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-----using for each loop--------");
		for(String str:list) {
			System.out.println(str);
		}
		
		System.out.println("-----using for each loop >=java8--------");
		list.stream().forEach(a -> System.out.println(a));
		list.forEach(a -> System.out.println(a));
		
		System.out.println("-----using iterator--------");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String s=itr.next();
			System.out.println(s);
		}
		System.out.println("-----using list iterator--------");
		ListIterator<String> listItr = list.listIterator();
		while(listItr.hasNext()) {
			String s=listItr.next();
			System.out.println(s);
		}
		while(listItr.hasPrevious()) {
			String s=listItr.previous();
			System.out.println(s);
		}
		
	}

}
