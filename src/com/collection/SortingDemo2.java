package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingDemo2 {

	public static void main(String[] args) {
		List<Student> studentList=new ArrayList<>();
		studentList.add(new Student(110, "Chandan", "Java"));
		studentList.add(new Student(101, "Ajay", "Oracle"));
		studentList.add(new Student(100, "Ram", "Database"));
		studentList.add(new Student(120, "Mohan", "Python"));
		
	//	List<Student> list = studentList.stream()
	//									.sorted((a,b)->a.getStuId()-b.getStuId())
	//									.collect(Collectors.toList());
		
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return String.valueOf(o2.getStuId()).compareTo(String.valueOf(o1.getStuId())); //DESC
			}
		});

		System.out.println(studentList);
	}

}
