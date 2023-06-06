package com.springcore.autowire_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowire_annotation/annotationautowire.xml");
		A a=(A) context.getBean("a2");
		System.out.println(a);
	}

}
