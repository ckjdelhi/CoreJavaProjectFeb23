package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Sort()-> String & all wrapper classes only(Integer, Long, Byte, Float..)
public class SortingDemo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("India");
		list.add("US");
		list.add("UK");
		list.add("Nepal");
		list.add("Bhutan");
//		System.out.println("Before sorting: "+ list);
//		Collections.sort(list,Collections.reverseOrder());
//		//List<String> list1 = list.stream().sorted().collect(Collectors.toList());
//		System.out.println("After sorting:" +list);
//		//System.out.println(list1);
		
		
		//Comparable: used to perform default sorting
		//Comparator: used to perform custom sorting
		
		List<Student> studentList=new ArrayList<>();
		studentList.add(new Student(110, "Chandan", "Java"));
		studentList.add(new Student(101, "Ajay", "Oracle"));
		studentList.add(new Student(100, "Ram", "Database"));
		studentList.add(new Student(120, "Mohan", "Python"));
		
		System.out.println("Before Sorting");
		studentList.forEach(s -> System.out.println(s.getStuId()+"\t"+ s.getName()+"\t"+s.getCourse()));
		Collections.sort(studentList);
		System.out.println("\nAfter sorting: default by stuId DESC");
		studentList.forEach(s -> System.out.println(s.getStuId()+"\t"+ s.getName()+"\t"+s.getCourse()));
		
		//Custom sorting: Comparator
		System.out.println("\nAfter sorting: custom sorting by Name ASC");
		Collections.sort(studentList, new CompareStudentNameByASC());
		studentList.forEach(s -> System.out.println(s.getStuId()+"\t"+ s.getName()+"\t"+s.getCourse()));

		System.out.println("\nAfter sorting: custom sorting by Course ASC");
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getCourse().compareTo(o2.getCourse());
			}
		});
		studentList.forEach(s -> System.out.println(s.getStuId()+"\t"+ s.getName()+"\t"+s.getCourse()));
		
		System.out.println("\nAfter sorting: custom sorting by Course DESC");
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.getCourse().compareTo(o1.getCourse());
			}
		});
		studentList.forEach(s -> System.out.println(s.getStuId()+"\t"+ s.getName()+"\t"+s.getCourse()));
		
		
		System.out.println("\nAfter sorting: java 8 sorted by student id DESC");
		studentList.stream()
			.sorted((a,b)->b.getStuId()-a.getStuId())
			.forEach(s -> System.out.println(s.getStuId()+"\t"+ s.getName()+"\t"+s.getCourse()));
		
	}

}
