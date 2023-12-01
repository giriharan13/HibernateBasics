package com.giriharan.ExampleApp;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@ElementCollection
	@CollectionTable(name="classmates_table",joinColumns = @JoinColumn(name="sid"))
	@Column(name="classmates")
	@OrderColumn(name="pos")
	private List<String> classmates;
	
	

	public Student(String name, List<String> classmates) {
		this.name = name;
		this.classmates = classmates;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getClassmates() {
		return classmates;
	}

	public void setClassmates(List<String> classmates) {
		this.classmates = classmates;
	}
}
