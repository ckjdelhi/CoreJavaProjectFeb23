package com.basic;
/*
 * Data types:
 * 1. Primitive(fixed size): boolean(1 bit), char(2 bytes),byte(1 byte), short(2 bytes), 
 *                           int(4 bytes), long(8 bytes), float(4 bytes), double(8 bytes)
 * 2. Non-Primitive(non fixed size): string, array..
 */
/*
 * 0 or 1 = 1 bit
 * 8 bits  = 1 byte
 * 1024 bytes = 1 Kilo Byte
 * 1024 KB = 1 mega byte
 * 1024 MB = 1 giga byte
 * 1024 GB = 1 tera byte
 */

//total = 15+ 15+15 = 45x100 = 4500 bytes
public class DataTypesDemo {

	int a =5; //4 bytes
	long b = 6; //8 bytes
	char c ='A';//2 bytes
	byte y = 127;//1 byte
	
	public static void main(String[] args) {

		for(int i=1; i<=100;i++) {
			DataTypesDemo o1 = new DataTypesDemo(); //15 bytes
			DataTypesDemo o2 = new DataTypesDemo(); //15 bytes
			DataTypesDemo o3 = new DataTypesDemo(); //15 bytes
		}
		
		
	}

}
