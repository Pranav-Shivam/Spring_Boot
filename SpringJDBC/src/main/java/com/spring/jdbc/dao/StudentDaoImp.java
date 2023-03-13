package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.pra.Student;

public class StudentDaoImp implements StudentDao {
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Student student) {
		// insert query
		String query = "insert into student(id,name,city) values(?,?,?)";
		// fire query
		int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int updates(Student student) {
		// TODO Auto-generated method stub
		String query = "update student set name= ? , city= ? where id=?";
		int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return r;
	}

	@Override
	public int deleted(int studentId) {
		String query = "delete from student where id=?";
		int r = this.jdbcTemplate.update(query, studentId);
		return r;
	}

	@Override
	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		// using anonymous class
//		Student student1 =(Student) this.jdbcTemplate.queryForObject(query, new RowMapper<Object>() {
//			@Override
//			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//
//				// TODO Auto-generated method stub
//				Student student = new Student();
//				student.setId(rs.getInt(1));
//				student.setName(rs.getString(2));
//				student.setCity(rs.getString(3));
//
//				return student;
//			}
//		},studentId);
		return student;
	}

	@Override
	public List<Student> getAllStudent() {

		String query = "select * from student";
		List<Student> student = this.jdbcTemplate.query(query, new RowMapperImpl());
		return student;
	}

}
