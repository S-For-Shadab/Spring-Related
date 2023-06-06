package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/constructorinjection/constructorinjection.xml");
		A obj=(A) context.getBean("aref");
		System.out.println(obj);
		Ambiguity amb=(Ambiguity) context.getBean("ambiguity");
		amb.doSum();
	}

}
