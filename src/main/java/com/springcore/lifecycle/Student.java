package com.springcore.lifecycle;

public class Student {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("values are being set using property injection in Student class!!!");
		this.name = name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	public void init() {
		System.out.println("Init method is being called where all the starting file needs to be put in Student class");
	}
	public void destroy() {
		System.out.println("Destroy method is called after using the object  in Student class");
	}

}
