package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {
	private String name;

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("values are being set using property injection in Employee class!!!");
		this.name = name;
	}
	@PostConstruct
	public void start() {
		System.out.println("Init method is being called where all the starting file needs to be put in Employee class");
	}
	@PreDestroy
	public void end() {
		System.out.println("Destroy method is called after using the object  in Employee class");

	}
	
}
