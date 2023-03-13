package com.spring.jdbc.dao;

import java.util.*;
import com.spring.jdbc.pra.Student;

public interface StudentDao {
	public int insert(Student student);

	public int updates(Student student);

	public int deleted(int studentId);

	//single data
	public Student getStudent(int studentId);
	
	//multiple data
	public List<Student> getAllStudent();

}
