package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/collection/standaloneconfig.xml");
		Person a=(Person) context.getBean("person1");
		System.out.println(a.getCourse().getClass().getName());//this will print the class of map and list which we mentioned in the config file and it is bing reused
		System.out.println(a.getFriends().getClass().getName());
		

 
	}

}
