package com.springcore.noxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Student")
public class Student {
	
	@Autowired
	private Samosa samosa;
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	public void study() {
		System.out.println(this.samosa.display());
		System.out.println("student is studying!");
	}
	
	
}
