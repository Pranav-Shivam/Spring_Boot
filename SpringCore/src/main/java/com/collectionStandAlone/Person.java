package com.collectionStandAlone;

import java.util.*;

public class Person {
	private List<String> friends;
	private Map<String, Integer> feeStructure;
	private Properties props;

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}

	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Person(List<String> friends, Map<String, Integer> feeStructure, Properties props) {
		super();
		this.friends = friends;
		this.feeStructure = feeStructure;
		this.props = props;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feeStructure=" + feeStructure + ", props=" + props + "]";
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

}
