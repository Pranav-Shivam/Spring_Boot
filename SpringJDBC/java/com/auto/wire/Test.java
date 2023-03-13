package com.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/auto/wire/autoConfig.xml");

		Emp e2=(Emp)context.getBean("emp1");
		Emp e1=context.getBean("emp1", Emp.class);
		System.out.println(e2);
	}

}
