package com.giriharan.HibernateSetup;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class student {
	
	@Id
	@Column(name="rollNo")
	private int roll;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private int age;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
