package com.spring.orm.dao;

import java.io.Serializable;
import java.util.List;


import jakarta.persistence.*;
import jakarta.transaction.*;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.orm.entities.Student;


@Repository
public class StudentDao {

	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int insert(Student student) {
		hibernateTemplate.persist(student);
		return 1;
	}

	// Get a student from the table
	
	public Student getStudent(Long studentId) {
		System.out.println("Getting data before");
		Student student = this.hibernateTemplate.get(Student.class,studentId);
		//System.out.println("Getting data after");
		
		return student;
	}

	// Get a student from the table
	@Transactional
	public List<Student> getAllStudent() {
		List<Student> student=null;
		try {
			student = this.hibernateTemplate.loadAll(Student.class);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return student;
	}

	// Delete a student
	@Transactional
	public void deleteStudent(int id) {
		Student std = this.hibernateTemplate.get(Student.class, id);
		this.hibernateTemplate.delete(std);
		return;
	}

	// update a student
	@Transactional
	public void updateStudent(Student std) {
		this.hibernateTemplate.update(std);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public StudentDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

}
