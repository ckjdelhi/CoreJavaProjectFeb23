package com.array;

import java.util.ArrayList;

public class Array3D {

	
	public static void main(String[] args) {
		
		//int [][][]arr3d=new int[3][5][3]; //dim x row x col
		
		String str="abc";
		System.out.println(str);
		
		Array3D obj=new Array3D();
		System.out.println(obj);
		
		ArrayList list=new ArrayList<>();
		list.add("A");
		System.out.println(list);
		
		int [][][]arr3d= {
				{
					{3,2,1},
					{1,2,1},
					{2,3,4}
				},
				{
					{3,2,1},
					{1,2,4},
					{2,3,4}
				}
		};
		
		System.out.println(arr3d);
		
		for(int [][]dim:arr3d) {
			for(int []row:dim) {
				for(int col:row) {
					System.out.print(col +" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		//HW- while & for loop
		
	}
	
	@Override
	public String toString() {
		return "Array3D class";
	}

}
