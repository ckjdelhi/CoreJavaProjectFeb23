package com.oops.encapsulation;


/*
 * Access Modifiers:
1. default : within same class, within same package, outside package not accessible 
2. private: within same class only
3. protected: within same class, within same package, outside package is accessible using inheritance only
4. public: within same class, within same package, with another package or anywhere

 */
public class EncapsulationDemo {
	

	int defaultA = 5; //default Access modifiers
	private int privateB = 5;//private
	protected int protectedC =5;//protected
	public int publicD = 5; //public
	
	protected void show() {
		System.out.println("show");
	}

	public static void main(String[] args) {
		
		String s=new String("abc");
		System.out.println(s);
		
		EncapsulationDemo obj=new EncapsulationDemo();
		obj.show();
		System.out.println(obj.defaultA);
		System.out.println(obj.privateB);
		System.out.println(obj.protectedC);
		System.out.println(obj.publicD);
		
		
		System.out.println(obj);

		
		Employee empObj = new Employee(100, "Chandan", "Kumar", "India", 100, 100);
		System.out.println(empObj.getEmpId() +" "+ empObj.getFirstName() +" "+ empObj.getSalary());
		
		Employee empObj2=new Employee();
		empObj2.setEmpId(101);
		empObj2.setFirstName("Ram");
		empObj2.setLastName("");
		empObj2.setZipCode(100);
		empObj2.setSalary(100);
		
		System.out.println(empObj);
		
		
		Employee empNameArray[]=new Employee[100];
		empNameArray[0] =new Employee(100, "Chandan", "Kumar", "India", 100, 100);
		empNameArray[1] =new Employee(100, "Ram", "Kumar", "India", 100, 100);
		
		
	}

}
