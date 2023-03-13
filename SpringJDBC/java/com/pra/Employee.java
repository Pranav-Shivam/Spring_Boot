package com.pra;

import java.util.*;

public class Employee {
	private String name;
	private List<String> phone;
	private Set<String> address;
	private Map<String, Integer> course;

	public Employee(String name, List<String> phone, Set<String> address, Map<String, Integer> course) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.course = course;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public Map<String, Integer> getCourse() {
		return course;
	}

	public void setCourse(Map<String, Integer> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", phone=" + phone + ", address=" + address + ", course=" + course + "]";
	}

}
