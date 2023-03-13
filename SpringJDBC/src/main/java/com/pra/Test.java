package com.pra;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.pra.Student;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello Program started");
		ApplicationContext context=new ClassPathXmlApplicationContext("autoConfig.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		
		//insert
//		Student student=new Student();
//		student.setId(2634);
//		student.setName("Kritik");
//		student.setCity("Chandigarh");
//		int result = studentDao.insert(student);
//		System.out.println("No of query inserted : "+result);
		
		//update
//		Student student=new Student();
//		student.setId(2638);
//		student.setName("JaiDeep");
//		student.setCity("Kharar");
//		int r = studentDao.updates(student);
//		System.out.println("Student table updated : "+r);
		
		//delete
//		int r=studentDao.deleted(2648);
//		System.out.println("Row deleted "+r);
		
//		//select 1 data from db
//		Student student = studentDao.getStudent(2618);
//		System.out.println(student);
		
		//get multiple data
		List<Student> list=studentDao.getAllStudent();
		for(Student l:list)
		{
			System.out.println(l);
		}
		
	}

}
