package com.array;

public class Array2D {

	public static void main(String[] args) {
		int [][]arr = new int[5][3]; //[row] x [col]
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		arr[1][0] = 10;
		arr[1][1] = 20;
		arr[1][2] = 30;
		
		arr[2][0] = 10;
		arr[2][1] = 20;
		arr[2][2] = 30;
		
		arr[3][0] = 10;
		arr[3][1] = 20;
		arr[3][2] = 30;
		
		arr[4][0] = 10;
		arr[4][1] = 20;
		arr[4][2] = 30;
		
//		System.out.println("No of Rows="+arr.length);
//		System.out.println("No of Cols="+arr[2].length);
		
		for(int i=0; i<arr.length; i++) { //rows
			for(int j=0; j<arr[i].length; j++) { //colums
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int []a:arr) {//row
			for(int value:a) {//col
				System.out.print(value+" ");
			}
			System.out.println();
		}
		for(int []abc:arr) {
			for(int xyz:abc) {
				System.out.print(xyz+" ");
			}
			System.out.println();
		}
		
		int [][]arrr = {
				{10, 20},
				{20, 30, 40}
		};
		
		String []strArr = {"India", "US", "UK"};
		String [][]str2DArr = {
				{"India", "UK"}, 
				{"India", "US", "UK"}, 
				{"India", "US", "UK", "Japan"}
			};
		System.out.println("No of Rows="+str2DArr.length);
		System.out.println("No of Cols="+str2DArr[0].length);
		
		for(String []row:str2DArr) {
			for(String col:row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
		for(int i=0; i<str2DArr.length;i++) {
			for(int j=0;j<str2DArr[i].length;j++) {
				System.out.println(str2DArr[i][j]);
			}
		}
		
		
	}

}
