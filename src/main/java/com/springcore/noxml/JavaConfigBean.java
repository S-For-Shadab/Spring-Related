package com.springcore.noxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigBean {
	
	
	@Bean(name= {"samosa","sam"})
	public Samosa getSamosa() {
		return new Samosa();
	}

	
	@Bean(name= {"getStudent1","student1"})
	public Student1 getStudent1() {
		
		Student1 st=new Student1(getSamosa());
		return st;
	}
}
