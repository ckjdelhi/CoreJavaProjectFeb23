package com.oops.abstraction;

public class IntefaceTest implements InterfaceDemo, InterfaceDemo2{

	public static void main(String[] args) {
	
		IntefaceTest obj= new IntefaceTest();
		obj.insert();
		obj.delete();
		
		obj.display();
		InterfaceDemo.show();

	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

}
