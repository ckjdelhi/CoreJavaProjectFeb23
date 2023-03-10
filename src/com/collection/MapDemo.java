package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> zipCodes = new HashMap<>(); //ctrl+shift+o
		zipCodes.put(110000,"New Delhi");
		zipCodes.put(110010,"Patel Nagar");
		zipCodes.put(110058,"Uttam Nagar");
		zipCodes.put(201301,"Noida");
		
		System.out.println(zipCodes.get(110058));
		
		//All keys
		System.out.println(zipCodes.keySet());
		for(Integer key:zipCodes.keySet()) {
			System.out.println(key +" "+zipCodes.get(key));
		}
		zipCodes.keySet().forEach(p -> System.out.println(p));
		
		
		//All values
		System.out.println(zipCodes.values());
		//all Key and values
		System.out.println(zipCodes.entrySet());
		for(Entry<Integer, String> entry: zipCodes.entrySet()) {
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}
		
		

	}

}
