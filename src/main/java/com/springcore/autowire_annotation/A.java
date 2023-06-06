package com.springcore.autowire_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

 //if autowire is put above setter then it will help executing all the lines of code in setter

public class A {
	@Autowired     // this annotation can be auto injected above properties,constructor or setters in a class
	@Qualifier("temp1")  //this qualifier is used in case many bean of same type is present so just give name of which bean we wants to inject
	private B obj;

	public A() {
		super();
		 
	}

	public B getObj() {
		return obj;
	}

	public A(B obj) {
		super();
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "A [obj=" + obj + "]";
	}

	public void setObj(B obj) {
		this.obj = obj;
	}

}
