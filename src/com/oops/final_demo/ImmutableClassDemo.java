package com.oops.final_demo;

import java.util.ArrayList;

/**
 * Immutable class rules:
 * 1. make class as final
 * 2. make all variables as private and final
 * 3. remove default constructor and add parameterized constructor
 * 4. remove all setter methods 
 * 5. if we have mutable variable then apply deep cloning 
 */
final class Employee {
	private final int empId;
	private final String name;
	private final ArrayList<String> list;
	
	public Employee(int empId, String name, ArrayList<String> list) {
		this.empId = empId;
		this.name = name;
		
		ArrayList<String> list1=new ArrayList<>();
		for(String l : list) {
			list1.add(l);
		}
		
		this.list = list1;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<String> getList() {
		return list;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}
}


public class ImmutableClassDemo  {
	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("A");
		l1.add("B");
		Employee e1=new Employee(100, "abc", l1);
		
		e1.getList().add("C");
		
		System.out.println(e1.getEmpId() +" "+e1.getName() + " "+ l1);
		
		
//		
//		Employee e2= new Employee(100, "abc");
//		System.out.println(e2.getEmpId() +" "+e2.getName());
//		
//		System.out.println(e1 == e2);
//		
	}

}
