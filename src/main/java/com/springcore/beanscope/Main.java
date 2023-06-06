package com.springcore.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/beanscope/beanscope.xml");
		Student st=(Student) con.getBean("obj");
		Student st1=(Student) con.getBean("obj");
		
		System.out.println(st.hashCode()+"   "+st1.hashCode());   ///their hashcode will be different because each time new object will be created
		
	}

}
