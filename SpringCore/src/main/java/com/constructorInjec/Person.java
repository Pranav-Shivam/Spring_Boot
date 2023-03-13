package com.constructorInjec;

public class Person {
	private int personId;
	private String personName;
	private Certi certi;

	public Person(int personId, String personName, Certi certi) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", certi=" + certi + "]";
	}

}
