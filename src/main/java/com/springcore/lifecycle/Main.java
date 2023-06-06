package com.springcore.lifecycle;

 
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {


		
		/*
		 here we are implementing the spring bean life cycle 
	it is nothing but  when we call the object,then it makes it space in IoC container --> then put the value of property and field 
	-->then call its init() method   then --> we can use that object values -->after all this destroy() function will be called
	*/
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycle.xml");
//		Student st=(Student) context.getBean("student");
//		System.out.println(st);
 		Employee emp=(Employee) context.getBean("emp");
		System.out.println(emp);
		context.registerShutdownHook();
		 
		
		

	}

}
