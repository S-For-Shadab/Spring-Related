package com.springcore.beanscope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/*
 * Theory:-      Spring Bean scope
 * 
 * 1)Singleton --means only one object will be created and it will be passes everytime someone ask for new object
 * 2)Prototype --means everytime a new object will be created and will be passed on
 * 3)Session and Request are used in webapps
 * 4)Global session i dont know  ><
 * 
 * 
 * 
 * */

@Component("obj")
@Scope("prototype")
public class Student {
	@Value("suuuuu")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
