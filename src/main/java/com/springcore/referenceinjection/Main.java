package com.springcore.referenceinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/referenceinjection/referenceinjection.xml");
		A obj=(A) context.getBean("aref1");
		System.out.println(obj);
		

	}

}
