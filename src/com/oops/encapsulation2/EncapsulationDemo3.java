package com.oops.encapsulation2;

import com.oops.encapsulation.EncapsulationDemo;

public class EncapsulationDemo3 extends EncapsulationDemo {

	public static void main(String[] args) {
		EncapsulationDemo obj=new EncapsulationDemo();
		//obj.show();
		//System.out.println(obj.defaultA);
		//System.out.println(obj.privateB);
		//System.out.println(obj.protectedC);
		System.out.println(obj.publicD);
		
		
		EncapsulationDemo3 obj1=new EncapsulationDemo3();
		obj1.show();
		//System.out.println(obj1.defaultA);
		//System.out.println(obj1.privateB);
		System.out.println(obj1.protectedC);
		System.out.println(obj1.publicD);
				

	}

}
