package com.constructorInjec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/constructorInjec/constInjConfig.xml");
		Person p=(Person)context.getBean("person1");
		System.out.println(p);
	}

}
