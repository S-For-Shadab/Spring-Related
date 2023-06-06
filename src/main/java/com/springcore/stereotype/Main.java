package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/stereotype/stereo.xml");
		Student st=con.getBean("obj",Student.class);
		System.out.println(st.getCity());
		st.setName("dljbdi");
		Student st1=con.getBean("obj",Student.class);
		System.out.println(st1);
	}

}
