package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autoConfig.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//		 Student st1=new Student(2638,"Jai Deep","Chandigarh");
//		 studentDao.insert(st1);
		// get a student
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go = true;
		while (go) {
			System.out.println("Press 1 for add new Student");
			System.out.println("Press 2 for getting details of a student");
			System.out.println("Press 3 for get all details of all Students");
			System.out.println("Press 4 for delete student");
			System.out.println("Press 5 for update student");
			System.out.println("Press 6 for exit");
			try {
				int input = Integer.parseInt(br.readLine());
				switch (input) {

				case 1:
					System.out.println("\nPress 1 for add new Student\n");
					System.out.println("Enter student details");
					System.out.println("Enter student ID:");
					int sId = Integer.parseInt(br.readLine());
					System.out.println("Enter student Name:");
					String sName = br.readLine();
					System.out.println("Enter student City:");
					String sCity = br.readLine();
					Student std = new Student(sId, sName, sCity);
					studentDao.insert(std);
					System.out.println("1 Student inserted ");
					System.out.println("********************************************");
					System.out.println("\n");
					break;
				case 2:
					System.out.println("Press 2 for getting details of a student");
					System.out.println("Enter student ID:");
					Long sid = Long.parseLong(br.readLine());
					System.out.println("this is case 2");
					Student std1 = studentDao.getStudent(sid);
					if(std1!=null)
					{
						System.out.println("yes");
					}
					else
					{
						System.out.println("no");
					}
					break;
				case 3:
					System.out.println("Press 3 for get all details of all Students");
					List<Student> list = studentDao.getAllStudent();
					for (Student l : list) {
						System.out.println("Name : " + l.getStudentName());
						System.out.println("Id : " + l.getStudentId());
						System.out.println("City : " + l.getStudentCity());
					}
					break;
				case 4:
					System.out.println("Press 4 for delete student");
					System.out.println("Enter student ID:");
					Long si = Long.parseLong(br.readLine());
					Student st1=studentDao.getStudent(si);
					System.out.println(st1);
					break;
				case 5:
					System.out.println("Press 5 for update student");
					break;
				case 6:
					System.out.println("Press 6 for exit");
					go = false;
					break;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
