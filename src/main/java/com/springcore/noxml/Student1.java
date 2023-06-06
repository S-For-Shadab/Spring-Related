package com.springcore.noxml;

import org.springframework.beans.factory.annotation.Value;

public class Student1 {
	
	private Samosa samosa;
	
	public Student1(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public void display() {
		System.out.println(this.samosa.display());
		System.out.println("Hey there i am student class being made by @Bean annotation");
	}
	@Value("78")
	private int dummy;

	public int getDummy() {
		return dummy;
	}

	public void setDummy(int dummy) {
		this.dummy = dummy;
	}
	

}
