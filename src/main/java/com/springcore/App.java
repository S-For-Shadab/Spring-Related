package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//please see me i am changing something here
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/config.xml");
    	Student  s1=(Student) context.getBean("student3");
    	System.out.println(s1.toString());
        
    }
}
