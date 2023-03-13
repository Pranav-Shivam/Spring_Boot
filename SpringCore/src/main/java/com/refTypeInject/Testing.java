package com.refTypeInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/refTypeInject/refConfig.xml");
		
		A a=(A)context.getBean("aref");
		B b=(B)context.getBean("bref");
		System.out.println(a+" :: "+b);
		
	}

}
