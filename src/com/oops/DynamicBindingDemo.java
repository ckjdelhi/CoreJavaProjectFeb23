package com.oops;

class BaseClass {
	void show() {
		System.out.println("base class show");
	}
	
	void insert() {
		System.out.println("base class insert");
	}
}
class DerivedClass extends BaseClass{
	void display() {
		System.out.println("child class display");
	}
	
	void show() {
		System.out.println("child class show");
	}
}
public class DynamicBindingDemo {

	public static void main(String[] args) {
		
		BaseClass o1 = new BaseClass();
		o1.show();
		o1.insert();
		
		System.out.println("\n----child class---");
		DerivedClass o2=new DerivedClass();
		o2.show();
		o2.insert();
		o2.display();
		
		System.out.println("--------Dynamic binding----");
		BaseClass o3 = new DerivedClass();
		o3.insert();
		o3.show();
		//o3.display();
		
		//not work
//		DerivedClass o4 = (DerivedClass) new BaseClass();
//		o4.insert();
//		o4.show();
//		o4.display();
		
	}

}
