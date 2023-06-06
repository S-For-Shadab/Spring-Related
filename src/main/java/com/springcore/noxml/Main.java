package com.springcore.noxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		 ApplicationContext con=new AnnotationConfigApplicationContext(JavaConfig.class);
		 Student st=con.getBean("Student",Student.class);
		 System.out.println("Implementation without bean \n");
		 st.study();
		 System.out.println("-++++++++++++++++++++++++++++++++++-");
		 System.out.println("Implementation with bean \n");
		 ApplicationContext con1=new AnnotationConfigApplicationContext(JavaConfigBean.class);
		 Student1 stu=(Student1) con1.getBean("student1",Student1.class);
		 stu.display();
		 System.out.println(stu.getDummy());
		 

	}

}
