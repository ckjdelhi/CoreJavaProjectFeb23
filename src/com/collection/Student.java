package com.collection;

public class Student implements Comparable<Student>{
	private int stuId;
	private String name;
	private String course;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int stuId, String name, String course) {
		super();
		this.stuId = stuId;
		this.name = name;
		this.course = course;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", name=" + name + ", course=" + course + "]";
	}
	//+ve: big number
	//0 : no sorting
	//-ve: small number
	@Override
	public int compareTo(Student in) {
		//return this.getStuId()-in.getStuId(); //ASC order by stuId
		return in.getStuId()-this.getStuId(); //DESC order by stuId
		//return this.getName().compareTo(in.getName()); //ASC order by student name
	}
	
}
